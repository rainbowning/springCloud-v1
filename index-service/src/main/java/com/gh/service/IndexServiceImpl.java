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

//    @Autowired
//    private RestTemplate restTemplate;

//    private String URL="http://localhost:8080/product/list" ;
//    private String URL="http://product-service/product/list" ;

    @Autowired
    private IProductService productService;

    @Override
    public String list() {

//        ResponseEntity<String> entity = restTemplate.getForEntity(URL, String.class);
//        return entity.getBody();
        List<Product> list = productService.list();

        System.out.println(list);
        return list.toString();

    }

}
