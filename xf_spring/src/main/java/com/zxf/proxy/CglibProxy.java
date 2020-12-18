package com.zxf.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //目标类
    private Object targetObject;
    //绑定关系
    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        Enhancer enhancer=new Enhancer();
        //设置代理类的父类（目标类）
        enhancer.setSuperclass(this.targetObject.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类（代理对象）
        return enhancer.create();
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result=null;
         System.out.println("Cglib动态代理:"+method.getName());
         result=methodProxy.invokeSuper(o,objects);
        System.out.println("Cglib动态代理:"+method.getName());
        return result;
    }
}
