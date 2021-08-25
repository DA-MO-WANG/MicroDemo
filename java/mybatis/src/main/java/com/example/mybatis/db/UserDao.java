package com.example.mybatis.db;

import com.example.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;

@Mapper
public interface UserDao {
    @Select("select * from user where name=#{name}")
    User searchUser(String name);
}
