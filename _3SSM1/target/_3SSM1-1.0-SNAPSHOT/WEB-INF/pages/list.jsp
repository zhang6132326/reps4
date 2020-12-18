<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<button class="btn btn-success" id="btn" >bbbbbb</button>
      <h1>用户列表</h1>
      <table class="table" border="1" bgcolor="#ffc54d">
          <tr class="active">
              <th>
                  编号
              </th>
              <th>
                  部门编号
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
                  姓名
              </th>
          </tr>
          <c:forEach items="${list}" var="emp">
              <tr class="success">
                  <td class="info"> ${emp.emp_no}</td>
                  <td> ${emp.dept_id}</td>
                  <td> ${emp.emp_gender}</td>
                  <td> ${emp.emp_email}</td>
                  <td> ${emp.emp_nation}</td>
                  <td> ${emp.emp_marriage}</td>
                  <td> ${emp.emp_health}</td>
                  <td> ${emp.emp_zzmm}</td>
                  <td> ${emp.emp_blood}</td>
                  <td> ${emp.emp_state}</td>
                  <td> ${emp.emp_name}</td>
              </tr>
          </c:forEach>
      </table>
</body>
</html>
