package com.gh.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GuoHui
 * @Date 2020/4/26
 */
@Configuration
public class RabbitConfig {

    @Bean
    public TopicExchange getTopicExchange(){
        return new TopicExchange("topic_exchange");
    }


}
