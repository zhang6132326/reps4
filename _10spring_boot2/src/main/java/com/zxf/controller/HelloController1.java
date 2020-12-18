package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody
@Controller
*/
@RestController

public class HelloController1 {

    @RequestMapping("/h1")
    public String h1(){
        return "Hello World !!!";
    }
}
