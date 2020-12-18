package com.zxf.springcloud.service.com.zxf.springcloud.service.impl;

import com.zxf.springcloud.dao.PaymentDao;
import com.zxf.springcloud.entities.Payment;
import com.zxf.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
