package com.orcbit.product.repository;

import com.orcbit.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

/**
 * Created by liaoqingping on 15/9/9.
 */
public interface ProductRepository extends JpaRepository<Product, Long>, QuerydslPredicateExecutor<Product> {


}
