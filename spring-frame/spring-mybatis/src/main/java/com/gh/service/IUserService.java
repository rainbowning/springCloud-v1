package com.gh.service;

import com.gh.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author GuoHui
 * @Date 2020/4/29
 */
public interface IUserService {

    public User getUser(Long id);

    public void update();

}
