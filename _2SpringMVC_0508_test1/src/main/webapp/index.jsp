<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <!--
     <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>

     -->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>

    <script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                //alert("hello");
                $.ajax({
                    url: "zhang/ok10",
                    contentType: "application/json;charset=UTF-8",
                    data: '{"username:":"xiaofeng","pwd":"abc123","email":"6132326@qq.com","age":34}',
                    dataType:"json",
                    type:"post",
                    success: function (data) {
                          alert(data.dept_name);
                          alert(data.dept_desc)
                    }
                });
            });
        });
    </script>
</head>
<body>
   <a href="zhang/ok1">OK页面</a>
   <hr/>
   <a href="zhang/ok2?name=zhang3&age=34">带有参数的</a>
<hr/>
<form action="zhang/ok3" method="post">
     name:<input type="text" name="name"><br/>
     emai:<input type="text" name="emai"><br/>
     dept_desc:<input type="text" name="dept.dept_desc"><br/>
     dept_name: <input type="text" name="dept.dept_name"><br/>
    <input type="submit" value="send">
</form>
   <hr/>
   <a href="zhang/ok4">获取Servlet内置对象</a>
   <hr/>
   <a href="zhang/ok5?ns=zhang3">RequestParam的使用</a>
   <hr/>
   <form action="zhang/ok6" method="post">
       name:<input type="text" name="name"><br/>
       emai:<input type="text" name="emai"><br/>
       dept_desc:<input type="text" name="dept.dept_desc"><br/>
       dept_name: <input type="text" name="dept.dept_name"><br/>
       <input type="submit" value="send">
   </form>
<hr/>
<a href="zhang/ok7/7800">PathVariable属性的使用</a>
<hr/>
<a href="zhang/ok8">Model值传递</a>
<hr/>
   <a href="zhang/ok9">ModelView值传递</a>
<hr/>
   <button class="btn btn-success" id="btn" >bbbbbb</button>
<hr/>

<form action="zhang/ok11" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"><br/>
    <input type="submit" value="send.." >
</form>
   <hr/>
<a href="zhang/ok12">异常处理</a>
</body>
</html>
