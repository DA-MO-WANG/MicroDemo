package com.example.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TO DO
 * @Classname HelloService
 * @Date 2022/9/11 19:03
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
    public String helloFallback() {
        return "error";
    }
}
