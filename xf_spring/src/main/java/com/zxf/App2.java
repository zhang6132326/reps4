package com.zxf;
import com.zxf.domain.InitTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        init1(applicationContext);
          //这样才会调用销毁方法。
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
    }
    public static void init1(ApplicationContext context){
        InitTest init=(InitTest) context.getBean("initTest");
        System.out.println(init.getTitle());
    }
}