<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/23
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form method="post" action="/addOption.action">
        选项名称：<input type="text" name="voteOptionName"><br/>
        最大可选方案数：<input type="text" name="voteOptionSchemeMax"><br/>
        <input type="submit" value="确认添加">
    </form><%--添加新方案--%>
</div>
</body>
</html>
