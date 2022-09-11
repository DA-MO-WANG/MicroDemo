package com.example.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * @Description TO DO
 * @Classname HelloService
 * @Date 2022/9/11 19:03
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
@Service
public class HelloService {
    private Logger logger = Logger.getLogger(this.getClass().toString());
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        String res = "";
        long start = System.currentTimeMillis();
        res =  restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
        long end = System.currentTimeMillis();
        logger.info("Spend time: " + (end - start));
        return res;
    }
    public String helloFallback() {
        return "error";
    }
}
