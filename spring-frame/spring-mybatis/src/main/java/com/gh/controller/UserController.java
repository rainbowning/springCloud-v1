package com.gh.controller;

import com.alibaba.fastjson.JSON;
import com.gh.entity.User;
import com.gh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuoHui
 * @Date 2020/4/29
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("getUser")
    public String getUser(Long id){
        User user = userServiceImpl.getUser(id);
        return JSON.toJSONString(user);
    }
    @RequestMapping("update")
    public void update(){
        userServiceImpl.update();
    }
}
