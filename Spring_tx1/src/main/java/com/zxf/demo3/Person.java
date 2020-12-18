package com.zxf.demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value = "p")
public class Person {
    @Value("张三")
    private String panme;

    @Override
    public String toString() {
        return "Person{" +
                "panme='" + panme + '\'' +
                '}';
    }
}
