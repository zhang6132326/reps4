package com.zxf.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArround implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前");
        Object obj=invocation.proceed();
        System.out.println("环绕后");
        return obj;
    }
}
