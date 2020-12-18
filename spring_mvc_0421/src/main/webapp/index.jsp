<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <a href="ok4/12">ok1测试页面get</a>
<br/>
<form action="ok4" method="post">

      <input type="submit" value="post请求">
</form>
  <br/>
  <form action="ok4" method="post">
      <input type="hidden" name="_method" value="put"/>
      <input type="submit" value="put请求">
  </form>
  <br/>
  <form action="ok4" method="post">
      <input type="hidden" name="_method" value="delete"/>
      <input type="submit" value="del请求">
  </form>
</body>
</html>
