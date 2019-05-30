
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/26
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多选项非排序式投票页面</title>

    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            //页面载入时直接运行
//            $("#findScheme").submit(); //即选择id为findScheme的form表单直接运行

            //定义发送数据
            var message = {};
            message.param = 1;

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
                        $("#schemes").append(
                            " <tr>\n" +
                            "                    <td>"+item.schemeName+" </td>\n" +
                            "                    <td>\n" +
                            "                        <input type=\"radio\" name=\""+item.schemeId+"\" value=\"4\"/>优秀\n" +
                            "                        <input type=\"radio\" name=\""+item.schemeId+"\" value=\"5\"/>合格\n" +
                            "                        <input type=\"radio\" name=\""+item.schemeId+"\" value=\"6\"/>基本合格\n" +
                            "                        <input type=\"radio\" name=\""+item.schemeId+"\" value=\"7\"/>不合格\n" +
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


    <%--多选项投票--%>
    <form method="post" action="/manyVoteOne.action">
        <table id="schemes">
            <tr>
                <td>方案名</td>
                <td>投票情况</td>
            </tr>
            <%--<c:forEach items="${schemes}" var="s">
                <tr>
                    <td>${s.schemeName}  </td>
                    <td>
                        <input type="radio" name="${s.schemeId}" value="4"/>优秀
                        <input type="radio" name="${s.schemeId}" value="5"/>合格
                        <input type="radio" name="${s.schemeId}" value="6"/>基本合格
                        <input type="radio" name="${s.schemeId}" value="7"/>不合格
                    </td>
                </tr>
            </c:forEach>--%>
        </table>
        <input type="submit" value="确认提交投票结果">
    </form>


</div>



</body>
</html>
