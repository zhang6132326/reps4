package com.zxf.controller;
import com.zxf.domain.City;
import com.zxf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("my1")
public class MyController1 {

    @Autowired
    CityService cityService;
    @RequestMapping("hello")
    public String hello(ModelMap modelMap){


        List<City> all = cityService.findAll();
        modelMap.addAttribute("citys",all);
        return "list";
    }
}