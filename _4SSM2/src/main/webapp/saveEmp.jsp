<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入员工</title>
    <script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<form action="emp/saveEmp" method="post">
    编号:<input type="text" name="emp_no"><br/>
    姓名:<input type="text" name="emp_name"><br/>
    部门:<input type="text" name="dept_id"><br/>
    性别:<input type="text" name="emp_gender"><br/>
    邮件:<input type="text" name="emp_email"><br/>
    民族:<input type="text" name="emp_nation"><br/>
    婚否:<input type="text" name="emp_marriage"><br/>
    德行:<input type="text" name="emp_health"><br/>
    成分:<input type="text" name="emp_zzmm"><br/>
    血型:<input type="text" name="emp_blood"><br/>
    状态:<input type="text" name="emp_state"><br/>
   <input type="submit" value="保存">



</form>
</body>
</html>
