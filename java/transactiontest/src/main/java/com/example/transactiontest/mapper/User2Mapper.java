package com.example.transactiontest.mapper;

import com.example.transactiontest.pojo.User2;

public interface User2Mapper {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
}
