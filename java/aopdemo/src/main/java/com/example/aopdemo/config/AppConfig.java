package com.example.aopdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 这里的作用就是把织入逻辑交付给spring容器
 * @EnableAspectJAutoProxy这个就是识别切面相关东西的注解
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AppConfig {
}
