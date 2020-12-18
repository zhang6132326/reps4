package com.zxf.main;
/*
    群主发红包
 */

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){}
    public Manager(String name,int money){
        super(name,money);
    }
   public ArrayList<Integer> send(int totalMoney,int count){
        //需要一个集合，用于存储若干个红包。
       ArrayList<Integer> redList=new ArrayList<Integer>();
       //首先查看一下群主钱包有多少钱了。
       int leftMoney=super.getMoney(); //群主当前余额
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }
       //扣钱，从群主的钱包里面扣钱。
       super.setMoney(leftMoney-totalMoney);
        //发红包，分成count份
       int avg=totalMoney/count;
       int mod=totalMoney%count;//余数，除不开这样处理。
       //除不开的零头，包在最后一个红包当中。
       //红包一个一个的放在集合中
       for(int i=0;i<count-1;i++){
           redList.add(avg);
       }
       //最后一个红包
       int last=avg+mod;
       redList.add(last);

        return redList;
   }

}
