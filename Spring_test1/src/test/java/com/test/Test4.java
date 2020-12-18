package com.test;

import com.zxf.bean4.Car;
import com.zxf.bean4.MyFacotry;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring4.xml");
              //注意这里写的是Car.class 不能写
        /*
        <bean id="factory" class="com.zxf.bean4.MyFacotry"/>
         因为你是通过工厂生产出来的对象，你就要写具体的生产出来的对象。

         */

        Car factory = ac.getBean("factory",Car.class);
          System.out.print(factory.getBrand()+" "+factory.getPrice());
    }
}