<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="c1">C1</a>
<hr/>
<form action="c4" method="post">
          Name:<input type="text" name="name"><br/>
          age:<input type="text" name="age"><br/>
    <input type="submit" value="ok">
</form>
<hr/>
<form action="c5" method="post">
    <input type="checkbox" value="在" name="che">
    <input type="checkbox" value="吃"name="che">
    <input type="checkbox" value="去"name="che">
    <input type="checkbox" value="熊"name="che">
     <input type="submit" value="Send_c5">
</form>
<hr/>
<a href="c6/aaa/bbb">AAAA_c6</a><br/><!--这里的aaa bbb 相当于内容；参加后台的execute6方法 -->
<hr/>
<a href="c7">AAAA_c7</a><br/>
</body>
</html>
