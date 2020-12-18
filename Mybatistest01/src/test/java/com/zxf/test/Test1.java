package com.zxf.test;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public class Test1 {
    //通过调用配置文件的<select id="findAll" 来查询数据库
    @Test
    public void test1()throws IOException{
         //加载主配置文件
        InputStream is= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获取SqlSession
        SqlSession session=factory.openSession();
        List<Employee> findAll = session.selectList("findAll");
        for(Employee e:findAll){
            System.out.print(e.getEmp_no()+" ");
            System.out.print(e.getEmp_name()+" ");
            System.out.print(e.getDept_id()+" ");
            System.out.print(e.getEmp_gender()+" ");
            System.out.print(e.getEmp_marriage()+" ");
            System.out.print(e.getEmp_email()+" ");
            System.out.print(e.getEmp_blood()+" ");
            System.out.print(e.getEmp_zzmm()+" ");
            System.out.print(e.getEmp_nation()+" ");
            System.out.println(e.getEmp_state());
        }
    }
    //通过调用Mapper接口的方法findAll 来查询数据库
    @Test
    public void test2()throws IOException{
        //加载主配置文件
        InputStream is= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获取SqlSession
        SqlSession session=factory.openSession();
        EmployeeMapper employeeMapper=session.getMapper(EmployeeMapper.class);
         List<Employee> findAll_2 = employeeMapper.findAll();
        for(Employee e:findAll_2){
            System.out.print(e.getEmp_no()+" ");
            System.out.print(e.getEmp_name()+" ");
            System.out.print(e.getDept_id()+" ");
            System.out.print(e.getEmp_gender()+" ");
            System.out.print(e.getEmp_marriage()+" ");
            System.out.print(e.getEmp_email()+" ");
            System.out.print(e.getEmp_blood()+" ");
            System.out.print(e.getEmp_zzmm()+" ");
            System.out.print(e.getEmp_nation()+" ");
            System.out.println(e.getEmp_state());
        }
        session.close();
        is.close();
    }
}
