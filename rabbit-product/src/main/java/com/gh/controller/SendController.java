package com.gh.controller;

import com.gh.entity.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GuoHui
 * @Date 2020/4/26
 */

@Controller
@RequestMapping("send")
public class SendController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("msg")
    public void sendMsg(){
        for (Long i = 1L; i <4L ; i++) {

            Product product=new Product();
            product.setId(i);
            product.setName("张三");
            product.setPrice(1259L);
            rabbitTemplate.convertAndSend("topic_exchange","topic.ba",product);
        }


    }
    @RequestMapping("cookie")
    public String setCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie=new Cookie("user","123456");
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(3000);
        response.addCookie(cookie);
        return "redirect:https://www.baidu.com";
    }

}
