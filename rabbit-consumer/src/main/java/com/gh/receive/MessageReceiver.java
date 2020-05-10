package com.gh.receive;

import com.gh.entity.Product;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author GuoHui
 * @Date 2020/4/26
 */

@Component
public class MessageReceiver {
    private static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);

    @RabbitHandler
    @RabbitListener(queues = "topic_queue")
    public void topicReceiver(Product product){
        System.out.println("收到的信息1："+product.toString());
    }
    @RabbitHandler
    @RabbitListener(queues = "topic_queue")
    public void topicReceiver3(Product product){
        System.out.println("收到的信息1："+product.toString());
    }
    @RabbitHandler
    @RabbitListener(queues = "topic_queue")
    public void topicReceiver4(Product product, Channel channel, Message message) throws IOException {
        try {

            System.out.println("收到的信息1："+product.toString());
            System.out.println(message.getMessageProperties().getDeliveryTag());
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),true);

        }catch (Exception e){
            if (message.getMessageProperties().getRedelivered()) {
                logger.info("【Consumer02】消息已经回滚过，拒绝接收消息 ： {}", product.toString());
                // 拒绝消息，并且不再重新进入队列
                //public void basicReject(long deliveryTag, boolean requeue)
                channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
            } else {
                logger.info("【Consumer02】消息即将返回队列重新处理 ：{}", product.toString());
                //设置消息重新回到队列处理
                // requeue表示是否重新回到队列，true重新入队
                //public void basicNack(long deliveryTag, boolean multiple, boolean requeue)
                channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
            }
            e.printStackTrace();
        }

    }


//    @RabbitHandler
//    @RabbitListener(queues = "topic_queue2")
//    public void topicReceiver2(Product product){
//        System.out.println("收到的信息2："+product.toString());
//    }

}
