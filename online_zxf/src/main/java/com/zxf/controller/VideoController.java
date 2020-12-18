package com.zxf.controller;
import com.zxf.model.entity.Video;
import com.zxf.model.entity.VideoBanner;
import com.zxf.service.VideoService;
import com.zxf.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

     /*
         轮播图列表
      */
    @GetMapping("list_banner")
    public JsonData indexBanner(){
        List<VideoBanner> bannerList=videoService.listBanner();
        return JsonData.buildSuccess(bannerList);
    }

  /*
     视频列表
   */
    @RequestMapping("list")
    public JsonData listVideo(){
     List<Video> videoList =videoService.listVideo();
        return JsonData.buildSuccess(videoList);
    }
    /*
    视频详情 包含 （章，集）信息
     */
    @GetMapping("find_detail_by_id")
    public JsonData findDetailByid(@RequestParam(value = "video_id",required = true)int videoId){
       Video video=videoService.findDetailByid(videoId);
              return JsonData.buildSuccess(video);
    }
}
