package com.zxf;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zxf.mapper.UsersMapper;
import com.zxf.pojo.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class ApplicationTests {

    @Autowired
	private UsersMapper usersMapper;
	@Test
	public void findAll() {
		List<Users> usersList = usersMapper.selectList(null);
		for(Users u:usersList){
			System.out.println(u.getUsername());
		}
	}
	//添加
	@Test
	public void addUser(){
		/*
		     在添加的时候会自动调用com.zxf.handler.MyMetaObjectHandler类的insertFill方法
		     完成里面的2个时间字段自动添加动作

		 */
		Users users=new Users();
		users.setUserid(35);
		users.setUsername("1aasdfzsdf");
		users.setUserage(30);
		users.setText("asdfzzz");
		usersMapper.insert(users);
	}
	//修改
	/*
	    在添加的时候会自动调用com.zxf.handler.MyMetaObjectHandler类的updateFill方法
		     完成里面的1个时间字段自动修改动作
	 */

	@Test
	public void updateUser(){
		Users u=new Users();
		//u.setUserid(1);
		u.setUsername("hhhdhdhdhdh*");
		u.setUserage(-23);
		u.setText("----wo shi benb");
		u.setUserid(31);
		usersMapper.updateById(u);
	}
	/*
	   测试乐观锁的修改
	 */
	@Test
	public void updateUserLock(){
		//根据ID查询以后才可以修改
		Users users=usersMapper.selectById(32);
		//修改操作了
		users.setUserage(87);
		usersMapper.updateById(users);
	}

	/*
	     多个ID的批量查询
	 */
	@Test
	public void testSelectDemo1(){
		List<Users> usersList = usersMapper.selectBatchIds(Arrays.asList(1, 2, 18,20,3, 4, 5));
		for(Users u:usersList){
			System.out.println(u.getUsername());
		}
	}
  /*
    分页查询
   */
  @Test
	public void testPage(){
       /*
            1 创建Page对象
            2 传入2个参数 当前页和每页显示记录数

        */

	  Page<Users> page=new Page<>(2,3);
	  /*
	      调用mp分页查询方法

	   */
	  usersMapper.selectPage(page,null);
	  /*
	      通过page对象获取分页数据
	   */
	  System.out.println("当前页:"+page.getCurrent()); //当前页
	  List<Users> records = page.getRecords();//当前页list集合
	  for(Users u:records){
	  	System.out.println(u.getUsername());
	  }
	  //System.out.println("当前页list集合:"+page.getRecords());

	  System.out.println("显示每页记录数:"+page.getSize()); //显示每页记录数
	  System.out.println("总记录数:"+page.getTotal()); //总记录数
	  System.out.println("总页数:"+page.getPages()); //总页数

	  System.out.println("下一页:"+page.hasNext()); //下一页
	  System.out.println("上一页:"+page.hasPrevious()); //上一页

   }
   /*
        物理删除:也就是真正的数据记录删除
    */
   @Test
	public void testDeleteById(){
   	/*
   	    配置了逻辑删除以后，同样的执行命令；都不会物理删除了
   	    都会在deleted字段有个逻辑标志了，
   	    然后为我们在查询的时候，逻辑删除的记录不会显示。
   	    记录依然会在数据库里保存。
   	 */
   	   usersMapper.deleteById(1);
    }
   /*
       批量物理删除
    */
   @Test
	public void testDeleteBatchIds(){
   	   usersMapper.deleteBatchIds(Arrays.asList(2,3));
    }
    /*
        mp 实现复杂查询
     */
    @Test
	public void testSelectQuery(){
		QueryWrapper<Users> wrapper=new QueryWrapper<>();
		/*
		     通过QueryWrapper设置条件
		     ge >=
		     gt >
		     le <=
		     lt <
		     eq ==
		     ne !=
		     between
		     like 模糊
		     orderBydesc 排序
		     last   //后补SQL语句的条件部分
		     指定查询的列
		 */
		//wrapper.ne("userage",62);
		//wrapper.between("userage",20,40);
		//wrapper.like("username","a");
		//wrapper.last("limit 6");
		wrapper.select("username","text");//指定要查询的列
		List<Users> usersList = usersMapper.selectList(wrapper);
		for(Users u:usersList){
			System.out.println(u.getUsername());
		}

	}


}
