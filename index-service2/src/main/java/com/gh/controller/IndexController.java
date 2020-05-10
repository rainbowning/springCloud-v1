package com.gh.controller;

import com.gh.entity.Product;
import com.gh.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("list")
    public String list(){
       return indexService.list();
    }
}
