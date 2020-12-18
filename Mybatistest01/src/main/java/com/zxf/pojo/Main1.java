package com.zxf.pojo;

public class Main1 {
    static   int i=0;  //-18950 -19040
    public static void main(String[] args){
        Long l1=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++){
            m();
            n();
        }
        System.out.println(l1-System.currentTimeMillis());
    }


    public static synchronized void m(){}
    public static void n(){i=1;
    }
}
