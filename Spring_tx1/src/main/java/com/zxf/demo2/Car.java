package com.zxf.demo2;

import com.zxf.demo3.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*
@Component   普通类
@Controller  表现层
@Service     业务层
@Repository  持久层
*/
@Component(value ="c")
public class Car {
    @Value(value = "我的汽车")
    private String canme;
    @Value(value = "1300000")
    private double money;

    //按类型自动注入，没有ID名称也可以   @Autowired
    //@Autowired

    //如果使用@Qualifier方式注入，就必须填写ID的名称p p是在Person类定义的注解名称
    @Qualifier(value = "p")
    private Person person;//不用提供set方法,类型自动装配的注解



    public String getCanme() {
        return canme;
    }

    public void setCanme(String canme) {
        this.canme = canme;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Car{" +
                "canme='" + canme + '\'' +
                ", money=" + money +
                ", person=" + person +
                '}';
    }
}
