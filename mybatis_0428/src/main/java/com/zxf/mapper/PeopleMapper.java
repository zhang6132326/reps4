package com.zxf.mapper;

import com.zxf.pojo.People;

import java.util.List;

public interface PeopleMapper {
    //查询所有人员
    public List<People> getAll();
    //插入
    public void savePeople(People people);

    //条件查询
    public List<People> findbyPe(People people);
    // in (id,id,id) 这样的查询
    public List<People> finByidS(People people);

}
