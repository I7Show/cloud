package com.orcbit.product.service;

import com.orcbit.product.model.Product;
import com.orcbit.product.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Provider;
import javax.persistence.EntityManager;

@Service
@Transactional
public class ProductAdminService{
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductAdminService.class);
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private Provider<EntityManager> entityManager;

    public JpaRepository<Product, Long> getEntityRepository() {
        return this.productRepository;
    }


}
