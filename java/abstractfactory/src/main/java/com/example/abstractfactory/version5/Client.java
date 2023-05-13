package com.example.abstractfactory.version4;

import com.example.abstractfactory.version1.User;
import com.example.abstractfactory.version2.IUser;


/**
 * @Description TO DO
 * @Classname Client
 * @Date 2023/5/13 14:58
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        try {
            IUser iu = DataAccess.createUser();
            iu.insert(user);
            iu.getUser(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
