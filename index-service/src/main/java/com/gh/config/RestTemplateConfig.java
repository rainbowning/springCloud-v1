package com.gh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@Component
public class RestTemplateConfig {

    //用于resttemplate方式轮询业务服务端接口
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
