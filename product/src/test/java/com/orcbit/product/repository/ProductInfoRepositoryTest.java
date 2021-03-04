package com.orcbit.product.repository;

import com.orcbit.product.model.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    void findByProductStatus() {
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(1);
        System.out.println(byProductStatus.size());
    }
}