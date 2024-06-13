package com.youlai.system.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.common.web.model.Option;
import com.youlai.system.model.entity.SysRole;
import com.youlai.system.model.form.RoleForm;
import com.youlai.system.model.vo.RolePageVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * 角色对象转换器
 *
 * @author Ray
 * @since 2022/5/29
 */
@Mapper(componentModel = "spring")
public interface RoleConverter {

    Page<RolePageVO> entity2Page(Page<SysRole> page);

    @Mappings({
            @Mapping(target = "value", source = "id"),
            @Mapping(target = "label", source = "name")
    })
    Option entity2Option(SysRole role);


    List<Option> entities2Options(List<SysRole> roles);

    SysRole toEntity(RoleForm roleForm);

    RoleForm toForm(SysRole entity);
}