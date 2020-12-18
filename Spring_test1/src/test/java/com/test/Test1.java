package com.test;

import com.zxf.bean.Bean1;
import com.zxf.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        //1 创建Spring的IOC容器
      //  ApplicationContext ac=new ClassPathXmlApplicationContext("Spring1.xml");
        //2 从IOCring器中获取Bean实例
        //默认getBean返回类型Object 这样做的目的是不用在强转了。
       // Bean1 h1 = ac.getBean("h1", Bean1.class);
        //调用对象方法
       // h1.sayHello();
    }
    //测试通过学生调用老师对象
    @Test
    public void test2(){
      //  ApplicationContext ac=new ClassPathXmlApplicationContext("Spring1.xml");
      //  Student s1 = ac.getBean("s1", Student.class);
      //  System.out.print(s1.getName()+" ");
        //通过对象形式调用了teacher对象的name方法
      //  System.out.println(s1.getTeacher().getName());
    }

}
