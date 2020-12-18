package com.zxf.strategy.improve;

public abstract class Duck {
    FlyBehavior flyBehavior;
    public abstract void display();
    public void quakc(){
        System.out.println("鸭子呱呱叫");
    }
    public void swim(){
        System.out.println("鸭子会游泳。");
    }
    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }

}
