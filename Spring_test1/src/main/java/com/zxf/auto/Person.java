package com.zxf.auto;

import org.springframework.core.StandardReflectionParameterNameDiscoverer;

public class Person {
    private Address address;
    private Car car;




    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
