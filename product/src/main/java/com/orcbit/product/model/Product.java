package com.orcbit.product.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity  @Table(name = "shop_product_product") @Data
public class Product implements Serializable {


    @Id
    @GeneratedValue
    private long id;

    private String title;

    @Column(unique = true)
    private String code;

    private long price;   //销售价, 实际以sku价格为准

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public Product() {
    }

    public Product(long id){
        this.id = id;
    }


}
