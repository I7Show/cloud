package com.orcbit.product.controller;

import com.orcbit.product.VO.ProductVO;
import com.orcbit.product.VO.ResultVO;
import com.orcbit.product.model.ProductCategory;
import com.orcbit.product.model.ProductInfo;
import com.orcbit.product.service.CategoryService;
import com.orcbit.product.service.ProductService;
import com.orcbit.product.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@EnableAutoConfiguration
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(categoryTypeList);

        return null;
    }


}
