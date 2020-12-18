package com.zxf.test3;
class T1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100000000;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
public class Main1 {

    public static void main(String[] args) {
        new T1().start();
        new T1().start();
        new T1().start();

        for (int i = 0; i <100000000 ; i++) {
            System.out.println("main:"+i);
        }






    }
}
