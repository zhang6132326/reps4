package com.zxf.test3;

public class Customer implements OrderInterface{

    @Override
    public String order(String foodname){
        return "已经下单了"+foodname;
    }
    /*
        我增加了东西
          要不在写点什么吧。。。。。？
     */
}
