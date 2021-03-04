package com.orcbit.product.service;

import com.orcbit.product.model.ProductCategory;
import com.orcbit.product.model.ProductInfo;

import java.util.List;

public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);
}
