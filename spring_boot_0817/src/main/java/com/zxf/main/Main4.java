package com.zxf.main;
public class Main4 {
    public static void main(String[] args)throws Exception {
        Thread t1=new Thread(()->{
           for(int i=0;i<1000;i++){
               System.out.println("t1:"+i);

           }
            try{
                Thread.sleep(5);
            }catch (Exception e){
                e.printStackTrace();
            }

        });
        Thread t2=new Thread(()->{
           try{
               t1.join();
               System.out.println("T2......");

           }catch (Exception e){
               e.printStackTrace();
           }
        });

        t1.start();
        t2.start();


    }
}
