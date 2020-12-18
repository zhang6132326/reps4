package com.zxf.spring4;

import com.zxf.spring4.controller.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring4.xml");
        MainController m=  applicationContext.getBean("mainController", MainController.class);
       String info= m.list();
       System.out.println(info);

    }
}
