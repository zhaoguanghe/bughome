package com.bughome.springboot.controller;

import com.bughome.springboot.model.User;
import com.bughome.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zgh
 * @Date 2020/12/28 9:48
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User user(@PathVariable Integer userId){
        return userService.getUser(userId);
    }
}
