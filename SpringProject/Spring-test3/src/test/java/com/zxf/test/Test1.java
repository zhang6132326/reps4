package com.zxf.test;

import com.zxf.demo.Demo1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo1 domo1 = ac.getBean("domo1", Demo1.class);
        domo1.d1();
    }
}
