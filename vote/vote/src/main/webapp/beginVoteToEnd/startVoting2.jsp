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
        <input type="hidden" name="param" value="2">
    </form>

    <form method="post" action="manyVote.action">
        <table>
            <tr>
                <td>方案名</td>
                <td>&nbsp;1 &nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;4</td>
            </tr>
            <c:forEach items="${schemes}" var="s">
                <tr>
                    <td>${s.schemeName}</td>
                    <td>
                    <input type="radio" name="${s.schemeId}" value="1"/>&nbsp;
                    <input type="radio" name="${s.schemeId}" value="2"/>&nbsp;
                    <input type="radio" name="${s.schemeId}" value="3"/>&nbsp;
                    <input type="radio" name="${s.schemeId}" value="4"/>&nbsp;
                    </td>
                </tr>
            </c:forEach>
        </table>
        <input type="button" value="确认提交投票结果" onclick="varify()">
    </form>

    <script type="text/javascript">

    </script>

</div>
</body>
</html>
