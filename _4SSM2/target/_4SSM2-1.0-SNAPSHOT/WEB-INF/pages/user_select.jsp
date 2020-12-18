<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="application/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <script language="javascript" src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


</head>
<body>
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="" class="navbar-brand">风学长</a>
        </div>
        <!-- 导航-->
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="b1"><span class="glyphicon glyphicon-user"></span>主页</a></li>
                <li class="active"><a href="userlist"><span class="glyphicon glyphicon-king"></span>用户列表</a></li>
                <li><a href=""><span class="glyphicon glyphicon-search"></span>内容管理</a></li>
                <li><a href=""><span class="glyphicon glyphicon-star"></span>标签管理</a></li>
                <li><a href=""><span class="glyphicon glyphicon-calendar"></span>页面5</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a id="dLabel" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        管理员
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="dLabel">
                        <li><a><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;前台页面1</a></li>
                        <li><a><span class="glyphicon glyphicon-envelope"></span>&nbsp;&nbsp;前台页面2</a></li>
                        <li><a><span class="glyphicon glyphicon-ok"></span>&nbsp;&nbsp;前台页面3</a></li>
                        <li><a><span class="glyphicon glyphicon-scissors"></span>&nbsp;&nbsp;前台页面4</a></li>
                    </ul>
                </li>
                <li><a href=""><span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;退出</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <div class="list-group">
                <a href="userlist" class="list-group-item ">用户管理</a>
                <a href="userselect" class="list-group-item active">用户搜索</a>
                <a href="" class="list-group-item">添加用户</a>
            </div>
        </div>
        <div class="col-md-10">
            <div class="page-header">
                <h3>用户搜索</h3>
            </div>
        </div>
        <div class="col-md-6">
            <form action="">
                <div class="form-group">
                    <label>用户名</label>
                    <input type="text" id="name" class="form-control" placeholder="请输入用户名">
                </div>
                <div class="form-group">
                    <label>电话号码</label>
                    <input type="text" id="tel" class="form-control" placeholder="请输入电话号码">
                </div>
                <div class="form-group">
                    <label>用户部门</label>
                    <select id="yonghuzu" class="form-control" name="yonghuzu">
                        <option>财务部门</option>
                        <option>行政务部门</option>
                        <option>技术部门</option>
                        <option>市场部门</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-default">搜搜</button>
            </form>
        </div>
    </div>


</div>

</body>
</html>