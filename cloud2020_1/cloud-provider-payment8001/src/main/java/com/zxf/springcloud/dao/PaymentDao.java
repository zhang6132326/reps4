package com.zxf.springcloud.dao;
import com.zxf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//import org.springframework.stereotype.Repository;

@Mapper//在DAO层中如果有Mybatis建议使用该注解
//@Repository //在DAO层中如果有mybatis不建议使用 因为插入数据会有写不稳定。
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}