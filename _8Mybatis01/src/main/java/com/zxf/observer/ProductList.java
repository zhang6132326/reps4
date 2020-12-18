package com.zxf.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    private List<String> productList=null;//产品列表
    private static ProductList instace;//类唯一实例
    private ProductList(){}
    /*
         取得唯一实例

     */
    public static ProductList getInstance(){
        if(instace==null){
            instace=new ProductList();
            instace.productList=new ArrayList<String>();
        }
        return instace;
    }
    /*
        增加观察者（电商接口）

    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }
 */
    /*
         新增产品
     */
    public void addProudct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品增加了:"+newProduct);
        this.setChanged();//设置被观察对象的变化
        this.notifyObservers(newProduct);//通知观察者，并传递新产品
    }

}
