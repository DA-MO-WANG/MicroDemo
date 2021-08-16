package com.example.aopdemo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * tip：自定义了一个注解
 * 两个元注解
 * @interface
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface MetricTime {
    //注解内部的参数
    String value();
}
