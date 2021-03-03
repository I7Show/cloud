package com.orcbit.product.action;

import com.orcbit.product.service.ProductAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class ProductAction {

    @Autowired
    private ProductAdminService productAdminService;


}
