package com.zxf.proxy;

public class PayServiceImpl implements PayService {

    public String callback(String outTradeNo) {
        System.out.println("目标类PayServiceImpl...callback()方法");
        return outTradeNo;
    }

    public int save(int userId, int productId) {
        System.out.println("目标类PayServiceImpl...save()方法");
        return productId;
    }
}
