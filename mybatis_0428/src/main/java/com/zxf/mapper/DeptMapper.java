package com.zxf.mapper;

import com.zxf.pojo.Dept;
import com.zxf.pojo.Emp_dept;

import java.util.List;

public interface DeptMapper {
    public List<Emp_dept> getallE_D();
     //部门和员工的一对多关系
    public List<Dept> getall_dept_allemp();


}
