package com.gh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gh.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author GuoHui
 * @Date 2020/4/17
 */

@Component
public interface UserMapper extends BaseMapper<User> {


}
