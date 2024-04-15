package com.youlai.mall.pms.mapper;

import com.youlai.mall.pms.model.entity.Attribute;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.mall.pms.model.bo.AttributeBO;
import com.youlai.mall.pms.model.query.AttributePageQuery;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性 Mapper 接口
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Mapper
public interface AttributeMapper extends BaseMapper<Attribute> {

    /**
     * 获取用户分页列表
     *
     * @param page
     * @param queryParams 查询参数
     * @return
     */
    Page<AttributeBO> listPagedAttributes(Page<AttributeBO> page, AttributePageQuery queryParams);

}
