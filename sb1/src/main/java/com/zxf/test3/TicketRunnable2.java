package com.zxf.test3;

public class TicketRunnable2 implements Runnable {
    private int ticket=50;
    @Override
    public void run() {
        while (ticket>0){
            try{
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
            sale();
        }
    }
    public synchronized   void  sale(){

        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+" 正在出售sd第:"+((50-ticket)+1)+"张票");
            ticket--;
        }
    }

    public static void main(String[] args) {
        TicketRunnable2 ticketRunnable=new TicketRunnable2();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
    }
}
