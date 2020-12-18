package com.zxf.mapper;

import com.zxf.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> getAll();
    public Employee getByIdEmp(String emp_no);
    public Employee getByIdEmp_dept(String emp_no);
    public Employee getByidEmp_dept2(String emp_no);
    public List<Employee> getByIdDept(String dept_id);
    //动态SQL练习
    public List<Employee> getAll2(Employee employee);
    //choose 标签使用
    public List<Employee> getAll3(Employee employee);
    // update语句更新时候使用 <set>标签，可以保证没有更新的字段不受SQL语法限制
    public void updateByIdEmp(Employee employee);
    //使用 select   in 语句select * from employee_basic where emp_no in
    public List<Employee> getByidEmps(@Param("listabc") List asdfasd);
    //批量写入
    public void saveEmp(@Param("es") List<Employee> employees);
    //配合使用<sql>标签完成查询
    public List<Employee> getAll4();
    public void saveEmp2(Employee employee);

}
