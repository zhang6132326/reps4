package com.zxf.controller2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/page1")
public class C1 {
    @RequestMapping("/t1.do")
    public String test1(){
        System.out.println("com.zxf.controller2.C1.test1()方法执行了。。");
        return "ok2";
    }
    @RequestMapping("/t2.do")
    public ModelAndView test2(){
        System.out.println("test2()....");
        ModelAndView mv=new ModelAndView();

        mv.addObject("lists","zhangxuefeng");
        mv.setViewName("ok3");
        return mv;
    }
    @RequestMapping("/t3.do")
    public String test3(){
        System.out.println("com.zxf.controller2.C1.test3()方法执行了。。");
        //不用试图Spring配置文件的控制器了，自己写一个转发路径了。
        return "forward:/page1/pp1.jsp";     //请求转发
        //return "forward:/page1/pp1.jsp";   //重定向方式
    }
}