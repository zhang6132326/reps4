package com.zxf.service.impl;

import com.zxf.dao.MyIpDao;
import com.zxf.pojo.MyIp;
import com.zxf.service.MyIpService;

import java.util.List;

public class MyIpServiceImpl implements MyIpService {
    private MyIpDao myIpDao;

    public void setMyIpDao(MyIpDao myIpDao) {
        this.myIpDao = myIpDao;
    }

    public List<MyIp> getAll_IP() {
        return myIpDao.getAll();
    }
}
