package com.zxf.spring2;
public class CarFactory {
    private String name;

    public CarFactory(){
        System.out.println("CarFactory构造方法创建了。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar()throws Exception{
        if(name.equals("audi")){
            return new Audi();
        }else if(name.equals("bmw")){
            return new Bmw();
        }
        else {
            throw new Exception("暂时无法产生汽车");
        }
    }
}