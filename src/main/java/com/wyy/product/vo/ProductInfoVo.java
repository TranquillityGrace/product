package com.wyy.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 最内层
 *
 * @Author WYY
 * @Date 2019-08-13 11:24
 */
@Data
public class ProductInfoVo {

    /**
     * 命名和productInfo 保持一致
     */
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
