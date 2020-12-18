<%@ page import="java.util.List" %>
<%@ page import="com.zxf.pojo.Flower" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${requestScope.lists}" var="list">
       ${list.name}
</c:forEach>
</body>
</html>
