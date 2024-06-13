package com.youlai.mall.product.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;

/**
 * SKU 属性值实体对象
 *
 * @author Ray
 * @since 2024/4/14
 */
@TableName("pms_sku_spec_value")
@Data
public class SkuSpecValue implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * 规格ID
     */
    private Long specId;

    /**
     * 规格值
     */
    private String specValue;
}
