package com.zxf.service;

import com.zxf.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderService {
    public int save(int userId,int videoId);

    public List<VideoOrder> listOrderByUserId(Integer userId);
}
