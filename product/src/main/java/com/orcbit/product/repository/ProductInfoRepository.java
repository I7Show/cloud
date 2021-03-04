package com.orcbit.product.repository;

import com.orcbit.product.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by liaoqingping on 15/9/9.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{


    List<ProductInfo> findByProductStatus(Integer status);
}
