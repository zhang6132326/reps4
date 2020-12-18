<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="application/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <script language="javascript" src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js" ></script>


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
                <li><a href=""><span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;退出</a> </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <div class="list-group">
                <a href="userlist" class="list-group-item active">用户管理</a>
                <a href="userselect" class="list-group-item">用户搜索</a>
                <a href="" role="button" class="list-group-item" data-toggle="modal" data-target="#myModal">添加用户</a>
            </div>
        </div>
        <div class="col-md-10">
            <div class="page-header">
                <h3>用户管理</h3>
            </div>
            <ul class="nav nav-tabs">
                <li class="active">
                    <a href="">用户列表</a>
                </li>
            </ul>
            <table class="table">
                <thead>
                  <tr>
                      <th>ID</th>
                      <th>用户名</th>
                      <th>邮件</th>
                      <th>操作</th>
                  </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">4</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">5</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">6</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">7</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">8</th>
                    <td>张三</td>
                    <td>6132326@qq.com</td>
                    <td>
                        <div role="presentation" class="dropdown" >
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="" role="button" aria-haspopup="true" aria-expanded="false">
                                操作<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <ul><a href="">编辑</a></ul>
                                <ul><a href="">删除</a></ul>
                            </ul>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
            <nav class="pull-right">
                <ul class="pagination">
                    <li class="disabled"><a href="" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                    <li class="active"><a href="">1</a></li>
                    <li><a href="">2</a></li>
                    <li><a href="">3</a></li>
                    <li><a href="">4</a></li>
                    <li><a href="">5</a></li>
                    <li><a href="">6</a></li>
                    <li><a href=""><span aria-hidden="true">&raquo;</span></a></li>
                </ul>
            </nav>
        </div>
    </div>
    <!--Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加用户</h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="form-group">
                        <label>用户名</label>
                        <input type="text" id="addname" class="form-control" placeholder="请输入用户名">
                    </div>
                    <div class="form-group">
                        <label>密码</label>
                        <input type="password" id="addpwd1" class="form-control" placeholder="请输入密码">
                    </div>
                    <div class="form-group">
                        <label>确认密码</label>
                        <input type="password" id="addpwd2" class="form-control" placeholder="请再次输入密码">
                    </div>
                    <div class="form-group">
                        <label>邮箱</label>
                        <input type="email" id="addemail" class="form-control" placeholder="请输入邮件">
                    </div>
                    <div class="form-group">
                        <label>用户部门</label>
                        <select id="addyongdept" class="form-control">
                            <option>java</option>
                            <option>php</option>
                            <option>sql</option>
                            <option>Linux</option>
                            <option>php</option>
                            <option>c++</option>
                        </select>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交</button>
            </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>