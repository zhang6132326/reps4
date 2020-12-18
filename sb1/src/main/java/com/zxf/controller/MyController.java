package com.zxf.controller;

import com.zxf.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class MyController {
        @RequestMapping("zxf")
          //@GetMapping("z613")
        //  @ResponseBody
         public String hello(Model model){
             model.addAttribute("aa","我的大中国啊！！1");
             System.out.println("MyController");
             return "hello";
         }
         @RequestMapping("thymeleaf")
         public String  thymeleaf(ModelMap map){
            map.put("thText","th:text设置文本内容<b>加粗</b>");
            map.put("thUText","th:utext 设置文本内容:<b>加粗</b>");
            map.put("thValue","thValue 设置当前元素的value值");
            map.put("thEach","Arrays.asList(\"th:each\",\"遍历列表\")");
            map.put("thIf","msg is not null");
            map.put("thObject",new Person("zhang3",22,"男"));
            return "thymeleaf";
         }
         @RequestMapping("login")
        public String login(){
            return "login";
         }


}
