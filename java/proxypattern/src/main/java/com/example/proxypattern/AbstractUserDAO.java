package com.example;

/**
 * @Description 抽象subject角色
 * @Classname AbstractUserDAO
 * @Date 2023/1/30 14:28
 * @Created by rich heart
 * Copyright (c) All Rights Reserved, 2022.
 */
public interface AbstractUserDAO {
    public Boolean findUserById(String userId);
}
