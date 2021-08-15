package com.example.dynamicProxy;

import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;

public class DaoLogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object object;

    public DaoLogHandler() {

    }
    

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


    }
}
