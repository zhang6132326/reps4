package com.zxf.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService1Impl implements MyService1 {
    @Autowired
    Cat cat;
    @Override
    public String sayCat() {
        return cat.getName();
    }
}
