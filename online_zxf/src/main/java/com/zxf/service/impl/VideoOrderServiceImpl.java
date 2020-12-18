package com.zxf.service.impl;

import com.zxf.exception.XFException;
import com.zxf.mapper.EpisodeMapper;
import com.zxf.mapper.PlayRecordMapper;
import com.zxf.mapper.VideoMapper;
import com.zxf.mapper.VideoOrderMapper;
import com.zxf.model.entity.Episode;
import com.zxf.model.entity.PlayRecord;
import com.zxf.model.entity.Video;
import com.zxf.model.entity.VideoOrder;
import com.zxf.service.VideoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
//@Transactional //不建议整个类都开启事务，这样很耗费资源。给具体的方法开启事务
public class VideoOrderServiceImpl implements VideoOrderService {

    @Autowired
    private VideoOrderMapper videoOrderMapper;

    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private EpisodeMapper episodeMapper;
    @Autowired
    private PlayRecordMapper playRecordMapper;

    /*
        下单操作

     */
    @Override
    @Transactional //给当前具体的方法开始事务
    public int save(int userId, int videoId) {
        //判断是否已经购买
        VideoOrder videoOrder=videoOrderMapper.findByUserIdAndVideoAndState(userId,videoId,1);
        if(videoOrder!=null){
            return 0;
        }
        Video video=videoMapper.findById(videoId);

        VideoOrder newVideoOrder=new VideoOrder();
           newVideoOrder.setCreate_time(new Date());
           newVideoOrder.setOut_trade_no(UUID.randomUUID().toString());
           newVideoOrder.setState(1);
           newVideoOrder.setTotal_fee(video.getPrice());
           newVideoOrder.setUser_id(userId);

           newVideoOrder.setVideo_id(videoId);
           newVideoOrder.setVideo_img(video.getCover_img());
           newVideoOrder.setVideo_title(video.getTitle());
            int rows=videoOrderMapper.saveOrder(newVideoOrder);
             //生成播放记录
             if(rows==1){
            Episode episode=episodeMapper.findFirstEpisodeByVideoId(videoId);
            if(episode==null){
                throw new XFException(-1,"视频没有集信息，请联系管理员");
            }
            PlayRecord playRecord=new PlayRecord();
               playRecord.setCreate_time(new Date());
               playRecord.setEpisode_id(episode.getId());
               playRecord.setCurrent_num(episode.getNum());
               playRecord.setUser_id(userId);
               playRecord.setVideo_id(videoId);
               playRecordMapper.saveRecord(playRecord);

        }

        return rows;
    }

    @Override
    public List<VideoOrder> listOrderByUserId(Integer userId) {
         return videoOrderMapper.listOrderByUserId(userId);
    }
}
