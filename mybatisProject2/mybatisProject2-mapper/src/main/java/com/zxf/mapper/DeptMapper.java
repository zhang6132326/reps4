package com.zxf.mapper;

import com.zxf.pojo.Dept;

public interface DeptMapper {

    //一对多
    Dept selectDeptById(String dept_id);
}
