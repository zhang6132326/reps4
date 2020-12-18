package com.zxf.mapper;
import com.zxf.pojo.Employee;
import com.zxf.pojo.EmployeeSchool;
import org.apache.ibatis.annotations.*;

import java.util.List;
/*
     映射接口  employee
 */
public interface EmployeeMapper {
    //查询所有
    public List<Employee>findAll();
    //根据员工编号emp_no查询员工信息
    public Employee findEmpByid(String emp_no);
    //增加员工 返回值为int 表示数据库中影响了几条记录数
    public int saveEmp(Employee employee);
    //修改员工信息
    public int updateEmp(Employee employee);
    //删除员工
    public void delEmp(String emp_no);
    //模糊查询
    public List<Employee>findEmpByname(String emp_name);
    //聚合函数的使用 count avg sum max min 等等
    public int getCount();
    // 动态SQL if拼接查询
    public List<Employee> finEmp1(Employee employee);
    // sql语句 select * from employee_basic  where dept_id=104 or dept_id=101 or dept_id=102  转换动态SQL
    // 在每次查询的时候部门要查询的部门格式不统一
    public List<Employee> findbyForeach(Employee employee);
    //根据员工编号查询员工信息
   public Employee selectEmployeeById(String emp_no);
   //根据员工编号查询员工信息，主要是为了对应部门表做联合查询。
    public Employee selectEmployeeById_dept(String emp_no);


    //通过注解方式完成
     @Select("select * from employee_basic")
    /*如果我们封装的pojo层实体类的属性和数据库字段不统一怎么办?
    我们之前可以通过,在配置文件中使用<resultMap。
    那我们在注解方式怎么解决呢。
          */
    @Results(id="empMap",value = {
            @Result (property = "emp_no",column = "emp_no"),
            @Result (property = "emp_name",column = "emp_name"),
            @Result (property = "dept_id",column = "dept_id"),
            @Result (property = "emp_gender",column = "emp_gender"),
            @Result (property = "emp_marriage",column = "emp_marriage"),
            @Result (property = "emp_health",column = "emp_health"),
            @Result (property = "emp_state",column = "emp_state"),
            @Result (property = "emp_email",column = "emp_email"),
            @Result (property = "emp_nation",column = "emp_nation"),
            @Result (property = "emp_zzmm",column = "emp_zzmm"),
            @Result (property = "emp_blood",column = "emp_blood")
    })
     //查询所有
    public List<Employee> findAll_ano_emp();

    //根据ID查询
     @Select("select * from employee_basic where emp_no=#{emp_no}")
     @ResultMap(value = "empMap")//可以引用定义的  @Results(id="empMap",
    public Employee findByid_ano(String emp_no);

     //新增
    @Insert("insert into employee_basic" +
            "(emp_no,emp_name,dept_id,emp_gender,emp_marriage,emp_health,emp_state" +
            ",emp_email,emp_nation,emp_zzmm,emp_blood)" +
            " values(#{emp_no},#{emp_name},#{dept_id},#{emp_gender}," +
            "#{emp_marriage},#{emp_health},#{emp_state},#{emp_email}," +
            "#{emp_nation},#{emp_zzmm},#{emp_blood})")
    public void save_emp_ano(Employee employee);
    //修改
    //为了测试方便，这里只做了emp_name字段的修改
    @Update("update employee_basic set emp_name=#{emp_name} where emp_no=#{emp_no}")
    public void update_emp_ano(Employee employee);

    //删除
    @Delete("delete from employee_basic where emp_no=#{emp_no}")
    public void del_emp_ano(String emp_no);

    //模糊查询
    @Select("select * from employee_basic where emp_name like #{emp_name}")
    public List<Employee>findLike_emp_nao(String emp_name);

    //它要配合注解查询，
    @Select("select * from employee_basic where dept_id=#{dept_id}")
    public List<Employee>selectEmployeeByDeptId_ano(String dept_id);


}
