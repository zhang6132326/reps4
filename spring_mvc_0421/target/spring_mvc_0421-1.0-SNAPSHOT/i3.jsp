<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/static/js/jquery-1.12.4.min.js"/>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" >
        window.onload = function(){
            var btn = document.getElementsByTagName("input")[0];	//获取按钮元素
            btn.addEventListener("click", function(event){	//注册鼠标单击事件，并设置事件流为捕获型事件
                var event = event || window.event;	//兼容Event对象
                btn.value = event.type;	//显示当前事件的类型
            },true);
        }

    </script>
</head>
<body>
<input type="button"  class="btn btn-success"   value="测试ajax">


</body>
</html>
