package com.zxf.controller;



public class Main1 {
   public static void main(String[] args){
       Phone phone=getPheon();

       System.out.println(phone.color);
   }
   public static Phone getPheon(){
       Phone phone=new Phone();
        phone.color="红色";
       return phone;
   }
}
