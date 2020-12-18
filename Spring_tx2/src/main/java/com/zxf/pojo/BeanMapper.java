package com.zxf.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BeanMapper implements RowMapper<T1> {
    public T1 mapRow(ResultSet resultSet, int i) throws SQLException {
        T1 t=new T1();
        t.setTid(resultSet.getInt("tid"));
        t.setTname(resultSet.getString("tname"));
        return t;
    }
}
