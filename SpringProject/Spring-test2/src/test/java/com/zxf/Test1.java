package com.zxf;

import com.zxf.demo.Demo1;
import com.zxf.demo.Demo2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo1 d_1 = ac.getBean("demo1", Demo1.class);
        d_1.demo1();
        d_1.demo2();
        d_1.demo3();
        Demo2 d_2 = ac.getBean("demo2", Demo2.class);
          d_2.f();
    }
}
