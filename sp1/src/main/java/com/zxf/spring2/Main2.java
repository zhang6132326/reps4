package com.zxf.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
        Car car=applicationContext.getBean("car",Car.class);
        System.out.println(car.getName());
        System.out.println(car.getPrice());

    }
}
