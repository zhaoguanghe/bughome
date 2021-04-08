package com.bughome.springboot.service;

import com.bughome.springboot.mapper.UserMapper;
import com.bughome.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Zgh
 * @Date 2020/12/28 9:46
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer id){
        return userMapper.selectUserById(id);
    }
}
