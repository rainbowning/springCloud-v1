package com.gh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GuoHui
 * @Date 2020/4/26
 */

@SpringBootApplication
public class RabbitConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(RabbitConsumerApplication.class,args);
    }
}
