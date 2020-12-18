<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工系统</title>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="application/javascript" src="../js/jquery-1.12.4.min.js"></script>
    <script language="javascript" src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js" ></script>
     <style type="text/css">
         @media (min-width:768px) {
             #silder_sub{
                 width:150px;
                 margin-top:50px;
                 position: absolute;
                 z-index: 1;
             }
         }
     </style>
    </head>
<body>
<!-- 导航-->
   <nav class="navbar navbar-default navbar-static-top">
       <div class="navbar-header">
           <a href="" class="navbar-brand">员工管理系统</a>
       </div>
       <ul class="nav navbar-nav navbar-right" style="margin-right: 20px;">
           <li><a href=""><span class="badge" style="background: #ff9234">34</span></a></li>
           <li><a href=""><span class="glyphicon glyphicon-off">退出</span></a></li>
       </ul>
       <!--侧边栏 -->
       <div class="navbar-default navbar-collapse">
           <ul class="nav" >
              <li>
                <div class="input-group">
                  <input type="text" class="form-control"/>
                    <span class="input-group-btn">
                        <button type="button" class="btn btn-default">
                            <span class="glyphicon glyphicon-search"></span>
                        </button>
                    </span>
                </div>
              </li>
               <li>
                   <a href="#sub1"  data-toggle="collapse">栏目功能<span class="glyphicon glyphicon-chevron-right"></span></a>
                   <ul id="sub1" class="nav collapse">
                       <li><a href=""><span class="glyphicon glyphicon-user"></span>栏目功能1</a></li>
                       <li><a href="">栏目功能2</a></li>
                       <li><a href="">栏目功能3</a></li>
                       <li><a href="">栏目功能4</a></li>
                       <li><a href="">栏目功能5</a></li>
                   </ul>
               </li>
               <li>
                   <a href="#sub2"  data-toggle="collapse">栏目功能<span class="glyphicon glyphicon-chevron-right"></span></a>
                   <ul id="sub2" class="nav collapse">
                       <li><a href=""><span class="glyphicon glyphicon-user"></span>栏目功能1</a></li>
                       <li><a href="">栏目功能2</a></li>
                       <li><a href="">栏目功能3</a></li>
                       <li><a href="">栏目功能4</a></li>
                       <li><a href="">栏目功能5</a></li>
                   </ul>
               </li>
               <li>
                   <a href="#sub3"  data-toggle="collapse">员工管理<span class="glyphicon glyphicon-chevron-right"></span></a>
                   <ul id="sub3" class="nav collapse">
                       <li><a href=""><span class="glyphicon glyphicon-user"></span>员工管理1</a></li>
                       <li><a href="">员工管理2</a></li>
                       <li><a href="">员工管理3</a></li>
                       <li><a href="">员工管理4</a></li>
                       <li><a href="">员工管理5</a></li>
                   </ul>
               </li>
           </ul>
       </div>
   </nav>
</body>
</html>