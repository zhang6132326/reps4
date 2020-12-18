package com.zxf.controller;

import com.zxf.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pri/order")
public class VideoOrderController {
    @RequestMapping("save")
    public JsonData saveOrder(){
        return JsonData.buildSuccess("下单成功了!");
    }
}
