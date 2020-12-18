package com.zxf;
import com.zxf.mapper.DeptMapper;
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
public class Test1 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private InputStream is;
    private DeptMapper deptMapper;
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
        //通过部门编号查询，当前部门的人员
        Dept dept = deptMapper.selectDeptById("101");
          System.out.print(dept.getDept_name());
          System.out.println(" 部门负责人编号："+dept.getDept_manager());
          System.out.println("***********************************************");
        List<Employee> employees = dept.getEmployees();
         for (Employee e:employees){
             System.out.print(e.getEmp_name()+" ");
             System.out.println(e.getEmp_gender());
         }
    }
}
