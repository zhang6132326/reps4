package com.zxf.service.impl;

import com.zxf.pojo.Log;
import com.zxf.pojo.PageInfo;
import com.zxf.service.LogService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogServiceImpl implements LogService {
    public PageInfo showPage(int pageSize, int pageNumber) throws IOException {
        InputStream is = Resources.getResourceAsStream("zhang.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        Map<String,Object> param=new HashMap<String, Object>();
           param.put("pageStart",pageSize*(pageNumber-1));
           param.put("pageSize",pageSize);
        List<Log> list = session.selectList("com.zxf.mapper.LogMapper.selByPage",param);
        long count = session.selectOne("com.zxf.mapper.LogMapper.selCount");
        PageInfo pi=new PageInfo();
          pi.setList(list);
          pi.setPageNumber(pageNumber);
          pi.setPageSize(pageSize);
          pi.setTotal(count%pageSize==0?count/pageSize:count/pageSize+1);
        return pi;
    }
}
