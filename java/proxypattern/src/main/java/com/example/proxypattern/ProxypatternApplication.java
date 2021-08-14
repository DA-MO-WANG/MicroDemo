package com.example.proxypattern;

import com.example.proxypattern.pattern.Searcher;
import com.example.proxypattern.pattern.XMLUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxypatternApplication {
    //任务就是在已经开发好的查询功能前后，增加权限认证和日志查询
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("杨过","玉女心经");
        SpringApplication.run(ProxypatternApplication.class, args);
    }

}
