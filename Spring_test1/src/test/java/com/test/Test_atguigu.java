package com.test;

import com.zxf.atguigu.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_atguigu {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring5.xml");
        UserController userController = ac.getBean("userController", UserController.class);
        userController.save_user();

    }
}
