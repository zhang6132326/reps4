package com.zxf;

import com.zxf.ano.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("com.zxf");
        context.refresh();
        VideoService videoService=(VideoService)context.getBean("videoService");
        videoService.findById(23);

    }
}
