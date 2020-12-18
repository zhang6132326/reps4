package com.zxf.main;

public class Main5 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread....");
        }
    }
    static class MyRun implements Runnable{

        @Override
        public void run() {
            System.out.println("MyRun....");
        }
    }
    public static void main(String[] args) {
         new MyThread().start();
         new Thread(new MyRun()).start();
         new Thread(()->{
            System.out.println("Lambda...");
         }).start();
    }
}
