package com.example.feigndemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "city")
public interface CityClient {
    @GetMapping("cityuTest")
    String select();
}
