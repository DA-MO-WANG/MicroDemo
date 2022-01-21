package com.example.serviceregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceregisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceregisterApplication.class, args);
    }

}
