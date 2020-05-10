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

    @Bean
    public Queue getQueue(){
        return new Queue("topic_queue");
    }
    @Bean
    public Queue getQueue2(){
        return new Queue("topic_queue2");
    }

    @Bean
    public Binding bindingExchange(Queue getQueue,TopicExchange getTopicExchange){
        return BindingBuilder.bind(getQueue)
                .to(getTopicExchange)
                .with("topic.#");
    }
//    @Bean
//    public Binding bindingExchange2(Queue getQueue2,TopicExchange getTopicExchange){
//        return BindingBuilder.bind(getQueue2)
//                .to(getTopicExchange)
//                .with("topic.ba");
//    }



}
