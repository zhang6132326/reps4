package com.zxf.controller;
import com.zxf.domain.Video;
import com.zxf.service.VideoService;
import com.zxf.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
   视频控制器
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;
    @GetMapping("list")
    public JsonData list(){
      //  int r=8/0;
        List<Video> list=videoService.listVideo();
        //return list;
        return JsonData.buildSuccess(list);
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){
        System.out.println(video.toString());
        return JsonData.buildSuccess(video);
    }

}