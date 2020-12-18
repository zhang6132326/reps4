package com.zxf.mapper;

import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface DeptMapper {
    //根据部门ID 查询部门信息
    Dept selectDeptById(String dept_id);

   //根据部门ID 查询部门信息，做注解
    @Select("SELECT * from dept WHERE dept_id=#{dept_id}")
    @Results(value = {
            @Result(property = "dept_id",column = "dept_id"),
            @Result(property = "dept_name",column = "dept_name"),
            @Result(property = "dept_manager",column = "dept_manager"),
            @Result(property = "employees",column="dept_id",many=@Many(select="com.zxf.mapper.EmployeeMapper.selectEmployeeByDeptId_ano",fetchType = FetchType.LAZY))
    })
   Dept selectDeptById_ano(String dept_id);

}
