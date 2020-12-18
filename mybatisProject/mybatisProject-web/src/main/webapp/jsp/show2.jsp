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

        <c:forEach items="${requestScope.PageInfo.list}" var="pi">
            <tr>
                <td bgcolor="#fff188"> ${pi.id}</td>
                <td bgcolor="#ff6917"> ${pi.name}</td>
                <td bgcolor="#ff4b99"> ${pi.price}</td>
                <td bgcolor="#7197ff"> ${pi.production}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="page?pageNumber=${PageInfo.pageNumber-1 }&pageSize=${PageInfo.pageSize}" <c:if test="${PageInfo.pageNumber<=1 }">  onclick="javascript:return false;" </c:if> >上一页</a>
    <a href="page?pageNumber=${PageInfo.pageNumber+1 }&pageSize=${PageInfo.pageSize}" <c:if test="${PageInfo.pageNumber>=PageInfo.total }">  onclick="javascript:return false;" </c:if> >下一页</a>
</center>
</body>
</html>
