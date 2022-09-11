package com.example.ribbonconsumer.controller;

import com.example.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TO DO
 * @Classname ComsumerController
 * @Date 2022/9/11 11:57
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
@RestController
public class ComsumerController {
   @Autowired
    HelloService helloService;
    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer() {
        //System.out.println(1111111);
        return helloService.helloService();
    }
}
