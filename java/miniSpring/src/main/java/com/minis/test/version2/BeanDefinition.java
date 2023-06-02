package com.minis.beans;

/**
 * @Description xml中bean标签对应的结构信息
 * @Classname BeanDefinition
 * @Date 2023/6/1 15:40
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class BeanDefinition {
    // 定义bean的别名
    private String id;
    // 定义bean的类
    private String className;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
