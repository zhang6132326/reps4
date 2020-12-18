package com.zxf.c_000;

import java.util.concurrent.TimeUnit;

public class T {
    synchronized void m1(){
        System.out.println("m1 start");
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }
    synchronized void m2(){
        try{
            System.out.println("m2 Start");
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        new T().m1();
    }
}
