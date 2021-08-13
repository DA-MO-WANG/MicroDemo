package com.example.fiterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FiterdemoApplication {
    //先写好自己的过滤逻辑——在web方法前后我们要干什么
    //把自己的filter整合到spring里
    //剩下的交给spring容器自己解决
    public static void main(String[] args) {
        SpringApplication.run(FiterdemoApplication.class, args);
    }

}
