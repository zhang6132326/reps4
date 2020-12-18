package com.zxf;

import com.zxf.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] aa){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
        t1(applicationContext);
    }
   private static void  t1(ApplicationContext context){
        Person p=(Person) context.getBean("person");
        String name=p.getPname();
        System.out.println(name);

   }
}
