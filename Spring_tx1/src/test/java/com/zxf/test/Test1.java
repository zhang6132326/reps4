package com.zxf.test;

import com.zxf.demo.UserDemo1;
import com.zxf.demo.impl.UserDemo1Impl;
import com.zxf.pojo.MyIp;
import com.zxf.service.UserService;
import com.zxf.service.impl.MyIpServiceImpl;
import com.zxf.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class Test1 {
    @Test
    public void test1(){
        UserService userService=new UserServiceImpl();
        userService.hello();
    }
    @Test
    public void test2(){
        System.out.println("11111111111111");
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("22222222222");
        UserService userService1= ac.getBean("users1",UserServiceImpl.class);
        userService1.hello();
    }
    @Test
    public void test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyIpServiceImpl myipservice = ac.getBean("myipservice", MyIpServiceImpl.class);
        List<MyIp> all_ip = myipservice.getAll_IP();
        for(MyIp myIp:all_ip){
            System.out.print(myIp.getIp_address()+" ");
            System.out.println(myIp.getIp_date());
        }

    }
    //测试注解
        @Test
    public void test4(){
            ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
            //这里配置了注解的方式
            UserDemo1 userDemo1= ac.getBean("ud", UserDemo1Impl.class);
           userDemo1.hello();
    }
}
