<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/9/4
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>菜单</title>
</head>
<body>


<form method="post" action="turnToAddScheme.action">
    测试用会议室编号：<br/>
    <input type="text" name="meetingId" value="191300042" ><br/>
    测试用用户编号：<br/>
    <input type="text" name="userId" value="1" ><br/>
    <input type="submit" value="添加方案功能块" />
</form><br>

<form method="post" action="turnToAddMaterial.action">
    <input type="submit" value="添加资料" />
</form><br>

<form method="post" action="selectScheme.action">
    测试用会议室编号：<br/>
    <input type="text" name="meetingId" value="245628160"><br/>
    <input type="submit" value="选择投票的方案功能块">
</form><br/>

<form method="post" action="patterSelect.action">
    测试用会议室编号：<br/>
    <input type="text" name="meetingId" value="191300042" ><br/>
    <input type="submit" value="建立投票功能块" />
</form><br>


<form method="post" action="turnToVote.action">
    测试用会议室编号：<br/>
    <input type="text" name="meetingId" value="191300042" ><br/>
    <select name="votePatter">
        <option value="1">单选项非排序式投票</option>
        <option value="2">多选项非排序式投票</option>
        <option value="3">多选项排序式投票</option>
    </select>
    <br/>
    <input type="submit" value="投票功能块" />
</form><br>


<form method="post" action="turnToResults.action">
    测试用会议室编号：<br/>
    <input type="text" name="meetingId" value="191300042" ><br/>
    <input type="text" name="votingId" value="630358507" ><br/>
    <input type="submit" value="查询投票结果功能块" />
</form><br>

<form method="post" action="test.action">
    <input type="submit" value="test" />
</form><br>

<button onclick="subOpen()">open</button>
<script type="text/javascript">
    var ws;
    var target = 'ws://localhost:8083/echo'

    function subOpen() {
         if ("WebSocket" in window)
        {
            alert("您的浏览器支持 WebSocket!");
            // 打开一个 web socket
            ws = new WebSocket(target);


        } else
        {
            // 浏览器不支持 WebSocket
            alert("您的浏览器不支持 WebSocket!");
        }
    }

</script>







<%--<form  name="text" method="post" action="text.action">--%>
    <%--<%--%>
        <%--for(int i=1;i<=4;i++)--%>
        <%--{--%>
    <%--%>--%>
            <%--name:<input type="text" name="name"><br>--%>
            <%--&lt;%&ndash;<%="name"+i%>:<input type="text" name="<%="name"+i%>"><br>&ndash;%&gt;--%>
    <%--<%--%>
        <%--}--%>
    <%--%>--%>
    <%--<br>--%>
    <%--<input type="submit" value="登录">--%>
<%--</form>--%>



<%--<form method="post" action="/check.action">--%>
<%--<input name="votingId" value="191300042">--%>
<%--<input type="submit" value="结果查询"><br/>--%>
<%--</form>--%>




<%--投票模式的全查询--%>
<%--<form method="post" action="selectPatter.action">--%>
<%--<input type="submit" value="提交">--%>
<%--</form><br>--%>
<%--<div id="result2">--%>
<%--查询结果：<br/>--%>
<%--<table>--%>
<%--<c:forEach items="${patterResult}" var="p">&lt;%&ndash;//循环打印&ndash;%&gt;--%>
<%--&lt;%&ndash;以单次循环作为修改记录的基本单位&ndash;%&gt;--%>
<%--<tr>--%>
<%--<input type="button" value="${p.patterName}" />--%>
<%--</tr>--%>
<%--</c:forEach>--%>
<%--</table>--%>
<%--</div>--%>



<form method="post" action="addMaterial.action"></form><%--添加资料--%>

<form method="post" action="deleteScheme.action"></form><%--删除方案--%>

<form method="post" action="deleteMaterial.action"></form><%--删除资料--%>


<form method="post" action="viewDetails"></form><%--查看方案详情--%>

<form method="post" action="signalNoSortRuleSubmit"></form><%--单选项非排序式规则提交--%>

<form method="post" action="multipleNoSortRuleSubmit"></form><%--多选项非排序式规则提交--%>

<form method="post" action="SortRuleSubmit"></form><%--排序式规则提交--%>

<form method="post" action="voteSubmit"></form><%--投票提交--%>

<form method="post" action="voteResultQuery"></form><%--投票结果查询--%>

</body>
</html>
