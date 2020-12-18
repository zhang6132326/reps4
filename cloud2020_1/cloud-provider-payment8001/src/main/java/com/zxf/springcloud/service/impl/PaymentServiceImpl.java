package com.zxf.springcloud.service.impl;

import com.zxf.springcloud.dao.PaymentDao;
import com.zxf.springcloud.entities.Payment;
import com.zxf.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service  //因为是service层所有必须有service注解
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
         System.out.println("carte的DAO层调用了。。。"+payment);
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        System.out.println("11111111111111111111");
        return paymentDao.getPaymentById(id);
    }
}
