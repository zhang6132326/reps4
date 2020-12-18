package com.zxf.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
    自动填充功能的辅助类

 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /*
         实现添加操作，自动执行这个方法
     */
    @Override
    public void insertFill(MetaObject metaObject) {
         this.setFieldValByName("create_time",new Date(),metaObject);
         this.setFieldValByName("update_time",new Date(),metaObject);
          /*
              给版本号字段添加的时候 自动给添加一个1
               然后每次修改的时候都会给该字段+1
               这样就保证了乐观锁的执行
           */
        this.setFieldValByName("version",1,metaObject);
    }
    /*
          实现修改操作，自动执行这个方法
       */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("update_time",new Date(),metaObject);
    }
}
