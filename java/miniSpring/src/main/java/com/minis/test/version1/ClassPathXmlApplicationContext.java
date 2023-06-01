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
public class ClassPathXmlApplicationContext {
    //保存所有bean定义信息的结构
    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    //构建id 与 实例bean的映射关系
    private Map<String,Object> singletons = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) {
        this.readXml(fileName);
        this.instanceBeans();
    }

    /**
     * 读取全路径下的Xml信息
     * @param fileName
     */
    private void readXml(String fileName) {
        // dom4j 准备相关的工具类
        SAXReader saxReader = new SAXReader();
        URL xmlPath = this.getClass().getClassLoader().getResource(fileName);
        try {
            // 获取xml文件对应结构信息
            Document document = saxReader.read(xmlPath);
            Element rootElement = document.getRootElement();
            // 获取xml中所有标签元素
            List<Element> elements = rootElement.elements();
            elements.stream()
                    .forEach(element -> {
                        String beanID = element.attributeValue("id");
                        String beanClassName = element.attributeValue("class");
                        beanDefinitions.add(new BeanDefinition(beanID,beanClassName));
                    });
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 运用反射机制
     * 把读取到的类全名信息，转化为实例化的bean
     */
    private void instanceBeans() {
        beanDefinitions.stream()
                .forEach(beanDefinition -> {
                    try {
                        singletons.put(beanDefinition.getId(),
                                Class.forName(beanDefinition.getClassName()).newInstance());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });
    }

    public Object getBeans(String beanName) {
        return singletons.get(beanName);
    }

}
