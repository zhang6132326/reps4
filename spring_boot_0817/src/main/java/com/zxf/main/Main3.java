package com.zxf.main;

import java.util.concurrent.TimeUnit;

public class Main3 {
    private static class T1 extends Thread{
        @Override
        public void run() {
            for(int i=1;i<=10;i++){
                try{
                    TimeUnit.MICROSECONDS.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("T1:"+i);
            }
        }
       private static class myRun implements Runnable{

            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    try{
                        TimeUnit.MICROSECONDS.sleep(1);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("MyRun:"+i);
                }
            }
        }
    }
    public static void main(String[] args) {
           //new T1().run();

        new Thread(()->{
            for (int i=1;i<10;i++){
                try{
                    TimeUnit.MICROSECONDS.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("Lambda:"+i);
            }
        }).start();
        new T1().start();
        new Thread(new T1.myRun()).start();
           for (int i=1;i<10;i++){
               try{
                   TimeUnit.MICROSECONDS.sleep(1);
               }catch (Exception e){
                   e.printStackTrace();
               }
               System.out.println("main:"+i);
           }


    }
}
