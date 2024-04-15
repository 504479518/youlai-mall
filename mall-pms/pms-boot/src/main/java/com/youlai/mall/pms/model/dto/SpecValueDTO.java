package com.youlai.mall.pms.model.dto;


import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDateTime;
/**
 *  DTO
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Getter
@Setter
public class SpecValueDTO implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
         * 规格值ID
         */

private Long id;

        /**
         * 规格ID
         */

private Long specId;

        /**
         * 规格值
         */

private String value;
}
