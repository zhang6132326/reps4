package com.zxf.conntoller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController2 {
    @ResponseBody
    @RequestMapping("/h2")
    public String  h2(){
        return "helloWorld222222!!!!!";
    }
}
