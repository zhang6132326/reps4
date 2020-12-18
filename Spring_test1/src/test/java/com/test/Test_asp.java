package com.test;
import com.zxf.bean5.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test_asp {
    @Test
    public void test1(){
       ApplicationContext ac=new ClassPathXmlApplicationContext("Spring6.xml");
        MathI mathImpl = ac.getBean("mathImpl", MathI.class);
        //带有返回值的
        System.out.println(mathImpl.add(23,1));
        System.out.println(mathImpl.mul(-23,1));

        //无返回值的
       Person student = ac.getBean("student", Person.class);
        student.eat();

        Person teacher = ac.getBean("teacher", Person.class);
        teacher.eat();
    }
}
