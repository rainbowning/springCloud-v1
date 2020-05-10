package com.gh.controller;

import com.gh.entity.Product;
import com.gh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("list")
    public List<Product> list(){
        return iProductService.list();
    }
}
