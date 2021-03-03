package com.orcbit.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductListDTO implements Serializable {

    private long id;

    private String code;
    private String title;

    private Long price;   //金额
}
