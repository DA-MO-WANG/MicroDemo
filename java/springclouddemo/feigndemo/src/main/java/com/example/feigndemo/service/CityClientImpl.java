package com.example.feigndemo.service;

import org.springframework.stereotype.Component;

@Component
public class CityClientImpl implements CityClient{
    @Override
    public String select() {
        return "调用失败";
    }
}
