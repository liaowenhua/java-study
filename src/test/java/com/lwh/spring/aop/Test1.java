package com.lwh.spring.aop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {
    
    @Resource private Performance p;
    
    @Resource private Audience a;
    
    @Test
    public void testPerformance() {
        //a.sayGood();
        System.out.println(p instanceof Performance);
        p.performance();
        System.out.println(p instanceof Performance);
    }
}
