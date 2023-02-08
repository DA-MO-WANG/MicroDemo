package com.example.impl;

import com.example.AbstractUserDAO;
import com.example.DocumentDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description TO DO
 * @Classname Client
 * @Date 2023/1/30 14:50
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class Client {
    public static void main(String args[]) {
        InvocationHandler handler = null;

        AbstractUserDAO userDAO = new UserDAOImpl();
        handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = null;

        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class},handler);
        proxy.findUserById("张无忌");
        System.out.println("-----------------------------");
        DocumentDAO docDAO = new DocumentDAOImpl();
        handler = new DAOLogHandler(docDAO);
        DocumentDAO proxy_news = null;

        proxy_news = (DocumentDAO) Proxy.newProxyInstance(DocumentDAO.class.getClassLoader(),new Class[]{DocumentDAO.class},handler);
        proxy_news.deleteDocumentById("D002");



    }
}
