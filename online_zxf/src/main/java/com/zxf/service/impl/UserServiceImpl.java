package com.zxf.service.impl;
import com.zxf.model.entity.User;
import com.zxf.mapper.UserMapper;
import com.zxf.service.UserService;
import com.zxf.utils.CommonUtils;
import com.zxf.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Map;
import java.util.Random;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int save(Map<String, String> userInfo) {
          User user=parseToUser(userInfo);
          if(user!=null){
              return userMapper.save(user);
          }else {
              return -1;
          }
    }

    @Override
    public String findByPhoneAndPwd(String phone, String pwd) {
        User user=userMapper.findByPhoneAndPwd(phone,CommonUtils.MD5(pwd));
        if(user==null){
            return null;
        }else {
            String token= JWTUtils.geneJsonWebToken(user);
            return token;
        }
    }

    @Override
    public User findByUsesrId(Integer userId) {
        return userMapper.findByUserId(userId);
    }

    /*
         解析User对象
     */
    private User parseToUser(Map<String,String> userInfo){
        if(userInfo.containsKey("phone")&& userInfo.containsKey("pwd")&&userInfo.containsKey("name")){
            User user=new User();
            user.setName(userInfo.get("name"));
            user.setHead_img(getRandomImg());
            user.setCreate_time(new Date());
            user.setPhone(userInfo.get("phone"));
            String pwd=userInfo.get("pwd");
            //md5
            user.setPwd(CommonUtils.MD5(pwd));
            return user;
        }else {
            return  null;
        }
    }
    private static final String [] headImage={
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
    };
    private String getRandomImg(){
        int size=headImage.length;
        Random random=new Random();
        int index=random.nextInt(size);
        return headImage[index];
    }
}