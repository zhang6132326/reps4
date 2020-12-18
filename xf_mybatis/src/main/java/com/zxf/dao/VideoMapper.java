package com.zxf.dao;

import com.zxf.domain.Video;
import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {
    /**
     * 根据视频id查找视频对象
     * @param videoId
     * @return
     */
    public Video selectById(@Param("video_id") int videoId);
    /**
     * 查询全部视频列表
     * @return
     */
    @Select("select * from video")
    List<Video>selectlist();

    public List<Video>selectListByXML();

    /**
     * 根据评分和标题模糊查询
     * @param point
     * @param title
     * @return
     */
    public List<Video> selectByPointAndTitleLike(@Param("point") double point,@Param("title") String title);
    /**
     * 新增一条视频记录
     * @param video
     * @return
     */
    public int add(Video video);

    /**
     * 批量插入
     * @param listVideo
     * @return
     */
    public int addBatch(List<Video> listVideo);

    /**
     * 更新视频
     * @param video
     * @return
     */
    public int updateVideo(Video video);

    /**
     * 动态选择更新
     * @param video
     * @return
     */
    public int updateVideoSelective(Video video);

    /**
     * 根据时间和价格删除
     * @param map
     * @return
     */
    public int deleteByCreateTimeAndPrice(Map<String,Object>map);
    /**
     * 根据id查询视频
     * @param id
     * @return
     */
    public Video selectBaseFieldByidWithResultMap(@Param("video_id") int id);

}
