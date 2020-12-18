package com.zxf.strategy.improve;

public class ToyDuck extends Duck {
    public ToyDuck(){
        flyBehavior=new NoFlyBehaviro();
    }
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

}
