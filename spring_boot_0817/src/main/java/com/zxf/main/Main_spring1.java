package com.zxf.main;
import com.zxf.bean.Person_s1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main_spring1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring2.xml");
        Person_s1 ps = (Person_s1)context.getBean("ps");
        ps.setAge(23);
        ps.setName("zhzn");
        System.out.println(ps.getAge());
        System.out.println(ps.getName());
    }
}