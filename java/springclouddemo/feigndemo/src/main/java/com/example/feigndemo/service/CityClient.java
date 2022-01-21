package com.example.feigndemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "city",fallback = CityClientImpl.class)
public interface CityClient {
    @GetMapping("cityuTest")
    String select();
}
