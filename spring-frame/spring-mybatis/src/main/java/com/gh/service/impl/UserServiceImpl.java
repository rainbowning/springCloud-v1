package com.gh.service.impl;

import com.gh.entity.User;
import com.gh.mapper.UserMapper;
import com.gh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author GuoHui
 * @Date 2020/4/29
 */


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userServiceImpl2;

    @Override
    @Transactional
    public User getUser(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
    @Transactional
    public void update() {
        User user1=new User();
        user1.setId(1087982257332887553L);
        user1.setAge(1);
        User u2=new User();
        u2.setId(1087982257332887553L);
        u2.setAge(3);

        userMapper.updateByPrimaryKey(user1);

        userServiceImpl2.update();

        userMapper.updateByPrimaryKey(u2);

    }
}
