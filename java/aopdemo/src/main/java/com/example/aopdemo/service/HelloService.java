package com.example.aopdemo.service;

import com.example.aopdemo.annotation.MetricTime;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    @MetricTime("register")
    public void register() {
        
    }
}
