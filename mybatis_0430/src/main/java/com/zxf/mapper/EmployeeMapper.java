package com.zxf.mapper;

import com.zxf.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
       //写的是2个表联合的SQL语句，这样写无法实现延迟加载。
      //多对一
      //     员工--->部门
    public List<Employee> getallE_D();
    /*
         1 实现延迟加载
         2 多对一的表现  员工-->部门
     */
    public List<Employee> getAllE_D2();
     /*
          根据员工部门编号查询员工信息
          这样就可以和查询部门的时候组合在一起完成延迟加载
      */
     public List<Employee> findBydeptIdEmp(String dept_id);

}
