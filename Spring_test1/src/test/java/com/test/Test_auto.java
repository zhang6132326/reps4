package com.test;

import com.zxf.auto.Person;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_auto {
    /*
       测试自动装配属性autowire="byName
        表示 按名称装配，
         private Address address;
         private Car car;
         属性名和类别一致 首字母小写
     */
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring1.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person.getAddress().getAddress_name());
        System.out.println(person.getCar().getCar_name());
    }
}
