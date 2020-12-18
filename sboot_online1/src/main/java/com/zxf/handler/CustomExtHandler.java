package com.zxf.handler;

import com.zxf.utils.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
/*
   定义了一个全局异常
   当程序有异常的时候，会自动触发调用该类。
 */
//@RestControllerAdvice
@ControllerAdvice
public class CustomExtHandler {
    /*
      //需要这个@RestControllerAdvice注解
    @ExceptionHandler(value =Exception.class)
    public Object handlerException(Exception e, HttpServletRequest request){
     return  JsonData.buildError("服务器出问题了", -2);
    }
     */
    /*
       出现异常以后会跳转一个页面进行友好提示。

     */
    //需要这个@@ControllerAdvice注解
    @ExceptionHandler(value = Exception.class)
    public Object handlerException(Exception e,HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
         modelAndView.setViewName("error.html");
         modelAndView.addObject("msg",e.getMessage());
        return modelAndView;
    }
}
