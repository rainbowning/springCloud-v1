package com.gh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicaiton {

    public static void main(String[] args){
        SpringApplication.run(EurekaServerApplicaiton.class,args);

    }
}
