package com.zxf.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("yController")
public class MyController {
    @Autowired
    MyService1 myService1;
    public String list(){
        return myService1.sayCat();
    }
}
