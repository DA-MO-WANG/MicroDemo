package com.example.transactiontest.service.impl;

import com.example.transactiontest.mapper.User2Mapper;
import com.example.transactiontest.pojo.User2;
import com.example.transactiontest.service.User2Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class User2ServiceImpl implements User2Service {
   private User2Mapper user2Mapper;



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User2 user) {
        user2Mapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequiredException(User2 user) {
        user2Mapper.insert(user);
        throw new RuntimeException();
    }
}
