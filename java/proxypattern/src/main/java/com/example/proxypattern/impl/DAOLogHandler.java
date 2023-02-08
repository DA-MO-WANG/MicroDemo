package com.example.impl;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Description TO DO
 * @Classname DAOLogHandler
 * @Date 2023/1/30 14:42
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class DAOLogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object object;

    public DAOLogHandler() {

    }
    public DAOLogHandler(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object,args);
        afterInvoke();
        return null;
    }
    //返回调用业务时间
    public void beforeInvoke() {
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间：" + time);
    }
    public void afterInvoke() {
        System.out.println("方法调用结束！");
    }
}
