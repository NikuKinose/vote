<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/16
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>过半数原则多轮次投票界面</title>
</head>
<body>
  <form method="post" action="/checkResult.action">
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
        根据过半数原则，得票数最高的方案不超过总投票数的一半，请进行下一轮投票。
        此次投票将去掉得票数为0和得票数最少的方案<br/>
        <a href="startVoting.jsp">点击确认进行下一轮次的投票</a>
</body>
</html>
