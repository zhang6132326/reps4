package com.zxf.mapper;

import com.zxf.model.entity.Video;
import com.zxf.model.entity.VideoBanner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//防止Service层调用有编译错误提示
public interface VideoMapper {
    /*
         查询视频列表
     */
    public List<Video> listVideo();
   /*
        首页录播图列表

    */

    List<VideoBanner> listVideoBanner();

    /*
        查询视频详情
     */
    Video findDetailByid(@Param("video_id")int videoId);
    /*
        简单查询视频信息
     */
    public Video findById(@Param("video_id")int videoId);

}
