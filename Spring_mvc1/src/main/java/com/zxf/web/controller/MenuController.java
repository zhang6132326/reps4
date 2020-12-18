package com.zxf.web.controller;

import com.zxf.web.pojo.Menu;
import com.zxf.web.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    @Resource
    private MenuService menuServiceImpl;
    @RequestMapping("show")
    @ResponseBody
    public List<Menu>show(){
        return menuServiceImpl.show();
    }
}
