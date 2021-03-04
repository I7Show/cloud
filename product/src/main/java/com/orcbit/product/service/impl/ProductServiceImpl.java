package com.orcbit.product.service.impl;

import com.orcbit.product.enums.ProductStatusEnum;
import com.orcbit.product.model.ProductInfo;
import com.orcbit.product.repository.ProductInfoRepository;
import com.orcbit.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: X.zp
 * @Email Z9Show@163.com
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
