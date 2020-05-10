package com.gh.service;

import com.gh.entity.Product;
import org.bouncycastle.math.Primes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@Service
public class ProductServiceImpl implements IProductService {

    @Value("${server.port}")
    private String port;

    @Override
    public List<Product> list() {
        List<Product> list=new ArrayList<>();
        list.add(new Product(1l,"Iphone",9999l));
        list.add(new Product(2l,"华为MAX9",5080l));
        list.add(new Product(3l,"小米mate30",2999l));
        System.out.println("这是=====》"+port);
        return list;

    }
}
