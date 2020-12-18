package com.zxf.factory1;

public class CarFactory {
    public CarFactory(){
        System.out.println("CarFactory");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car ceateCar(){
        if(name.equals("bwm")){
            return new Bwm();
        }else {
            return new Audi();
        }
    }
}
