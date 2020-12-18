package com.zxf.mapper;

import com.zxf.pojo.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {
    //插入部门
    public void saveDept(Dept dept);
    //查询部门
      public List<Dept> getAlldept();
}
