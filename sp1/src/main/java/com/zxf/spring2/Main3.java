package com.zxf.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring3.xml");
        A a=applicationContext.getBean("A",A.class);
        System.out.println(a);
        System.out.println(a.getB());
        System.out.println(a.getB().getC());
        System.out.println("-------");
        A a1=applicationContext.getBean("A",A.class);
        System.out.println(a1);
        System.out.println(a1.getB());
        System.out.println(a1.getB().getC());




    }
}
