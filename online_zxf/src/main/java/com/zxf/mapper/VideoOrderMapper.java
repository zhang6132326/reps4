package com.zxf.mapper;

import com.zxf.model.entity.VideoOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//防止Service等调用有编译错误提示。
public interface VideoOrderMapper {
    /*
         查询用户是否购买过此商品
     */
     public VideoOrder findByUserIdAndVideoAndState(@Param("user_id")int userId,@Param("video_id")int videoId, @Param("state") int state);
    /*
       下单
     */
    public int saveOrder(VideoOrder videoOrder);

    public List<VideoOrder> listOrderByUserId(@Param("user_id") Integer userId);
}
