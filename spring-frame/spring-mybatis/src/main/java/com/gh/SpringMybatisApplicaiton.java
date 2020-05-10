package com.gh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GuoHui
 * @Date 2020/4/29
 */

@SpringBootApplication
@MapperScan("com.gh.mapper")
public class SpringMybatisApplicaiton {
    public static void main(String[] args){
        SpringApplication.run(SpringMybatisApplicaiton.class,args);
    }
}
