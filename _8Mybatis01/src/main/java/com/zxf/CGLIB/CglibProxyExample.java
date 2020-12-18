package com.zxf.CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

public class CglibProxyExample implements MethodInterceptor {
    public Object getProxy(Class cls){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.err.println("调用对象之前");
        Object result=methodProxy.invokeSuper(proxy,args);
                System.out.println("调用真实对象后");
        return result;
    }
}
