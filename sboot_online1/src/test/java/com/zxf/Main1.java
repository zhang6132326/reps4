package com.zxf;
import com.zxf.dLambda.*;
import org.junit.Test;
public class Main1 {
    @Test
    public void test1(){
        //无参  无返回值
        NoneReturnParameter lamdba1=()->{
          System.out.println("这是一个无参数，无返回值的方法。");
        };
        lamdba1.f1();
    }
    @Test
    public void test2(){
        //一个参数，没有返回值
        NoneReturnSingleParameter lambad2=(int x)->{
            System.out.println("一个参数，没有返回值！"+x);
        };
        lambad2.f1(324);
    }
    @Test
    public void test3(){
        //多个参数，无返回值。
        NoneReturnMutipleParameter lambad3=(int x,int y)->{
            System.out.println("多个参数，无返回值"+(x+y));
        };
        lambad3.f1(4,5);
    }
    @Test
    public void test3_1(){
        //多个参数，无返回值。简略写法。
        NoneReturnMutipleParameter lambad3_1=(x,y)->System.out.println("多个参数，无返回值"+(x+y));
        lambad3_1.f1(2,3);
    }
    @Test
    public void test4(){
        //无参，有返回值。
        SingleReturnNoneParameter lambad4=()->{
          return 34;
        };
        int x=lambad4.f1();
        System.out.println(x);
    }
    @Test
    public void test5(){
        //一个参数 有返回值
        SingleReturnSingleParameter lambad5=(int x)->{
            return x+5;
        };
        int i = lambad5.f1(30);
        System.out.println(i);
    }
    @Test
    public void test5_1(){
        //一个参数 有返回值 ，简略写法。
          /*
             可以省略参数的类型定义，还可以省略{}；
         */
        SingleReturnSingleParameter lambad5_1=x->x+5;
        int i=lambad5_1.f1(15);
        System.out.println(i);
    }
    @Test
    public void test6(){
        //多个参数，有返回值
        SingleReturnMutipleParameter lambad6=(int x,int y)->{
            return "计算的结果为:"+(x+y);
        };
        String s = lambad6.f1(5, 5);
        System.out.println(s);
    }

}
