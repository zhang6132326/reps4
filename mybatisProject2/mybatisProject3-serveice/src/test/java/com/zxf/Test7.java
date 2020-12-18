package com.zxf;
import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import java.io.InputStream;
import java.util.List;

public class Test7 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private EmployeeMapper employeeMapper;
      private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        employeeMapper=session.getMapper(EmployeeMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }
    @Test
    public void test1(){

        List<Employee> employees = employeeMapper.selectEmployeeByDeptId("101");

           for(Employee e:employees){
                  System.out.print(e.getDept().getDept_name());
              System.out.println(e.getEmp_name());
          }

    }
}
