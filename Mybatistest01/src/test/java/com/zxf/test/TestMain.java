package com.zxf.test;

import org.junit.Test;

public class TestMain {
    public static  int i=1;  //-19053 -20293
    @Test
    public void test1(){
        Long l1=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++){
            m();
            n();
        }
        System.out.println(l1-System.currentTimeMillis());
    }
    public  synchronized void m(){i=1;}
    public  void n(){i=1;
    }
}
