package com.zxf.mapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeMapper {
    @Select("select * from employee_basic where emp_zzmm='好人' ")
    public List<Employee> findAll();
    @Insert("insert into employee_basic(emp_no,emp_name,dept_id,emp_gender,emp_email,emp_nation,emp_marriage,emp_health,emp_zzmm,emp_blood,emp_state) " +
            "values(#{emp_no},#{emp_name},#{dept_id},#{emp_gender},#{emp_email},#{emp_nation},#{emp_marriage},#{emp_health},#{emp_zzmm},#{emp_blood},#{emp_state})")
    public void saveEmployee(Employee employee);
}