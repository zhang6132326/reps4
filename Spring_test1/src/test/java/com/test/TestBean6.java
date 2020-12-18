package com.test;

import com.zxf.bean6.Animal;
import com.zxf.bean6.Cat;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean6 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring7.xml");
        Animal animal=ac.getBean("cat", Animal.class);
        animal.sleep();
    }
}
