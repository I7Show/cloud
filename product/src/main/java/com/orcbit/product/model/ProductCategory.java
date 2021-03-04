package com.orcbit.product.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class ProductCategory implements Serializable {
    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;
    private Integer categoryType;

    private Date createTime;
    private Date updateTime;

    public ProductCategory() {
    }
}
