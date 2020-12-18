package com.zxf.test4;

public class Main {
    public static void main(String[] args) {
        Goods goods=new Goods();
        Producer producer=new Producer(goods);
        Customer customer=new Customer(goods);
        Thread t1=new Thread(producer);
        Thread t2=new Thread(customer);
        t1.start();
        t2.start();
    }
}
