package com.zxf.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    //目标类
    private Object targetObject;
    //获取代理对象
    public Object newProxyInstance(Object targetObject){
        this. targetObject = targetObject;
        //绑定关系，也就是和具体的哪个实现类关联
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("JDK动态代理:"+method.getName());
        result=method.invoke(targetObject,args);
        System.out.println("JDK动态代理:"+method.getName());
        return result;
    }
}
