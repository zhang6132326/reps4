package com.zxf.mapper;

import com.zxf.pojo.Account;

import java.util.List;

public interface AccountMapper {

     /*
        查询所有账户
     */
    List<Account> findAll();

    /*
        查询account和user表的一对一
     */
    List<Account> findallA_U();

}
