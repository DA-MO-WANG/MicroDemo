package com.example.myspringcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TO DO
 * @Classname App
 * @Date 2022/9/10 18:23
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
@RestController
public class App {
    @RequestMapping("/app")
    String home() {
        return "hello";
    }
}
