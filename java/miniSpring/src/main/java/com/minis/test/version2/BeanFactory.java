package com.minis.beans;

/**
 * @Description BeanFactory 抽象
 * @Classname BeanFactory
 * @Date 2023/6/1 16:54
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public interface BeanFactory {
    /**
     * 拿出一个bean对象
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * bean定义注册到容器中
     * @param beanDefinition
     */
    void registerBeanDefinition(BeanDefinition beanDefinition);
}
