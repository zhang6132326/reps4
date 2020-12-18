package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class MyController5 {
    /*
    @RequestMapping(value = "/my5",method = RequestMethod.POST)
    public ModelAndView param(){
        ModelAndView mav=new ModelAndView();
         //类似于setAttribute
        mav.addObject("username","zhang3");
         //跳转页面
        mav.setViewName("ok1");
        return mav;
    }*/
    /*
    @RequestMapping(value = "/my5",method = RequestMethod.POST)
    public String param(Map<String,Object>map){
          map.put("username","zhangwangli4");
        return "ok1";
    }
    */
    @RequestMapping(value = "/my5",method = RequestMethod.POST)
    public String param(Model model){
        model.addAttribute("username","风学长");
        return "ok1";
    }
}
