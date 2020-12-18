package com.zxf.test1;
/*
     用户线程和守护线程的区别
     1 用户线程：主线程结束后。用户线程自己还会运行。
     2 守护线程：主线程结束后。守护线程也会结束。
     通过使用setDaemon()方式设置。true表示守护线程
 */
public class Main1 {
    public static void main(String[] args) {
       Thread thread=new Thread(()->{
           while (true){}
       });
       thread.setDaemon(true);
       thread.start();
       System.out.println("主线程执行完毕。");
    }
}