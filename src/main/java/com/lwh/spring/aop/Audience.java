package com.lwh.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
    
    @Pointcut("execution(** com.lwh.spring.aop.Performance.performance(..))")
    public void performance () {}
    
    @Before("performance()")
    public void turnOffPhone () {
        System.out.println("turn off phone.");
    }
    
    @Before("performance()")
    public void seatDown () {
        System.out.println("seat down.");
    }
    
    @AfterReturning("performance()")
    public void sayGood () {
        System.out.println("this is a perfect perform!");
    }
    
    @AfterThrowing("performance()")
    public void takeBackMoney () {
        System.out.println("It's so bad,I want tack back my money!");
    }
}
