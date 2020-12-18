package com.zxf.inters;

import java.lang.reflect.Method;

public class Interceptor4 implements Interceptors {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器4】的before方法");
        return true;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器4】around");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器4】的after方法");
    }
}
