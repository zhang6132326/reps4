package com.zxf.mapper;

import com.zxf.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee selectEmployeeById(String id);

    //一对多
    List<Employee> selectEmployeeByDeptId(String dept_id);

}
