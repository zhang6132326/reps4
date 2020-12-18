package com.zxf.test1;
class TicketThread3 implements  Runnable{
    private int count=100;
    @Override
    public void run() {
        while (count>0 ){
            ticket();
        }
    }
    public synchronized void ticket(){
        if(count>0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            System.out.println(Thread.currentThread().getName() + ",正在出票" + (100 - count + 1) + "张");
            count--;
       }
    }
}

public class Main3 {
    public static void main(String[] args) {
        TicketThread3 ticketThread3=new TicketThread3();
        new Thread(ticketThread3).start();
        new Thread(ticketThread3).start();
        new Thread(ticketThread3).start();
        new Thread(ticketThread3).start();
    }
}
