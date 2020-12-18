package com.zxf.strategy.improve;
public class NoFlyBehaviro implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");

    }
}
