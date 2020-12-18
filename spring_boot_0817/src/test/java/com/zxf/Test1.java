package com.zxf;
import com.zxf.bean.Emp;
import com.zxf.bean.Person;
import com.zxf.conf.MyAppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
    @Test
    public void test1(){
         System.out.println(person);
    }
    @Test
    public void test2(){
        //测试配置类中添加的Bean组件
        //这helloSerive是MyAppConfig配置类定义的一个方法名字
        boolean helloSerive = ioc.containsBean("helloSerive");
        System.out.println(helloSerive);

    }
    @Autowired
    Emp emp;
    @Test
    public void test3(){
        //测试emp
        System.out.println(emp);
    }
}
