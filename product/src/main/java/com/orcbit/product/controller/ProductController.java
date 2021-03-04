package com.orcbit.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;


    private void listAll() {

    }


}
