<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/26
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Result</title>
</head>
<body>


<form method="post" action="/getResult.action">
    <input name="votingId" value="191300042">
    <input type="submit" value="结果查询"><br/>
</form>

<div id="voteResult">
    投票结果展示：
    <table>
        <tr><th>姓名</th><th>方案</th><th>选择</th></tr>
        <c:forEach items="${voteResult}" var="vR"><%--//循环打印--%>
            <%--以单次循环作为修改记录的基本单位--%>
            <tr>
                <th><input type="text" name="userName" value="${vR.userName}"></th> <br>
                <th><input type="text" name="votingSchemeName" value="${vR.votingSchemeName}"></th>
                <th><input type="text" name="votingOptionName" value="${vR.votingOptionName}"></th>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
