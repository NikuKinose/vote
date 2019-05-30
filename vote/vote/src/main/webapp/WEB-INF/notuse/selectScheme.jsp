<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2019/1/15
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="123">
    查询结果：
    <form method="post" action="getScheme.action">
    <table>
        <tr><th>方案名称</th><th>方案时间</th></tr>
        <c:forEach items="${schemeResult}" var="r"><%--//循环打印--%>
            <%--以单次循环作为修改记录的基本单位--%>
            <tr>
                    <th>${r.schemeName}</th>  <th>${r.schemeTime}</th>
                <th><input type="checkbox" value="${r.schemeId}" name="SchemeIds" ></th>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="提交选择方案">
    </form>
</div>





<%--<div id="userResult">--%>
    <%--查询结果：--%>
    <%--<table>--%>
        <%--<tr><th>方案名称</th><th>方案时间</th></tr>--%>
        <%--<c:forEach items="${schemeResult}" var="r">&lt;%&ndash;//循环打印&ndash;%&gt;--%>
            <%--&lt;%&ndash;以单次循环作为修改记录的基本单位&ndash;%&gt;--%>
            <%--<tr>--%>
                <%--<th><input type="text" name="schemeName" value="${r.schemeName}"></th>--%>
                <%--<th><input type="text" name="schemeTime" value="${r.schemeTime}"></th>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
