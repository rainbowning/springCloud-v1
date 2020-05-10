package com.gh;

import com.gh.entity.User;
import com.gh.tool.RedisTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author GuoHui
 * @Date 2020/4/20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisTool redisTool;

    @Test
    public void v1(){
//        redisTool.set("测试",123);
        User user=new User();
        user.setId(123L);
        user.setName("张三");
        user.setEmail("1351652209@qq.com");
        redisTool.set("user",user);
        System.out.println(redisTool.get("user"));

    }
}
