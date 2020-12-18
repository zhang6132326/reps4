package com.zxf.inters;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxyS implements InvocationHandler {
    private Object target;//真实对象
    private String interceptorClass=null; //拦截器全限定名

    public InterceptorJdkProxyS(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }
    /*
       绑定委托对象返回一个代理位置
     */
    public static Object bind(Object target,String interceptorClass){
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InterceptorJdkProxyS(target,interceptorClass));

    }
      /*
          通过代理对象调用方法，首先进入这个方法。

       */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         if(interceptorClass==null){
             //没有设置拦截器则直接反射原有方法
             return method.invoke(target,args);
         }
         Object result=null;
         Interceptors interceptors=(Interceptors)Class.forName(interceptorClass).newInstance();
         if(interceptors.before(proxy,target,method,args)){
             result=method.invoke(target,args);
         }else {
             interceptors.around(proxy,target,method,args);
         }
         interceptors.after(proxy,target,method,args);
        return result;
    }
}
