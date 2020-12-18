package com.zxf.ano.service;

import com.zxf.ano.config.ZhangConfig;
import com.zxf.ano.dao.VideDao;
import com.zxf.dao.VideoDao;
import com.zxf.domain.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("videoService")
@Service("videoService")
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideDao videoDao;
    @Autowired
    private ZhangConfig zhangConfig;

    @Override
    public int save(Video video) {
        System.out.println("保存video");


        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("name:"+zhangConfig.getName());
        System.out.println("sex:"+zhangConfig.getSex());
        System.out.println("age:"+zhangConfig.getAge());
        System.out.println("根据id找视频");
       // videoDao.test();
        return new Video();
    }
}
