<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/16
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>最终投票结果页面</title>

    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            //页面载入时直接运行
//            $("#findScheme").submit(); //即选择id为findScheme的form表单直接运行

            //定义发送数据
            var list=[];
            var message = {};
            message.param = 3;

            //ajax异步刷新界面
            $.ajax({
                type: "POST",
                url:"getSchemes.action",
                data:JSON.stringify(message),
                contentType:"application/json",
                dataType:"json",
                success:function (data) {
                    list=data;
                    console.log(data);
                    $.each(data,function (i,item) {
                        $("#resultsHead").append("<td>"+item.schemeName+"</td>")

                    })

                    $.ajax({
                        type: "POST",
                        url:"/getResults.action",
                        data:{"list":list},
                        contentType:"application/json",
                        dataType:"json",
                        success:function (data) {
                            console.log(data);

                            //打印方案数据
                            $.each(data, function (i,item) {
                                //data:被遍历的数据；i:循环次数；item：当前循环变量
                                $("#results").append(" <tr>\n")
                                $.each(item,function (j,item1) {
                                    $("#results").append("                <td>"+item[j]+"  </td>\n")
                                })
                                $("#results").append(" <tr>")

                            })

                        }
                    })

                }
            })



        })

    </script>
</head>
<body>

    <table id="results" border="1">
        <tr id="resultsHead">
            <td>用户名</td>
        </tr>
    </table>

</body>
</html>
