<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>

    <script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                alert("hello");
            });
        });
    </script>
</head>
<body>
   <a href="employee/findall">测试mvc</a>
   <button class="btn btn-success" id="btn" >bbbbbb</button>
   <table class="table">
       <tr>
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
   </table>
</body>
</html>
