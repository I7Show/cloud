package com.orcbit.product.service.impl;

import com.orcbit.product.model.ProductCategory;
import com.orcbit.product.repository.ProductCategoryRepository;
import com.orcbit.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: X.zp
 * @Email Z9Show@163.com
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType) {
        return productCategoryRepository.findByCategoryTypeIn(categoryType);
    }
}
