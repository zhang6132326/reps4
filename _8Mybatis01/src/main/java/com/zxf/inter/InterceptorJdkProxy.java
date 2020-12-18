package com.zxf.inter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxy implements InvocationHandler {
    /*
       JDK 代理中使用拦截器
     */
    private Object target;//真实对象
    private String interceptorClass=null;//拦截器全限定名
    public InterceptorJdkProxy(Object target,String interceptorClass){

        this.target=target;
        this.interceptorClass=interceptorClass;
    }
    /*
        绑定委托代理对象并返回一个【代理占位】

     */
    public static Object bind(Object target,String interceptorClass){

        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new InterceptorJdkProxy(target,interceptorClass));

    }
    /*
        通过代理对象调用方法  首先进入这方法

     */

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(interceptorClass==null){
            return method.invoke(target,args);
        }

        Object result=null;

        Interceptor interceptor=(Interceptor)Class.forName(interceptorClass).newInstance();

        //调用前置方法
        if(interceptor.before(proxy,target,method,args)){
            result=method.invoke(target,args);
        }else {
            interceptor.around(proxy,target,method,args);
        }
        //调用后置方法
        interceptor.after(proxy,target,method,args);

        return result;
    }
}
