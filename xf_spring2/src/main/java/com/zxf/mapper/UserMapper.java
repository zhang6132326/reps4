package com.zxf.mapper;

import com.zxf.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Insert("insert into user (name,pwd,head_img,phone,create_time) values(#{name},#{pwd},#{head_img},#{phone},#{create_time})")
        public int save(User user);
}
