package com.zxf.service;

import com.zxf.model.entity.Video;
import com.zxf.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {
    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailByid(int videoId);
}
