package com.zxf.mapper;

import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;

import java.util.List;

public interface DeptMapper {
    public Dept getDeptById(String dept_id);
    //分步骤用了2个SQL语句完成
    public Dept getDeptById_Emp(String dept_id);
    //1个联合查询的SQL语句
    public Dept getDeptById_Emp2(String dept_id);
}
