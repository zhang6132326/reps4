package com.zxf.mapper;

import com.zxf.pojo.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper {
    //注解方式
  //  @Select("select * from employee_basic ")
    //查询所有
    public List<Employee> findAll();
    //保存
    public void saveEmp(Employee employee);
    //修改
    public void updateEmp(Employee employee);
    //删除
    public void delEmp(String emp_no);
    //根据ID查询
    public Employee findByidEmp(String emp_no);
    //模糊查询
    public List<Employee> findLikeEmp(String emp_name);
    //获得总记录条数
    public int getCountEmp();

    //查询员工姓名，部门名称
    public List<Employee> getallEmp_dep();


}
