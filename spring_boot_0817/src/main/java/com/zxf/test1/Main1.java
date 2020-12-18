package com.zxf.test1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {


    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("Main1.xml");
        MyController bean = app.getBean("yController", MyController.class);
        bean.list();
    }

}
