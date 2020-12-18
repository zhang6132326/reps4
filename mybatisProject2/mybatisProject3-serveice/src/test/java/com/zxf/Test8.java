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

import java.io.InputStream;
import java.util.List;

public class Test8 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private DeptMapper deptMapper;
    private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        deptMapper=session.getMapper(DeptMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }

    @Test
    public void test1(){
        Dept dept = deptMapper.selectDeptById("103");
        System.out.println(dept.getDept_name());
        System.out.println("___________________________________");
        List<Employee> employees = dept.getEmployees();
        for(Employee e:employees){
            System.out.println(e.getEmp_name());
        }
    }
}
