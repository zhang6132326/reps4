package com.zxf.mapper;

import com.zxf.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    public List<Teacher> selAll();

}
