<%@ page import="java.io.InputStream" %>
<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.zxf.pojo.Flower" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    try {
        InputStream is = Resources.getResourceAsStream("zhang.xml");
        //使用工厂设计模式
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //生产SqlSession
        SqlSession se = factory.openSession();

        List<Flower> list = se.selectList("a.b.selAll");
        for(Flower f:list) {
            out.println(f.getName());
        }
    }catch (Exception e){

    }
%>
</body>
</html>
