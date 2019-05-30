<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/23
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加资料</h1>
<div>
    <%--注意转换类型enctype="multipart/form-data">--%>
    <form method="post" action="addMaterial.action" enctype="multipart/form-data">
        资料名称：<input type="text" name="materialName">
        <br>
        资料类型：<input type="text" name="materialType">
        <br>
        资料文件：<input type="file" name="pic" required="required" />
        <br>
        资料标签：<input type="text" name="materialLabel">
        <input type="submit" value="确认添加">

    </form>
</div>

<h1>资料展示页面：</h1>
<br>
<form method="post" action="findMaterial.action">
    <input type="submit" value="查询所有资料内容">
</form><br>
<div id="result">
    查询结果：
    <table border="1">
        <tr><th>资料ID</th><th>资料名</th><th>类型</th><th>资料标签</th><th>上传时间</th><th>修改</th></tr>
        <c:forEach items="${results}" var="s"><%--//循环打印--%>
            <%--以单次循环作为修改记录的基本单位--%>
            <tr>
                <th>${s.materialId}</th>
                <th>${s.materialName}</th>
                <th>${s.materialType}</th>
                <th>${s.materialLabel}</th>
                <th>${s.createTime}</th>
                <th><a href="findMaterialById.action?materialId=${s.materialId}" >查看详情</a> </th>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
