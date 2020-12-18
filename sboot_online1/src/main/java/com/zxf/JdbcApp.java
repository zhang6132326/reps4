package com.zxf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcApp {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/online";
        String username = "root";
        String password = "xtfvmtd198154";
        Connection connection= DriverManager.getConnection(url,username,password);
        PreparedStatement pstm=connection.prepareStatement("select * from video");
        ResultSet rs=pstm.executeQuery();
        while (rs.next()){
            System.out.print(rs.getString("id"));
            System.out.print(rs.getString("title"));
            System.out.println(rs.getString("summary"));
        }
        rs.close();
        pstm.close();
        connection.close();
    }
}
