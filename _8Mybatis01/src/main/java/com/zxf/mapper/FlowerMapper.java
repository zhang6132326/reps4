package com.zxf.mapper;

import com.zxf.pojo.Flower;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FlowerMapper {
    public void addFlower(Flower flower);
    public Flower getById_nameFlower(@Param("id")Integer id,@Param("name")String name);
    public Flower getByMapFlower(Map map);
    public List<Flower> getAllFlower();
}
