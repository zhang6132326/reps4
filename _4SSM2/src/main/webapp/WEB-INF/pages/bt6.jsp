<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="application/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <script language="javascript" src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js" ></script>
    <script language="JavaScript">
        $(function () {
            $('a[data-toggle="tab"]').on('shown.bs.tab',function (e) {
                $("#testshow").html(e.target.innerHTML);
            });
        });
    </script>
    </head>
<body>
  <ul class="breadcrumb">
      <li><a href="">首页1</a></li>
      <li><a href="">首页2</a></li>
      <li><a href="">首页3</a></li>
      <li><a href="">首页3</a></li>
      <li><a href="">首页4</a></li>
      <li><a href="">首页5</a></li>
      <li><a href="">首页6</a></li>
  </ul>
<hr/>
  <ul class="pagination">
      <li><a href="">&laquo;</a></li>
      <li><a href="">1</a></li>
      <li><a href="">2</a></li>
      <li><a href="">3</a></li>
      <li><a href="">4</a></li>
      <li><a href="">5</a></li>
      <li><a href="">6</a></li>
      <li><a href="">&raquo;</a></li>
  </ul>
  <hr/>
<ul class="pagination pagination-lg">
    <li><a href="">&laquo;</a></li>
    <li><a href="">1</a></li>
    <li><a href="">2</a></li>
    <li><a href="">3</a></li>
    <li><a href="">4</a></li>
    <li><a href="">5</a></li>
    <li><a href="">6</a></li>
    <li><a href="">&raquo;</a></li>
</ul>
<hr/>
<ul class="pager">
    <li class="active"> <a href="">上一页</a></li>
    <li> <a href="">下一页</a></li>
</ul>
<hr/>
<div class="container">
    <div class="alert alert-warning">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <p>注意安全信息保存！</p>
    </div>
</div>
<hr/>
<div class="container">
    <div class="progress">
        <div class="progress-bar" style="width: 98%;"></div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-danger" style="width:1%;"></div>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-info" style="width: 45%;"></div>
    </div>
    <div class="progress progress-striped">
        <div class="progress-bar progress-bar-success" style="width: 67%;"></div>
    </div>
    <div class="progress progress-striped">
        <div class="progress-bar progress-bar-warning active"  style="width: 11%;"></div>
    </div>
</div>
<hr/>
 <div class="container">
     <!--选项卡 -->
     <ul class="nav nav-tabs">
         <li><a href="#pan1" data-toggle="tab">选卡1</a></li>
         <li><a href="#pan2" data-toggle="tab">选卡2</a></li>
         <li><a href="#pan3" data-toggle="tab">选卡3 </a></li>
     </ul>
     <!--面板 -->
     <div class="tab-content">
         <div class="tab-pane active" id="pan1">
             <div class="progress progress-striped">
                 <div class="progress-bar progress-bar-warning active"  style="width: 11%;"></div>
             </div>
         </div>
         <div class="tab-pane" id="pan2">
             <div class="progress progress-striped">
                 <div class="progress-bar progress-bar-success" style="width: 67%;"></div>
             </div>
         </div>
         <div class="tab-pane" id="pan3">
             <div class="progress">
                 <div class="progress-bar" style="width: 98%;"></div>
             </div>
         </div>
     </div>
     <h1 id="testshow"></h1>
 </div>
<hr/>
<div class="container">
    <button type="button" class="btn btn-default" data-toggle="collapse" data-target="#shows">折叠</button>
    <div id="shows" class="collapse">
        <div class="well">
            <ul class="list-group">
                <li><a href="">部门1</a> </li>
                <li><a href="">部门1</a> </li>
                <li><a href="">部门1</a> </li>
                <li><a href="">部门1</a> </li>
                <li><a href="">部门1</a> </li>
                <li><a href="">部门1</a> </li>
                <li><a href="">部门1</a> </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>