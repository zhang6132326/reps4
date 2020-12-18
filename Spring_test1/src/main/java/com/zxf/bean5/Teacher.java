package com.zxf.bean5;
import org.springframework.stereotype.Component;
@Component //注解方式定义的bean标签
public class Teacher implements Person {
    public void eat() {
        System.out.println("老师吃饭");
    }
}
