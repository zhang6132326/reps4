<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<!-- 如果没有isELIgnored可能你的JSP页面不支持EL表达式-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <table border="1">
       <c:forEach items="${list}" var="a">
           <tr>
               <td>${a.id}</td>
               <td>${a.name}</td>
               <td>${a.price}</td>
               <td>${a.production}</td>
           </tr>
       </c:forEach>
       </table>
</body>
</html>
