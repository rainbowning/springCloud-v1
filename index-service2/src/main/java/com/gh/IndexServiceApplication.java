package com.gh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@SpringBootApplication
@EnableFeignClients
public class IndexServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(IndexServiceApplication.class,args);
    }
}
