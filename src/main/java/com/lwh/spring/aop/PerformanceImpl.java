package com.lwh.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

    @Override
    public void performance() {
        System.out.println("perform...");
    }

}
