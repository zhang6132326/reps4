package com.zxf;


import com.zxf.aop.AnnotationAppConfig;

import com.zxf.domain.Video;
import com.zxf.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
      //  VideoService videoService=(VideoService)context.getBean("videoService");
       // videoService.findById(23);
        VideoService videoService=(VideoService)context.getBean("VideoService234");
        videoService.findById(-23);


    }
}
