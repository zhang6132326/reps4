package com.zxf.web.mapper;

import com.zxf.web.pojo.Flower;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FlowerMapper {
    @Select("select * from flower")
    List<Flower> getAll();
}
