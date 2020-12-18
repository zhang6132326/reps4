package com.zxf.sboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello(){
        return "123hello SpringBoot!!123456";
    }
}
