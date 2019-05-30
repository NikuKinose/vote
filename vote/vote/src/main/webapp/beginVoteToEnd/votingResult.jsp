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

    <script src="../jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            //页面载入时直接运行
            $("#checkResult").submit(); //即选择id为checkResult的form表单直接运行

        })

    </script>
</head>
<body>

  <form id="checkResult" method="post" action="/checkResult.action">
    <table>
        <tr>
            <td>方案名</td>
            <td>获票数</td>
        </tr>
        <c:forEach items="${schemes}" var="s">
            <tr>
                <td>${s.schemeName}  </td>
                <td>${s.schemeAgreeNumber}  </td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="查看投票结果">
    </form>

</body>
</html>
