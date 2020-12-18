package com.zxf.test2;
public class B {
    private A a=new A();
    public int f1(int a,int b){
        return a+b;
    }
    public int f2(int a,int b){
        return f1(a,b)+9;
    }
    public int f3(int a,int b){
        return  this.a.f1(a,b);
    }
}
