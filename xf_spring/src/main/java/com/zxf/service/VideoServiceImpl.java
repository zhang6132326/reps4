package com.zxf.service;

import com.zxf.domain.Video;
import org.springframework.stereotype.Service;

@Service("VideoService234")
public class VideoServiceImpl implements VideoService {
    @Override
    public int save(Video video) {
        System.out.println("保存video");

        return 1;
    }

    @Override
    public Video findById(int id) {
        try{
            Thread.sleep(500);
        }catch (Exception e){}
        System.out.println("根据id找视频");

        return new Video();
    }
}
