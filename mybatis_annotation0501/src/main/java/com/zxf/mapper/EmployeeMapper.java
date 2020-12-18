package com.zxf.mapper;

import com.zxf.pojo.Employee;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface EmployeeMapper {
      @Select("select * from employee_basic")
    public List<Employee> getall_mep();

      /*
            延迟加载---多对一   员工--》部门

       */

      @Select("select * from employee_basic")
      @Results(id="e_d",value = {
            @Result(property = "emp_no",column = "emp_no"),
            @Result(property = "emp_name",column = "emp_name"),
            @Result(property = "dept",column = "dept_id",
                    one=@One(select = "com.zxf.mapper.DeptMapper.finByIdDept",
                            fetchType = FetchType.LAZY))
      })
      public List<Employee> getall_e_d();
      /*

           配合一对多查询。根据部门ID查询员工

       */
      @Select("select * from employee_basic where dept_id=#{dept_id}")
      public List<Employee> findBydeptEmp(String dept_id);

}
