package com.zxf.mapper;

import com.zxf.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
        //插入员工
    public void saveEmp(Employee employee);
        //查询员工信息表
    public List<Employee> getAllEmp();

}
