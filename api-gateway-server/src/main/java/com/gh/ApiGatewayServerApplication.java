package com.gh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author GuoHui
 * @Date 2020/4/10
 */

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayServerApplication {
   public static void main(String[] args){
       SpringApplication.run(ApiGatewayServerApplication.class,args);
   }
}
