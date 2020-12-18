package com.zxf.main;
class T7{
    private int count=10;
    private Object o=new Object();
    public void m(){
        synchronized (o){
            count--;
            System.out.println(Thread.currentThread().getName()+"count="+count);
        }
    }
}
public class Main7 {
    public static void main(String[] args) {

    }
}
