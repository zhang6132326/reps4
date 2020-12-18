package com.zxf.test;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//针对动态SQL的测试
public class Test4 {
    private InputStream inputStream=null;
    private SqlSession session=null;
    private EmployeeMapper mapper=null;
    @Before //Test方法之前执行,都是junit提供的方法
    public void init()throws IOException {
//加载主配置文件
        inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂获取SqlSession
        session=factory.openSession();
        mapper = session.getMapper(EmployeeMapper.class);
    }
    @After//Test方法之后执行,都是junit提供的方法
    public void destory()throws IOException{

        session.close();
        inputStream.close();

    }
    /*
       动态SQL  public List<Employee> finEmp1(Employee employee);测试
     */
    @Test
    public void test1(){
        Employee e=new Employee();
      //  e.setEmp_name("%张%");
       // e.setEmp_email("%z%");
        List<Employee> employees = mapper.finEmp1(e);
        for(Employee es:employees){
            System.out.print(es.getEmp_name()+" ");
            System.out.println(es.getEmp_email());
        }
    }
    /*
      动态SQL   public List<Employee> findbyForeach(Employee employee);测试
    */
    @Test
    public void test2(){
        Employee e=new Employee();
             List<String > ds=new ArrayList<String>();
             ds.add("101");
             ds.add("102");
             e.setDepts_id(ds);
        List<Employee> employees = mapper.findbyForeach(e);
        for(Employee es:employees){
            System.out.print(es.getEmp_name()+" ");
            System.out.println(es.getDept_id());
        }
    }
}
