package com.zxf.mapper;

import com.zxf.pojo.Dept;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import sun.swing.MenuItemLayoutHelper;

import java.util.List;

public interface DeptMapper {

   @Select("select * from dept")
   public List<Dept> getall_dept();

   /*
        配合多对一查询的第二个SQL语句  根据部门ID进行查询

    */
   @Select("select * from dept where dept_id=#{dept_id}")
   public List<Dept> finByIdDept(String dept_id);

  /*
        根据部门查询下面的所有员工  一对多   部门--》员工
   */
  @Select("select * from dept")
  @Results(id="d_e",value = {
          @Result(property="dept_id",column="dept_id"),
          @Result(property = "dept_name",column = "dept_name"),
          @Result(property = "employees",column = "dept_id",
                  many = @Many(select = "com.zxf.mapper.EmployeeMapper.findBydeptEmp",
                          fetchType = FetchType.LAZY))
  })
  public List<Dept> getall_d_e();

}
