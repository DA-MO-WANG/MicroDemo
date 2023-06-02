package com.minis.beans;

import org.dom4j.Element;

/**
 * @Description TO DO
 * @Classname XmlBeanDefinitionReader
 * @Date 2023/6/1 17:08
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class XmlBeanDefinitionReader {
    BeanFactory beanFactory;
    public XmlBeanDefinitionReader(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    /**
     * 把解析的xml信息 转化为BeanDefinition
     * 并注册到容器中去
     * @param resource
     */
    public void loadBeanDefinitions(Resource resource) {
        while(resource.hasNext()) {
            Element element = (Element) resource.next();
            String beanId = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            this.beanFactory.registerBeanDefinition(new BeanDefinition(beanId,beanClassName));


        }
    }
}
