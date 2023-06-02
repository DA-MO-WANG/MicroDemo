package com.minis.beans;

import java.util.*;

/**
 * @Description TO DO
 * @Classname SimpleBeanFactory
 * @Date 2023/6/1 17:15
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class SimpleBeanFactory implements BeanFactory{
    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    private List<String> beanNames = new ArrayList<>();
    private Map<String,Object> singletons = new HashMap<>();

    public SimpleBeanFactory() {
    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object beanObject = singletons.get(beanName);
        if(beanObject == null) {
            int i = beanName.indexOf(beanName);
            if(i == -1) throw new BeansException();
            else {
                 BeanDefinition beanDefinition = beanDefinitions.get(i);
                try {
                    beanObject = Class.forName(beanDefinition.getClassName()).newInstance();
                    singletons.put(beanDefinition.getId(),beanObject);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return beanObject;
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanDefinitions.add(beanDefinition);
        this.beanNames.add(beanDefinition.getId());
    }

    public static void main(String[] args) {
        List<String> res = Arrays.asList("123","324");
        int i = res.indexOf("124");
        System.out.println(i);

    }
}
