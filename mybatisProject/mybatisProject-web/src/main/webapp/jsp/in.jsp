<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/transfer" method="post">
    转账账户:<input type="text" name="accOutAccNo"/><br/>
    密码:<input type="password" name="accOutPassword"/><br/>
    金额:<input type="text" name="accOutBalance"/><br/>
    收款帐号:<input type="text" name="accInAccNo"/><br/>
    收款姓名:<input type="text" name="accInName"/><br/>
    <input type="submit" value="转账"/>
</body>
</html>
