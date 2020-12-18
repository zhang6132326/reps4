package com.zxf.demo8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
 //表示切面类
@Aspect
public class MyAnnoAspect {

    //@Before(value = "execution(* com.zxf.demo8.EmpServiceImpl.save(..))")
    @After(value = "execution(* com.zxf.demo8.EmpServiceImpl.save(..))")
    public void log(){
        System.out.println("com.zxf.demo8.MyAnnoAspect.log()增强方法执行了。。");
    }
}
