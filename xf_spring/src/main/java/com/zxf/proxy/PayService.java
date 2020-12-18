package com.zxf.proxy;

public interface PayService {
    String callback(String outTradeNo);
    int save(int userId,int productId);
}
