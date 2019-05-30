<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/20
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<h1>用户注册</h1>
<form method="post" action="/addUser.action">
    <th>name： <input type="text" name="userName"></th>
    <th>password：<input type="text" name="userPassword"></th>
    <th>sex <input type="text" name="userSex"></th>
    <th>e-mail <input type="text" name="userEmail"></th>
    <br>
    <input type="submit" value="提交注册">
</form>
<br>

</body>
</html>
