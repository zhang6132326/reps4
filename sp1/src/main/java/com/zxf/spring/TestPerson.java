package com.zxf.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestPerson {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person.getName()+":"+person.getId());
        System.out.println(person.getFood().getFname()+":-->"+person.getFood().getFid());
        System.out.println(person.getGift().get("url"));
        System.out.println(person.getList());
        System.out.println(person.getSet());
        System.out.println(person.getMap());
    }
}