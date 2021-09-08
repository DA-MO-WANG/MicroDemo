package com.example.transactiontest.service.impl;

import com.example.transactiontest.mapper.User1Mapper;
import com.example.transactiontest.pojo.User1;
import com.example.transactiontest.service.User1Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class User1ServiceImpl implements User1Service {
    private User1Mapper user1Mapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user) {
        user1Mapper.insert(user);
    }
}
