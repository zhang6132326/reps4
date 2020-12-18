package com.zxf.test;

import com.zxf.demo7.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo7.xml")
public class TestDomo7 {
     @Autowired
     private UserService userService;

     @Test
     public void test1(){
        userService.save();
     }
}
