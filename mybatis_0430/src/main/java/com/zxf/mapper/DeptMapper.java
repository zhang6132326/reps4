package com.zxf.mapper;

import com.zxf.pojo.Dept;


import java.util.List;

public interface DeptMapper {

     //部门和员工的一对多关系  部门--->员工
    public List<Dept> getall_dept_allemp();
     /*
         分2个SQL语句使用延迟加载
     */
     public List<Dept> getall_dept_allemp2();

    //根据部门ID查询部门
    public Dept findByIdDept(String dept_id);




}
