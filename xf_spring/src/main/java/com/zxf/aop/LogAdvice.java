package com.zxf.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component //表示spring可以扫描到该类
@Aspect //这个是一个切面类，可以定义切入点和通知
public class LogAdvice {
    @Pointcut("execution(* com.zxf.service.VideoServiceImpl.*(..))")
    public void aspect(){

    }
     //前置通知
    @Before(value = "aspect()")
    public void beforeLog(JoinPoint joinPoint){
        System.out.println("LogAdvice..beforeLog()");
    }
    //后置通知
    @After(value = "aspect()")
    public void afterLog(JoinPoint joinPoint){
        System.out.println("LogAdvice..afterLog()");
    }
    //环绕通知
    @Around("aspect()")
    public void around(JoinPoint joinPoint)  {
        Object target = joinPoint.getTarget().getClass().getName();
        System.out.println("调用者是:"+target);
        System.out.println("调用方法:"+joinPoint.getSignature());
        Object[] args = joinPoint.getArgs();
        System.out.println("参数是："+args[0]);
        long start=System.currentTimeMillis();
        System.out.println("环绕前");
        try {
            ((ProceedingJoinPoint)joinPoint).proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println("环绕前");
        System.out.println("总共花了:"+(end-start));
    }
}
