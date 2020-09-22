package com.youlai.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youlai.admin.api.entity.SysResource;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SysResourceMapper extends BaseMapper<SysResource> {

    @Select("SELECT e.id,e.name, e.perms  " +
            "    FROM  sys_user a " +
            "    INNER JOIN sys_user_role b ON b.user_id = a.id " +
            "    INNER JOIN sys_role c ON c.id = b.role_id " +
            "    INNER JOIN sys_role_permission d ON d.role_id = c.id " +
            "    INNER JOIN sys_permission e ON e.id = d.permission_id " +
            "    WHERE a.id =#{userId}")
    List<SysResource> listByUserId(Integer userId);


    @Select(" select id,name,url from sys_resource ")
    @Results({
            @Result(id=true, column="id", property="id"),
            @Result(property = "roleIds",column="id",many = @Many(select="com.youlai.admin.mapper.SysRoleResourceMapper.listByResourceId"))
    })
    List<SysResource> listForResourceRoles();
}
