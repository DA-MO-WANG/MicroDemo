package com.example.transactiontest.main;

import com.example.transactiontest.pojo.User1;
import com.example.transactiontest.pojo.User2;
import com.example.transactiontest.service.User1Service;
import com.example.transactiontest.service.User2Service;

public class Main implements Test{
    private User1Service user1Service;
    private User2Service user2Service;


    @Override
    public void notransaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException();
    }

    @Override
    public void notransaction_required_required_exception() {

    }
}
