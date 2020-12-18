package com.zxf;
import com.zxf.mapper.AccountMapper;
import com.zxf.mapper.FlowerMapper;
import com.zxf.pojo.Account;
import com.zxf.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.InputStream;
import java.util.*;

public class Test2 {
    private  SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private FlowerMapper flowerMapper;
    private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        flowerMapper=session.getMapper(FlowerMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }
    //调用的注解那个方法
    @Test
    public void test1()throws Exception{
        List<Flower> flowers=flowerMapper.getAll();
        for(Flower f:flowers){
            System.out.println(f.getName());
        }
    }
    //查询所有的方法
    @Test
    public void test2()throws Exception{
        List<Flower> flowers=flowerMapper.getAll2();
        for(Flower f:flowers){
            System.out.println(f.getId()+"-->"+f.getName()+","+f.getProduction());
        }
    }
    //增加
    @Test
    public void test3()throws Exception{
        Flower flower=new Flower();
        flower.setProduction("在看看吧");
        flower.setPrice(92.89F);
        flower.setName("程序可以不");
         int i=flowerMapper.saveFlower(flower);
    }
    //修改
    @Test
    public void test4()throws Exception{
        Flower flower=new Flower();
        flower.setId(1414);
        flower.setProduction("开始修改了");
        flower.setPrice(63.9F);
        flower.setName("看看修改结果吧");
        flowerMapper.updateFlower(flower);
    }
    //删除
    @Test
    public void test5()throws Exception{
        flowerMapper.delFlower(1413);
    }
    //查询
    @Test
    public void test6()throws Exception{
        Flower byidFlower = flowerMapper.findByidFlower(1);
        System.out.println(byidFlower.getId()+":"+byidFlower.getName()+","+byidFlower.getProduction());
    }
    //模糊查询
    @Test
    public void test7()throws Exception{
       List <Flower>fs = flowerMapper.findBylike("%1%");
       for(Flower flower:fs){
           System.out.println(flower.getId()+":"+flower.getName()+","+flower.getProduction());
        }

    }

    //返回聚合函数 总记录条数
    @Test
    public void test8()throws Exception{
        int allSize = flowerMapper.getAllSize();
        System.out.println(allSize);

    }

    @Test
    public void test9()throws Exception{
        Flower f1=new Flower();
        f1.setName("小花花100");
        f1.setProduction("任何地方都有的小野花100");
        Flower flower = flowerMapper.findFlowerByCondition(f1);
        System.out.println(flower.getId()+flower.getProduction()+flower.getPrice()+flower.getName());

    }
    @Test
    public void test10()throws Exception{
        Flower f1=new Flower();
  //      f1.setName("小花asdf花100");
       f1.setProduction("任何地方都有的小野花100");
        Flower flower = flowerMapper.findFlowerByCondition2(f1);
              if(flower!=null) {
                  System.out.println(flower.getId() + flower.getProduction() + flower.getPrice() + flower.getName());
              }
    }
    //////////////////////////////////////////////////
    //以下是一对一的练习
    //查询account表的所有信息
    @Test
    public void test11(){
        AccountMapper accountMapper=session.getMapper(AccountMapper.class);
        List<Account> accounts=accountMapper.findAll();
        for(Account a:accounts){
            System.out.println(a.getName()+":"+a.getBalance());
        }
    }

  // 查询2个表，users account
    @Test
    public void test12(){
        AccountMapper accountMapper=session.getMapper(AccountMapper.class);
        List<Account> accounts=accountMapper.findallA_U();
        for(Account a:accounts){

            System.out.println(a.getId()+":"+a.getName()+":"+a.getBalance()+"-->"+a.getUser().getUsername()+",年龄："+a.getUser().getUserage()+","+a.getUser().getUsername());
        }
    }
    // 查询2个表，users account
    @Test
    public void test13(){
        AccountMapper accountMapper=session.getMapper(AccountMapper.class);
        List<Account> accounts=accountMapper.findallA_U();
        for(Account a:accounts){
            System.out.print(a.getId()+":account_name："+a.getName());
            System.out.print("____________________");
            System.out.println("users_username:"+a.getUser().getUsername()+"  users_userid:"+a.getUser().getUserid());
        }
    }




}