package com.zxf.dao;
import com.zxf.domain.User;
import com.zxf.domain.VideoOrder;
import java.util.List;
public interface VideoOrderMapper {
    /**
     * 查询全部订单，关联用户信息
     * @return
     */
    public List<VideoOrder> queryVideoOrderList();

    /**
     * 查询全部用户的全部订单
     * @return
     */
    public List<User>queryUserOrder();


}
