package com.example.aopdemo.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MetricAspect {
    //基于注解定位的
    @Around("@annotation(metricTime)")
    public Object metric(ProceedingJoinPoint joinPoint, MetricTime metricTime) throws Throwable {
        String name = metricTime.value();
        long start = System.currentTimeMillis();
        try {
            //奇怪的地方：catch这里的return 还不够，还得补一个
            return joinPoint.proceed();
        }finally {
            long t = System.currentTimeMillis() - start;
            System.out.println("[Metrics]" + name + ":" + t + "ms");
        }


    }
}
