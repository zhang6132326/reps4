package com.zxf.test4;
/*
     生产者
 */
public class Producer implements Runnable {
    private Goods goods;
    public Producer(Goods goods){
        this.goods=goods;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if(i%2==0){
                goods.setBrand("娃哈哈");
                try{
                    Thread.sleep(20);
                }catch (Exception e){
                    e.printStackTrace();
                }
                goods.setName("矿泉水");
                System.out.println("生产了:"+goods.getBrand()+","+goods.getName());
            }else{
                goods.setBrand("旺仔");
                try{
                    Thread.sleep(20);
                }catch (Exception e){
                    e.printStackTrace();
                }
                goods.setName("小馒头");
                System.out.println("生产了:"+goods.getBrand()+","+goods.getName());
            }
        }
    }
}