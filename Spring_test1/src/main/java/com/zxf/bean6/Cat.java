package com.zxf.bean6;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    public void sleep() {
        System.out.println("猫睡觉了。。");
    }
}
