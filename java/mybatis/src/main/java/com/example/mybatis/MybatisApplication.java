package com.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
    //1.搭建过程中的感悟
    /*引入依赖合适，都不用自己配数据库的config，直接面向yml编程，把需要配置的参数都放到yml里
    * ----mybatis的starter自动配置的作用，省去了 config、bean
    *
    * namespace--mapper中作用是绑定对应的dao接口
    *
    * */

}
