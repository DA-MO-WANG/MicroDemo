package com.example.mybatis.controller;

import com.example.mybatis.db.UserDao;
import com.example.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping
    public String hello() {
        User user = userDao.searchUser("mike");
        return user.getScore()+ "";
    }
}
