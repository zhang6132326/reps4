package com.zxf.inter;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {
        public boolean before(Object proxy, Object target, Method method, Object[] args) {
            System.out.println(".....反射方法前逻辑");
            /*
                true:调用接口实现类的方法
                false:调用around方法
             */
        return !true;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {

        System.out.println("取代了被代理对象的around方法");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后逻辑......");
    }
}
