package com.zxf.dao.impl;

import com.zxf.dao.MyIpDao;
import com.zxf.pojo.MyIp;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyIpDaoImpl implements MyIpDao {
    private DataSource datasource;

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }

    public List<MyIp> getAll() {
        Connection conn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        List<MyIp> list=new ArrayList<MyIp>();
        try{
            conn=datasource.getConnection();
            pstm=conn.prepareStatement("select * from myip");
            rs=pstm.executeQuery();
            while (rs.next()){
                MyIp myIp=new MyIp();
                myIp.setId(rs.getInt("id"));
                myIp.setIp_address(rs.getString("ip_address"));
                myIp.setIp_date(rs.getTimestamp("ip_date"));
                list.add(myIp);
            }
        }catch (Exception e){
            e.getMessage();
        }

        return list;
    }
}
