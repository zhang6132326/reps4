package com.zxf.exception;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SysExceptionResolver  implements HandlerExceptionResolver{
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object handler, Exception ex) {
        SysException e=null;
        if(ex instanceof SysException){
            e=(SysException)ex;
        }else {
            e=new SysException("维护系统中。。。。");
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("errorMsg",e.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
