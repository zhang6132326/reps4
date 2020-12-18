package com.zxf.bean4;

import org.springframework.beans.factory.FactoryBean;
//通过泛型，可以把当前工厂来看出来生产Car对象。
public class MyFacotry implements FactoryBean<Car> {
    /*
      创建对象
     */
    public Car getObject() throws Exception {
        Car car=new Car();
        car.setBrand("宝马");
        car.setPrice(400.0);;
        return car;
    }
    /*
       返回car类类型
     */
    public Class<?> getObjectType() {

        return Car.class;
    }
}
