package com.zxf.service;

import com.zxf.pojo.Flower;
import com.zxf.pojo.PageInfo;

import java.util.List;
import java.util.Map;

public interface FlowerService {
    public List<Flower> getAll();
    public int selById();
    public Map<Object,Object> seleMap();
    public Flower selById2(int id);
    public Flower selById3(Flower flower);
    public Flower selById4(Map map);
    public List<Flower> page(int pagesize,int pagenumber);
    public int insertFlower(Flower flower);
    public PageInfo showPage(int pageSize,int pageNumber );

}
