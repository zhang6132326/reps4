package com.zxf.web.service.impl;

import com.zxf.web.mapper.FlowerMapper;
import com.zxf.web.pojo.Flower;
import com.zxf.web.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerMapper flowerMapper;

    public FlowerMapper getFlowerMapper() {
        return flowerMapper;
    }

    public void setFlowerMapper(FlowerMapper flowerMapper) {
        this.flowerMapper = flowerMapper;
    }

    public List<Flower> show() {
        return  flowerMapper.getAll();
    }
}
