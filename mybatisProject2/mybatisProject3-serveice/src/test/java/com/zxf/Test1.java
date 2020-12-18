package com.zxf;

import com.zxf.mapper.FlowerMapper;
import com.zxf.mapper.LogMapper;
import com.zxf.mapper.UsersMapper;
import com.zxf.pojo.Flower;
import com.zxf.pojo.Log;
import com.zxf.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    @Test
    public  void test1() throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        /*
         * 接口,为什么能实例化?
         *
         * 需要给接口一个实例化对象.
         *
         * 使用的JDK的动态代理设计模式.
         * 面向接口的代理设计模式(必须有接口)
         *
         */
        LogMapper logMapper=session.getMapper(LogMapper.class);
        List<Log> list=logMapper.selAll();
        for(Log log:list){
            System.out.println(log.getMoney());
        }
    }
    @Test
    public  void test2() throws Exception {
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        LogMapper logMapper=session.getMapper(LogMapper.class);
        List<Log> list=logMapper.selByAccInAccount("1005","1002");
        for (Log log:list){
            System.out.println(log.getMoney());
        }
    }
    @Test
    public void test3()throws Exception{
        Logger logger=Logger.getLogger(Test1.class);
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        LogMapper logMapper=session.getMapper(LogMapper.class);
        List<Log> logs = logMapper.selByAccinAccout2("", "1005");
        for(Log log:logs){
            System.out.println(log.getMoney());
        }
    }
    @Test
    public void test4()throws Exception{
        Logger logger=Logger.getLogger(Test1.class);
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        LogMapper logMapper=session.getMapper(LogMapper.class);
        List<Log> logs = logMapper.selByAccinAccout3("1004", "1001");
        for(Log log:logs){
            System.out.println(log.getMoney());
        }
    }

    @Test
    public void test5()throws Exception{
        Logger logger=Logger.getLogger(Test1.class);
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        LogMapper logMapper=session.getMapper(LogMapper.class);
        List<Log> logs = logMapper.selByAccinAccout4("", "1002");
        for(Log log:logs){
            System.out.println(log.getMoney());
        }
    }
    @Test
    public void test6()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        LogMapper logMapper=session.getMapper(LogMapper.class);
        Log log=new Log();
        log.setId(2);
        log.setAccOut("1005");
        log.setAccIn("0003");
        logMapper.upd1(log);
        session.commit();
    }

    @Test
    public void test7()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        List<Users> usersList = usersMapper.getAllFindByName("玩");
        for(Users u:usersList){
            System.out.println(u.getUsername()+","+u.getUserid());
        }
    }
    @Test
    public void test8()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        Users user1=new Users();
        user1.setUsername("玩");
        List<Users> usersList = usersMapper.getAllFindByName2(user1);
        for(Users u:usersList){
            System.out.println(u.getUsername()+","+u.getUserid());
        }
    }

    @Test
    public void test9()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        Users user1=new Users();
        user1.setUsername("xiaozhang");
        user1.setText("1");
        List<Users> usersList = usersMapper.findUsers(user1);
        for(Users u:usersList){
            System.out.println(u.getUsername()+","+u.getUserid()+"-->"+u.getText());
        }
    }
    @Test
    public void test10()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        Users user1=new Users();
        user1.setUsername("i");
       // user1.setText("1");
        List<Users> usersList = usersMapper.getAllFindByName3(user1);
        for(Users u:usersList){
            System.out.println(u.getUsername()+","+u.getUserid()+"-->"+u.getText());
        }
    }

    @Test
    public void test11()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        Users user1=new Users();
        user1.setUsername("玩");
        user1.setText("w");
        List<Users> usersList = usersMapper.getAllFindByName4(user1);
        for(Users u:usersList){
            System.out.println(u.getUsername()+","+u.getUserid()+"-->"+u.getText());
        }
    }
    //用了注解的方式
    @Test
    public void test12()throws Exception{
        InputStream is = Resources.getResourceAsStream("zhangMyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        FlowerMapper flowerMapper=session.getMapper(FlowerMapper.class);
           List<Flower> flowers=flowerMapper.getAll();
        for(Flower flower:flowers){
            System.out.println(flower.getName()+","+flower.getProduction());
        }
    }

}
