package com.example.transactiontest.mapper;

import com.example.transactiontest.pojo.User1;

public interface User1Mapper {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
}
