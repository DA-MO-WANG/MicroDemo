package com.example.feigndemo.service;

import org.springframework.web.client.RestTemplate;

public class RibbonService {
    private RestTemplate restTemplate;

    public void testRibbon() {
        String result = restTemplate.getForObject("http://city/cityTest",String.class);
    }
}
