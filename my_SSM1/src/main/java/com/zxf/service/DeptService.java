package com.zxf.service;

import com.zxf.mapper.DeptMapper;
import com.zxf.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired(required = false)
    private DeptMapper deptMapper;



    public List<Dept> getDepts(){
        return null;
    }
}
