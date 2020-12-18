package com.zxf.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentFallbackService1111111...paymentInfo_ok";
    }
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService222222...paymentInfo_TimeOut";
    }
}