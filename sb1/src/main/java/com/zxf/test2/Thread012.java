package com.zxf.test2;

public class Thread012 {
    public static void main(String[] args) {
        new Thread012().start();

    }
    synchronized void start(){
        try {
           // new Thread012().wait();
         this.wait();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
