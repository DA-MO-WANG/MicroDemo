package com.example.mybatis.service.impl;

import com.example.mybatis.db.UserDao;
import com.example.mybatis.pojo.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User getUser(String name) {
        return userDao.searchUser(name);
        //return null;
    }
}
