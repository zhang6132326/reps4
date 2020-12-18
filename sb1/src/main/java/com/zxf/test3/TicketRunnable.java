package com.zxf.test3;


public class TicketRunnable implements Runnable {
    private int ticket=5;
    @Override
    public void run() {
        while (ticket>0){
            try{
                Thread.sleep(9);
            }catch (Exception e){
                e.printStackTrace();
            }
            synchronized (this){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在出售第:"+((5-ticket)+1)+"张票");
                    ticket--;
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketRunnable ticketRunnable=new TicketRunnable();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
    }
}
