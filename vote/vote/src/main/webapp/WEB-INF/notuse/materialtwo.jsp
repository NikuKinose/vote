<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/25
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/findMaterialById.action" enctype="multipart/form-data">
    <p>资料ID：  <input type="text" name="materialId" value="${result.materialId}" ></p>
    <p>资料名：  <input type="text" name="materialName" value="${result.materialName}" ></p>
    <p>类型：    <input type="text" name="materialType" value="${result.materialType}" ></p>
    <P>资料标签：<input type="text" name="materialLabel" value="${result.materialLabel}" ></P>
    <p>上传时间：<input type="text" name="createTime" value="${result.createTime}" ></p>
    <p>文件内容:<input type="hidden" name="materialPath" value="${result.materialPath}">
    <div>
        <img src="/image/${result.materialPath}" alt="图片显示失败！">
    </div>
    </p>


</form>

</body>
</html>
