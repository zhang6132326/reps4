package com.zxf.demo8;

import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    public void save() {
       System.out.println("com.zxf.demo8.EmpServiceImpl.save()");
    }
}