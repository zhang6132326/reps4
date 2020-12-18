package com.zxf.main;

public class Main6_Sleep_Yield_join {
    public static void main(String[] args) {
        //testSleep();
        testYield();
    }
    static void testSleep(){
        new Thread(()->{
            for (int i=1;i<100;i++){
                System.out.println("A:"+i);
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
    static void testYield(){
        new Thread(()->{
            for (int i=1;i<=100;i++){
                System.out.println("A:"+i);
                if(i%7==0){
                    Thread.yield();

                }
            }
        }).start();
        new Thread(()->{
            for(int i=1;i<=100;i++){
                System.out.println("B............:"+i);
                if(i%7==0){
                    Thread.yield();
                    System.out.println("b:yield");
                }
            }
        }).start();
    }
}
