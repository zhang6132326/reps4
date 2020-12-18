package com.zxf.test3;
public class JoinTest {
    public static void main(String[] args) {
        MyRun myRun=new MyRun();
        Thread thread=new Thread(myRun);
        thread.start();
        Thread thread2=new Thread(myRun);
        thread2.start();
        Thread thread3=new Thread(myRun);
        thread3.start();
        for (int i = 0; i <150 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==23){
                try {
                    System.out.println("***");
                    //thread.join();//停止当前线程，让其他线程执行完毕以后，在执行。
                 //   Thread.sleep(1);//睡眠的是偶，程序阻塞状态，这个时候其他线程可以进入执行。睡眠时间到了以后，继续抢占运行权限。
                    Thread.yield();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}