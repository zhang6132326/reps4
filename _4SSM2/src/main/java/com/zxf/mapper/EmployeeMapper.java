package com.zxf.mapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmployeeMapper {
    @Select("select * from employee_basic")
    public List<Employee> findAll();


    @Insert("insert into employee_basic(emp_no,emp_name,dept_id,emp_gender,emp_email,emp_nation,emp_marriage,emp_health,emp_zzmm,emp_blood,emp_state) " +
            "values(#{emp_no},#{emp_name},#{dept_id},#{emp_gender},#{emp_email},#{emp_nation},#{emp_marriage},#{emp_health},#{emp_zzmm},#{emp_blood},#{emp_state})")
    public void saveEmployee(Employee employee);


    @Delete("delete from employee_basic where emp_no=#{emp_no}")
    public void delEmp(String emp_no);

    @Update("update employee_basic " +
            "set emp_name=#{emp_name},dept_id=#{dept_id},emp_gender=#{emp_gender},emp_email=#{emp_email},emp_nation=#{emp_nation},emp_marriage=#{emp_marriage},emp_health=#{emp_health},emp_zzmm=#{emp_zzmm},emp_blood=#{emp_blood},emp_state=#{emp_state}" +
            " where  emp_no=#{emp_no} ")
    public void updateEmp(Employee employee);

    @Select("select * from employee_basic where  emp_no=#{emp_no}")
    public Employee findByIdEmp(String emp_no);


}
