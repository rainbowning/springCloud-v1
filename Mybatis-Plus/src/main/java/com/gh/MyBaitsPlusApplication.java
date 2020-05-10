package com.gh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GuoHui
 * @Date 2020/4/17
 */

@SpringBootApplication
@MapperScan("com.gh.dao")
public class MyBaitsPlusApplication {
    public static void main(String[] args){
        SpringApplication.run(MyBaitsPlusApplication.class,args);
    }
}
