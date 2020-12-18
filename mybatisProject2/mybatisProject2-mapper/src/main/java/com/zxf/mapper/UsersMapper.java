package com.zxf.mapper;

import com.zxf.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UsersMapper {
     public List<Users> getAllFindByName(@Param("name") String name);
     public List<Users> getAllFindByName2(Users u);
     public List<Users> getAllFindByName3(Users u);
     public List<Users> getAllFindByName4(Users u);
     public List<Users> findUsers(Users u);
     public List<Users> findUsersByNums(@Param("name") List<String> userlist);
     public List<Users> findAll();
     public List<Users> findAll_U_A();
}
