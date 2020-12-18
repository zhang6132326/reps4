package com.zxf.mapper;

import com.zxf.pojo.EmployeeSchool;

public interface EmployeeSchoolMapper {
    //根据员工编码查询学历信息，这个在学历表的单表查询。
    public EmployeeSchool selectEmployeeSchoolById(String emp_id);
}
