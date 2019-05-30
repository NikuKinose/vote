<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/15
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多选项排序式投票</title>

    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            //页面载入时直接运行
//            $("#findScheme").submit(); //即选择id为findScheme的form表单直接运行

            //定义发送数据
            var message = {};
            message.param = 2;

            //ajax异步刷新界面
            $.ajax({
                type: "POST",
                url:"/findNeedScheme.action",
                data:JSON.stringify(message),
                contentType:"application/json",
                dataType:"json",
                success:function (data) {
                    console.log(data);

                    //打印方案数据
                    $.each(data, function (i,item) {
                        //data:被遍历的数据；i:循环次数；item：当前循环变量
                        $("#schemes").append("<tr>\n" +
                            "                    <td>"+item.schemeName+"</td>\n" +
                            "                    <td>\n" +
                            "                    <input type=\"radio\" name=\""+item.schemeId+"\" value=\"8\"/>&nbsp;\n" +
                            "                    <input type=\"radio\" name=\""+item.schemeId+"\" value=\"9\"/>&nbsp;\n" +
                            "                    <input type=\"radio\" name=\""+item.schemeId+"\" value=\"10\"/>&nbsp;\n" +
                            "                    <input type=\"radio\" name=\""+item.schemeId+"\" value=\"11\"/>&nbsp;\n" +
                            "                    </td>\n" +
                            "                </tr>"
                        )

                    })

                }
            })

        })

    </script>
</head>
<body>
<h2>欢迎${sessionScope.get('userSession').userName}来到投票界面！</h2>

<div>

    <form method="post" action="/manyVote.action">
        <table id="schemes">
            <tr>
                <td>方案名</td>
                <td>&nbsp;1 &nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;4</td>
            </tr>
            <%--<c:forEach items="${schemes}" var="s">
                <tr>
                    <td>${s.schemeName}</td>
                    <td>
                    <input type="radio" name="${s.schemeId}" value="1"/>&nbsp;
                    <input type="radio" name="${s.schemeId}" value="2"/>&nbsp;
                    <input type="radio" name="${s.schemeId}" value="3"/>&nbsp;
                    <input type="radio" name="${s.schemeId}" value="4"/>&nbsp;
                    </td>
                </tr>
            </c:forEach>--%>
        </table>
        <input type="button" value="确认提交投票结果"/>
    </form>


</div>
</body>
</html>
