package com.zxf.strategy.improve;

public class PekinigDuck extends Duck {
    public PekinigDuck(){
        flyBehavior=new BadFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
