package com.youlai.mall.pms.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.youlai.common.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 商品分类实体类
 *
 * @author Ray Hao
 * @since 2024/04/20
 */
@TableName("pms_category")
@Getter
@Setter
public class Category extends BaseEntity {

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类ID
     */
    private Long parentId;

    /**
     * 分类图标URL
     */
    private String iconUrl;

    /**
     * 分类层级
     */
    private Integer level;

    /**
     * 分类排序
     */
    private Integer sort;

    /**
     * 分类是否可见
     */
    private Integer visible;

    /**
     * 创建人ID
     */
    private Long createBy;

    /**
     * 更新人ID
     */
    private Long updateBy;

    /**
     * 逻辑删除标识(0-未删除，1-已删除)
     */
    private Integer isDeleted;
}
