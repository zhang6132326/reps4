package com.zxf.mapper;

import com.zxf.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有 使用了resultMap属性
    public List<Student> getAllStu();
}
