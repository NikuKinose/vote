<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/24
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
  <script src="js/jquery-1.8.3.min.js"></script>
  <script>
    $(document).ready(function(){
        $("#01").click(function(){
            $.ajax({
                url:"image/${result.materialPath}",
                anysc:false,
                success:function (data) {
                    $("#02").html(data);
                },
                type:"post",
                dataType:"text"
                });
        });
    });
  </script>
</head>
<body>
  <form method="post" action="/findMaterialById.action" enctype="multipart/form-data">
    <p>资料ID：  <input type="text" name="materialId" value="${result.materialId}" ></p>
    <p>资料名：  <input type="text" name="materialName" value="${result.materialName}" ></p>
    <p>类型：    <input type="text" name="materialType" value="${result.materialType}" ></p>
    <P>资料标签：<input type="text" name="materialLabel" value="${result.materialLabel}" ></P>
    <p>上传时间：<input type="text" name="createTime" value="${result.createTime}" ></p>
    <p id="#02">文件内容: <button id="#01" type="button"  >查看内容</button>
    </p>
  </form>
  </body>
</html>
