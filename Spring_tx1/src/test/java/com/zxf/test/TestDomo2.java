package com.zxf.test;

import com.zxf.demo2.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDomo2 {
   @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ac.getBean("c",Car.class);
         double d1=car.getMoney();
            System.out.println(d1+234);

         System.out.println(car);
    }
}
