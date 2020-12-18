package com.zxf.bean5;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;
@Component //注解方式定义一个类似bean对象标签
@Aspect//标注当前类为切面
public class MyAspect {
    /*
      前置通知
       value属性必须写。
    */
    //@Before(value = "execution(* com.zxf.bean5.MathImpl.add(..))")//为某一个方法写aop
    //@Before(value = "execution(* com.zxf.bean5.MathImpl.*(..))")//类下的所有方法
    @Before(value = "execution(* com.zxf.bean5.*.*(..))")//包下的所有类的所有方法
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();//获取方法参数
        String methodName=joinPoint.getSignature().getName();//获取方法名
        System.out.println("方法名:"+methodName+",方法参数:"+ Arrays.toString(args)+".....方法执行之前");
    }
    /*
      后置通知
     */
    @After(value = "execution(* com.zxf.bean5.*.*(..))")
    public void afterMethod(){
        System.out.println("方法执行之后........");
    }
    /*
        也是后置通知，可以带返回值
        如果目标方法是void返回null
     */
    @AfterReturning(value = "execution(* com.zxf.bean5.*.*(..))",returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint,Object result){
        System.out.println("后置返回:"+result);
    }
    /*
       异常通知
     */
    @AfterThrowing(value = "execution(* com.zxf.bean5.*.*(..))",throwing = "ex")
    public void afterThowingMethod(Exception ex){
        System.out.println("*******有了异常。。。。。"+ex.getMessage());
    }

    /*
        环绕通知
     */
    @Around(value = "execution(* com.zxf.bean5.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
            Object result=null;
        try{
            System.out.println("环绕前置");
             result =joinPoint.proceed();
             return result;
        }catch (Throwable e){
            System.out.println("环绕异常");
        }finally {
            System.out.println("环绕后置");
        }
        return null;
    }

}
