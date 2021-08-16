package com.example.aopdemo.controller;

import com.example.aopdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping("/hello")
    public String hello() {
        userService.print();
        return "1234567";
    }
}
