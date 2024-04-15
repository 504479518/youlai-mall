package com.youlai.mall.pms.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * 属性组 分页VO
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Getter
@Setter
public class AttributeGroupPageVO implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
         * 属性组主键
         */

    private Long id;

        /**
         * 属性组名称
         */

    private String name;

        /**
         * 排序
         */

    private Short sort;

        /**
         * 备注
         */

    private String remark;

        /**
         * 创建时间
         */

    private LocalDateTime createTime;

        /**
         * 更新时间
         */

    private LocalDateTime updateTime;
}
