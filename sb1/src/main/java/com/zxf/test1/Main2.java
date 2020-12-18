package com.zxf.test1;
class TicketThread implements Runnable{
    private int cout=100;

    @Override
    public synchronized void run() {
        while (cout>0){
            try{
                Thread.sleep(0);
            }catch (Exception e){

            }
            System.out.println(Thread.currentThread().getName()+",正在出票"+(100-cout+1)+"张");
            cout--;
        }
    }
}
public class Main2 {

    public static void main(String[] args) {
        TicketThread ticketThread=new TicketThread();
        new Thread(ticketThread).start();
        new Thread(ticketThread).start();
    }
}
