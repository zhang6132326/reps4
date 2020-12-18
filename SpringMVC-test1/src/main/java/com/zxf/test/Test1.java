package com.zxf.test;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test1 {
    public static void main(String[] args){
          SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         System.out.println(sdf.format(new Date()));
    }
}