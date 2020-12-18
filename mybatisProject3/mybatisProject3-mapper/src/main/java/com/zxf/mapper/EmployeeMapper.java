package com.zxf.mapper;

import com.zxf.pojo.Employee;

public interface EmployeeMapper {
    Employee selectEmployeeById(String emp_no);

}
