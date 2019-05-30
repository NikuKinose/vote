
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

    <script src="../jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            //页面载入时直接运行
            $("#findScheme").submit(); //即选择id为findScheme的form表单直接运行

        })

    </script>

</head>
<body>


<h2>欢迎${sessionScope.get('userSession').userName}来到投票界面！</h2>

<div>
    <form id="findScheme" method="post" action="/findNeedScheme.action">
        <input type="hidden" name="param" value="1">
    </form>


    <%--多选项投票--%><%--0：不合格，1：基本合格  2：合格  3：优秀--%>
    <form method="post" action="manyVoteOne.action">
        <table>
            <tr>
                <td>方案名</td>
                <td>投票情况</td>
            </tr>
            <c:forEach items="${schemes}" var="s">
                <tr>
                    <td>${s.schemeName}  </td>
                    <td>
                        <input type="radio" name="${s.schemeId}" value="4"/>优秀
                        <input type="radio" name="${s.schemeId}" value="5"/>合格
                        <input type="radio" name="${s.schemeId}" value="6"/>基本合格
                        <input type="radio" name="${s.schemeId}" value="7"/>不合格
                    </td>
                </tr>
            </c:forEach>
        </table>
        <input type="submit" value="确认提交投票结果">
    </form>


</div>



</body>
</html>
