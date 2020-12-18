<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>

    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                        url:"testJson",
                        type:"post",
                        dataType:"text",
                        success:function (msg) {
                           btn.value=text
                        }
                    }

                )
            })
        })
    </script>
</head>
<body>

<button  class="btn btn-success"  id="btn" value="测试ajax" />

</body>
</html>
