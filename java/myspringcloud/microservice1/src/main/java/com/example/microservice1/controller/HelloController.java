package com.example.microservice1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @Description TO DO
 * @Classname HelloController
 * @Date 2022/9/10 20:32
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(HelloController.class.toString());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = client.getInstances("hello-service").get(0);
        logger.info("/hello, host :" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello World";
    }
}
