package com.zxf.ano.service;

import com.zxf.domain.Video;

public interface VideoService {
    int save(Video video);
    Video findById(int id);
}
