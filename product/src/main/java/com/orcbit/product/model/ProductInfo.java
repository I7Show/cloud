package com.orcbit.product.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class ProductInfo implements Serializable {


    @Id
    private String productId;

    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;

    private Date createTime;
    private Date updateTime;

    public ProductInfo() {
    }


}
