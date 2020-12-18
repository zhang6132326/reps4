package com.zxf.test;

import com.zxf.demo4.Orcer;
import com.zxf.demo4.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class TestDemo4 {
    @Test
    public void test1(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
        Orcer bean = ac.getBean("orcer", Orcer.class);
        System.out.println(bean);
    }
    @Test
    public void test2(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
                System.out.println(dataSource);
    }
}
