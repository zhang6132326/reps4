package com.zxf.exception;
import com.zxf.utils.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/*
   异常处理类
 */
@ControllerAdvice
public class CustomExceptionHandler {
     @ExceptionHandler(value = Exception.class)
     @ResponseBody
     public JsonData handle(Exception e){
           if(e instanceof XFException){
               XFException xfException=(XFException) e;
               return JsonData.buildError(xfException.getCode(),xfException.getMsg());
           }else {
               return JsonData.buildError("全局异常，未知错误！");
           }
     }

}