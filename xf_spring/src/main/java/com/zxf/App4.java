package com.zxf;

import com.zxf.domain2.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2.xml");
        Emp emp=(Emp)applicationContext.getBean("emp");
        String da=emp.getDept().getDept_name();
        System.out.println(da);
    }
}
