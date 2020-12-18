<%@ page import="java.util.List" %>
<%@ page import="com.zxf.pojo.Flower" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body >
<center>
<table border="0" width="60%">

<c:forEach items="${requestScope.lists}" var="list">
    <tr>
        <td bgcolor="#fff188"> ${list.id}</td>
        <td bgcolor="#ff6917"> ${list.name}</td>
        <td bgcolor="#ff4b99"> ${list.price}</td>
        <td bgcolor="#7197ff"> ${list.production}</td>
    </tr>
</c:forEach>

</table>
</center>
</body>
</html>
