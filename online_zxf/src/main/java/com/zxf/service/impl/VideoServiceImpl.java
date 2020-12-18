package com.zxf.service.impl;
import com.zxf.config.CacheKeyManager;
import com.zxf.model.entity.Video;
import com.zxf.model.entity.VideoBanner;
import com.zxf.mapper.VideoMapper;
import com.zxf.service.VideoService;
import com.zxf.utils.BaseCache;
import org.apache.ibatis.cache.CacheKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private BaseCache baseCache;

    @Override
    public List<Video> listVideo() {
        try{
            Object cacheObj=baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_VIDEL_LIST,()->{
                List<Video> videoList=videoMapper.listVideo();
                return videoList;
            });
            if(cacheObj instanceof List){
                List<Video> videoList=(List<Video>)cacheObj;
                return videoList;
            }
        }catch (Exception e){
                e.printStackTrace();
        }
        //可以返回兜底数据，业务系统降级--》SpringCloud专题
        return null;
    }
     static int r;
    @Override
    public List<VideoBanner> listBanner() {

        try {
            Object cacheObj = baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_BANNER_KEY, () -> {



            System.out.println(r++);
                List<VideoBanner> bannerList = videoMapper.listVideoBanner();
                System.out.println("从数据库里面找轮播图列表");
                return bannerList;

            });
            if(cacheObj instanceof List){
                List<VideoBanner> bannerList=(List<VideoBanner>)cacheObj;
                return bannerList;
            }
        }catch (Exception e){e.printStackTrace();}

        return null;




    }
    @Override
    public Video findDetailByid(int videoId) {
        //单独构建一个缓存key ,每个视频的key是不一样的。
        String videoCacheKey=String.format(CacheKeyManager.VIDEO_DETAIL,videoId);
        try{
            Object cacheObject=baseCache.getOneHourCache().get(videoCacheKey,()->{
                Video video=videoMapper.findDetailByid(videoId);
                return video;
            });
            if(cacheObject instanceof  List){
                Video video=(Video)cacheObject;
                return video;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
      return null;
    }
}
