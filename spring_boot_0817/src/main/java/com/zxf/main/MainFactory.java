package com.zxf.main;

import com.zxf.factory1.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFactory {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Factory1.xml");
        Car car=(Car)applicationContext.getBean("car");
        System.out.println(car.getName());
        Car car2=(Car)applicationContext.getBean("car");
        System.out.println(car2.getName());
    }
}
