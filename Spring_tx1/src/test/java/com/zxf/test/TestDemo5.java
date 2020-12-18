package com.zxf.test;

import com.zxf.demo5.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//运行器
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext_test.xml")
public class TestDemo5 {

    @Autowired
    private User user;
    @Test
    public void test1(){
           user.sayHello();
    }
}
