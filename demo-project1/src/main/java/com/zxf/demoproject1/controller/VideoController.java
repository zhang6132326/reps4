package com.zxf.demoproject1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @RequestMapping("list")
    public Object list(){
        Map<String ,String > map=new HashMap<>();
          map.put("1","java");
        map.put("2","jsp");
        map.put("3","oracle");
        map.put("4","mysql数据库");
        map.put("5","php网站管理");
        return map;
    }
}
