<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<table class="table" >
    <tr class="active">
        <th>
            编号
        </th>
        <th>
            姓名
        </th>
        <th>
            性别
        </th>
        <th>
            邮箱
        </th>
        <th>
            民族
        </th>
        <th>
            婚姻
        </th>
        <th>
            身体
        </th>
        <th>
            社会关系
        </th>
        <th>
            血型
        </th>
        <th>
            职位情况
        </th>
        <th>
            部门编号
        </th>
        <th class=".active">
            操作
        </th>
    </tr>
    <c:forEach items="${list}" var="emp">
        <tr class="success">
            <td class="info"> ${emp.emp_no}</td>
            <td class="info"> ${emp.emp_name}</td>
            <td class="info"> ${emp.emp_gender}</td>
            <td class="info"> ${emp.emp_email}</td>
            <td class="info"> ${emp.emp_nation}</td>
            <td class="info"> ${emp.emp_marriage}</td>
            <td class="info"> ${emp.emp_health}</td>
            <td class="info"> ${emp.emp_zzmm}</td>
            <td class="info"> ${emp.emp_blood}</td>
            <td class="info"> ${emp.emp_state}</td>
            <td class="info"> ${emp.dept_id}</td>
            <td class=".active"><a href="findByIdEmp?emp_no=${emp.emp_no}">修改</a>  <a href="delemp?emp_no=${emp.emp_no}">删除</a>  </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>