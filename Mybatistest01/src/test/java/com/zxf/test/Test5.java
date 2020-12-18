package com.zxf.test;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


/*
     测试Mybatis中的一级缓存

 */
public class Test5 {
    @Test
    public void test1()throws Exception{
        //加载主配置文件
        InputStream is= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获取SqlSession
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        //第一次查询HW9801
        Employee employee1=mapper.findEmpByid("HW9801");
        System.out.println(employee1);
        System.out.println("**********************************");
        Employee employee2=mapper.findEmpByid("HW9802");
        //第二次查询HW9801
     //   session.commit();  //提交后 ，会清空缓存。（insert update delete）等操作也会清空缓存。
        Employee employee3=mapper.findEmpByid("HW9801");
        System.out.println(employee2);
        System.out.println(employee3);
        //通过二次查询相同的信息，所以这个时候用的是Mybatis自己带的一级缓存机制(SqlSession机制)
        session.close();
        is.close();
    }
}
