package com.zxf.bean5;
import org.springframework.stereotype.Component;
@Component //注解方式定义的bean标签
public class Student implements Person {
    public void eat() {
        System.out.println("学生吃饭");
    }
}
