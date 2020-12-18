package com.zxf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
        MessageService messageService = context.getBean(MessageService.class);
        String message = messageService.getMessage();
        System.out.println(message);
    }
}
