package com.zxf.service;

import com.zxf.domain.Video;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VideoService {
    List<Video> listVideo();
}
