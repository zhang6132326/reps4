package com.zxf.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController1 {
    /*
       SpringMVC 使用json
        1 导入json依赖坐标
        2 配置文件中开启mvc驱动  <mvc:annotation-driven/>
        3  加上注解@ResponseBody

    */
    @RequestMapping("/testJson")
    @ResponseBody  //加了响应体以后，就不会返回到试图名称对应的页面。
    public List<String> testJson(){
        System.out.println("ok....");
        List <String> list=new ArrayList<String>();
        for(int i=0;i<300;i++){
            list.add("abc:"+i);
        }
        return list;
    }
}
