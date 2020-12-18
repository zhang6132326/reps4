package com.zxf.main;
class T8 implements Runnable{
    private int count=1000;
    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+"-->count="+count);
    }
}
public class Main8 {
    public static void main(String[] args) {
        T8 t8=new T8();
          for (int i=0;i<10;i++){
              new Thread(t8,"线程："+i).start();
          }
    }
}