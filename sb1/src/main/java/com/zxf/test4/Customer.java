package com.zxf.test4;
/*
  消费者
 */
public class Customer implements Runnable {
    private Goods goods;
    public Customer(Goods goods){
        this.goods=goods;
    }
    @Override
    public void run() {
         for(int i=0;i<10;i++){
             try{
                 Thread.sleep(20);
             }catch (Exception e){
                 e.printStackTrace();
             }
             System.out.println("消费者取走了:"+goods.getBrand()+"---"+goods.getName());
         }
    }
}
