package com.zxf.service;
import com.zxf.bean.TblUserRecord;
import com.zxf.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {
    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;
    public TblUserRecord login(String username, String password){
             return tblUserRecordMapper.login(username,password);
    }
}