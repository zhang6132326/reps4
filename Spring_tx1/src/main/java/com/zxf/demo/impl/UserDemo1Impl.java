package com.zxf.demo.impl;

import com.zxf.demo.UserDemo1;
import org.springframework.stereotype.Component;

//把当前类用IOC容器管理  相同<bean id="ud" class="com.zxf.demo.impl.UserDemo1Impl"/>
@Component(value = "ud")
public class UserDemo1Impl implements UserDemo1 {
    public void hello() {
        System.out.println("UserDemo1Impl..hello()我是注解做的");
    }
}
