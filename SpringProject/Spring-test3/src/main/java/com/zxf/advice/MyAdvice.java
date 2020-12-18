package com.zxf.advice;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
    public void  mybeofre(){
        System.out.println("前置........");
    }
    public void  myafter(){
        System.out.println("后置........");
    }
    public void mythrow(){
        System.out.println("环绕异常通知");
    }
    public Object myarround(ProceedingJoinPoint pjo) throws Throwable{

        System.out.println("。。。执行环绕。。。");
        System.out.println("......环绕前置");
            Object obj=pjo.proceed();
        System.out.println("环绕后置........");
         return obj;
    }
}
