package com.gh.service.impl;

import com.gh.entity.User;
import com.gh.mapper.UserMapper;
import com.gh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author GuoHui
 * @Date 2020/4/29
 */


@Service
public class UserServiceImpl2 implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public User getUser(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update() {
        User u2=new User();
        u2.setId(1087982257332887553L);
        u2.setAge(2);

        userMapper.updateByPrimaryKey(u2);

        int a=1/0;

    }
}
