<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>转账帐号</th>
        <th>收款帐号</th>
        <th>转账金额</th>
    </tr>
    <c:forEach items="${requestScope.pageinfo.list}" var="li">
        <tr>
            <td>${li.accOut }</td>
            <td>${li.accIn }</td>
            <td>${li.money }</td>
        </tr>
    </c:forEach>
</table>
<a href="show123?pageSize=${pageinfo.pageSize }&pageNumber=${pageinfo.pageNumber-1}" <c:if test="${pageinfo.pageNumber<=1 }"> onclick="javascript:return false;"</c:if>>上一页</a>
<a href="show123?pageSize=${pageinfo.pageSize }&pageNumber=${pageinfo.pageNumber+1}" <c:if test="${pageinfo.pageNumber>=pageinfo.total }"> onclick="javascript:return false;"</c:if>>下一页</a>
</body>
</body>
</html>
