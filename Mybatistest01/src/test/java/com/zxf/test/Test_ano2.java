package com.zxf.test;

import com.zxf.mapper.DeptMapper;
import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_ano2 {
    @Test
    public void  test6()throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.selectDeptById_ano("103");
        System.out.print(dept.getDept_id()+" ");
        System.out.print(dept.getDept_name()+" ");
        System.out.println("本部负责人:"+dept.getDept_manager());
        System.out.println("***************************本部门员工**********************");
        List<Employee> employees = dept.getEmployees();
        for(Employee e:employees){
            System.out.println(e.getEmp_name());
        }
    }

}
