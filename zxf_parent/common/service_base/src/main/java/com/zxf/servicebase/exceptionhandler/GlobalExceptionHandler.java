package com.zxf.servicebase.exceptionhandler;
import com.zxf.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/*
   统一异常处理类
 */
@ControllerAdvice
@Slf4j  //这样就可以往日志里写入异常日志信息了
public class GlobalExceptionHandler {
     //指定出现Exception异常执行这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody//为了返回数据
    public R error(Exception e){
       e.printStackTrace();
       log.error("我是Exception："+e.getMessage());  //写入异常信息
       return R.error().message("执行了全局异常处理。");
    }

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        e.printStackTrace();
        log.error("我是ArithmeticException："+e.getMessage());  //写入异常信息 除零异常 /by zero
        return R.error().message("执行了ArithmeticException异常处理");
    }
    //自定义异常使用
    @ExceptionHandler(ZxfException.class)
    @ResponseBody
    public R error(ZxfException e){
        e.printStackTrace();
        log.debug("我是ZxfException:"+e.getMsg());  //写入异常信息
        return R.error().code(e.getCode()).message(e.getMsg());
    }

}
