package com.example.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 织入的工具类，定义了各个切面的具体实现
 * @Aspenct注解的作用是织入
 */
@Aspect
@Component
public class LoggingAspect {
    //注解括号内部是指定的切面切入点---在哪织入--标注位置
    @Before("execution(public * com.example.aopdemo.service.UserService.*(..))")
    public void doAccessCheck() {
        System.err.println("before: doaccesscheck");
    }

    @Around("execution(public * com.example.aopdemo.service.MailService.*(..))")
    public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {
        //不清楚为什么：用system.err 就会导致异步效果，打印的先执行
        System.out.println("around: start " + pjp.getSignature());
        Object retVal = pjp.proceed();//切入点执行，调用原业务方法
        System.out.println("around: done " + pjp.getSignature());
        return retVal;
    }
}
