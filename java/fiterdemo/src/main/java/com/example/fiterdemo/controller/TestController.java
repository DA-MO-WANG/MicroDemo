package com.example.fiterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {

    @GetMapping("/hello")
    public String getHello() {
        System.out.println("web方法执行");
        return "hello filter!";
    }
}
