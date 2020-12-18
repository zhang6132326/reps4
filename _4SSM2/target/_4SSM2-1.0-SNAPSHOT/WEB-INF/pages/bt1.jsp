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
                <li class="active"><a href=""><span class="glyphicon glyphicon-user"></span>主页</a></li>
                <li><a href="userlist"><span class="glyphicon glyphicon-king"></span>用户列表</a></li>
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
<!-- 警告框-->
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="alert alert-warning alert-dismissable fade in " role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="true">x</button>
                <h4>管理员${m}来了，开始你的工作吧 ！</h4>
            </div>
        </div>
    </div>
</div>
<div class="col-md-6">
    <div class="panel panel-default">
        <div class="panel-heading">网站数据统计</div>
        <div class="panel-body">
           <table class="table table-hover">
               <tr>
                   <th>#</th>
                   <th>姓名</th>
                   <th>电话</th>
               </tr>
               <tr>
                   <td>1</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>2</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>3</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>4</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>5</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>6</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>7</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
               <tr>
                   <td>8</td>
                   <td>张三</td>
                   <td>1748826549</td>
               </tr>
           </table>
        </div>
    </div>
</div>
<div class="col-md-6">
    <div class="panel panel-default">
        <div class="panel-heading">最凉的新闻</div>
        <div class="panel-body">
           <ul class="list-group">
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;1997年亚运会开幕</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;2008年奥运征集吉祥物</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;北京通高铁了</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;北京有人住地下室</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;北京房价居然每平米7000元！</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;东北也下雪了</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;2元彩票可以改变人生</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;1990年的春运居然一票难求</a><small class="pull-right">1995/2/1</small>
               </li>
               <li class="list-group-item">
                   <a href=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;Java程序工资3000以上，北京太多人开始学习Java了。</a><small class="pull-right">1995/2/1</small>
               </li>
           </ul>
        </div>
    </div>
</div>
<div class="col-md-6">
    <div class="panel panel-default">
        <div class="panel-heading">职位统计</div>
        <div class="panel-body">
            <canvas id="myChart"  ></canvas>
        </div>
    </div>
</div>
<div class="col-md-6">
    <div class="panel panel-default">
        <div class="panel-heading">服务器资源使用情况</div>
        <div class="panel-body">
            <p>内存占用:40%</p>
            <div class="progress">
                <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0"  aria-valuemax="100" style="width: 40%">
                    <span class="sr-only"></span>
                </div>
            </div>
            <p>硬盘使用率:60%</p>
            <div class="progress">
                <div class="progress-bar progress-bar-info progress-bar-striped" role="progressbar"  aria-valuemin="0"  aria-valuemax="100" style="width: 60%">
                    <span class="sr-only"></span>
                </div>
            </div>
            <p>CPU用率:75%</p>
            <div class="progress">
                <div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar"  aria-valuemin="0"  aria-valuemax="100" style="width: 75%">
                    <span class="sr-only"></span>
                </div>
            </div>
            <p>电源用率:100%</p>
            <div class="progress">
                <div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuemin="0"  aria-valuemax="100" style="width: 100%">
                    <span class="sr-only"></span>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
<script language="JavaScript" src="../js/Chart.js"></script>
<script >


    var ctx = document.getElementById('myChart').getContext('2d');
    var data = {
        datasets: [{
            data: [16,22,19,47,21,9], //在这里写数据
           // backgroundColor:["#e6f2da","#8abf8a","#bedadb","#cc3991","#e696bd","#f0d8e7"] //在这里指定颜色
            backgroundColor:["#f0d8e7","#beafc9","#695252","#ef5e32","#b09a8c","#ffe68f"]
        }],

        labels: [ //这里写标签，即每个数据属于哪个种类
            '财务人员',
            '技术人员',
            '管理人员',
            '市场人员',
            '运营人员',
            '安保人员'
        ]
    };

    var myPieChart = new Chart(ctx, {
        type: 'pie',
        data: data
    });

</script>
</html>