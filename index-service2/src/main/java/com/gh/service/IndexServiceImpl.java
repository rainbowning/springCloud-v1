package com.gh.service;

import com.gh.entity.Product;
import com.gh.iinterface.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IProductService productService;

    @Override
    public String list() {
        List<Product> list = productService.list();
        return list.toString();

    }

}
