<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function(){
            $.post("show",function(data){
                var result="";
                for(var i=0;i<data.length;i++){
                    result+="<dl>";
                    result+="<dt style='cursor:pointer'>"+data[i].name+"</dt>";
                    for(var j=0;j<data[i].children;j++){
                        result+="<dd>"+data[i].children(j),name+"</dd>";
                    }
                    result+="</dl>";
                }
                $("body").html(result);
            });
            //对所有父菜单添加点击事件
            //live("事件名,多个事件使用空格分割",function(){})
            $("dt").live("click",function(){
                //slow normal fast 数值
                $(this).siblings().sideToggle(1000);
            });
            })
    </script>
</head>
<body>

</body>
</html>
