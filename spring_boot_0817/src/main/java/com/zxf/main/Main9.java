package com.zxf.main;
class Account9{
      String name;
      double balance;
    public synchronized void set(String name,double balance){
        this.name=name;
        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.balance=balance;
    }
     public /*synchronized*/ double getBalances(){
        return this.balance;
     }
}
public class Main9 {
    public static void main(String[] args) {
        Account9 account9=new Account9();
            new Thread(()->{
                account9.set("zhang",100);
            }).start();
        try{
            Thread.sleep(5);
        }catch (Exception e){
            e.printStackTrace();
        }
      System.out.println(account9.getBalances());
        try{
            Thread.sleep(5);
        }catch (Exception e){
            e.printStackTrace();
        }
      System.out.println(account9.getBalances());
    }
}