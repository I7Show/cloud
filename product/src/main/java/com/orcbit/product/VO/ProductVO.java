package com.orcbit.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: X.zp
 * @Email Z9Show@163.com
 */
@Data
@NoArgsConstructor
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private String categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;

}
