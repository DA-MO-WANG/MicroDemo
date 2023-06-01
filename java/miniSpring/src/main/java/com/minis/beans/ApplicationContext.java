package com.minis.beans;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 解析某个路径下的XML来构建应用上下文
 * @Classname ClassPathXmlApplicationContext
 * @Date 2023/6/1 15:45
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class ClassPathXmlApplicationContext implements BeanFactory{
    BeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
       Resource resource = new ClassPathXmlResource(fileName);
       BeanFactory beanFactory = new SimpleBeanFactory();
       XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
       reader.loadBeanDefinitions(resource);
       this.beanFactory = beanFactory;
    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        return this.beanFactory.getBean(beanName);
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanFactory.registerBeanDefinition(beanDefinition);
    }
}
