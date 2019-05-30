<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/20
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加方案</title>
</head>
<body>
<h1>方案相关操作</h1>
<div>
    <form method="post" action="/addScheme.action">
        方案名称：
        <input type="text" name="schemeName"><br/>
        方案描述：
        <textarea cols="40" rows="10" name="schemeAfterContent"></textarea>
        <%--<input type="text" style="width:350px;height: 100px" name="schemeAfterContent"><br/>--%>
        <input type="submit" value="确认添加">
    </form><%--添加新方案--%>
</div>

备选方案展示：

</body>
</html>
