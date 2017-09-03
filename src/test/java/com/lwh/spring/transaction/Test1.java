package com.lwh.spring.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {
    @Resource private Demo1 demo1;
    
    @Test
    public void testAddUser () {
        demo1.addUser(131030162);
    }
    
    @Test
    public void testTransaction () {
        demo1.addAndUpdate(131030163, 131030162);
    }

}
