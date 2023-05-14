package com.example.version3;

/**
 * @Description TO DO
 * @Classname Client
 * @Date 2023/5/14 11:22
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class Client {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();


    }
}
