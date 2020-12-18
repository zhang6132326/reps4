<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%
        pageContext.setAttribute("paths",request.getContextPath());
    %>

    <script type="text/javascript" src="${paths}/static/js/jquery-1.12.4.min.js"></script>
    <link  href="${paths}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${paths}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
  <button class="btn btn-warning">惊涛你</button>
  <button class="btn btn-success">按钮</button>
</body>
</html>
