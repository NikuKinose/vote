<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: 40880--%>
  <%--Date: 2018/7/25--%>
  <%--Time: 17:19--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form name="Sorting" method="post" action="/createVoting3.action">--%>
    <%--得分设置：<br>--%>
    <%--<input type="radio" name="ascOrDesc" value="1">排名第一得满分，以后名次递减一分  <br>--%>
    <%--<input type="radio" name="ascOrDesc" value="2">排名第一得一分，以后名次递增一分  <br>--%>
    <%--方案选取数： <br/>--%>
    <%--<input type="text" name="optionNumber"> <br/>--%>
    <%--方案选取原则： <br/>--%>
    <%--<input type="radio" name="principleWordsList" value="1">选得分高的n个方案  <br>--%>
    <%--<input type="radio" name="principleWordsList" value="2">选得分低的n个方案  <br>--%>

    <%--<br>--%>
    <%--<input type="submit" value="下一步">--%>
<%--</form><br/>--%>
<%--<br>--%>
<%--设置说明：<input type="text" value="${sessionScope.get('patterExplain3')}">--%>
<%--</body>--%>
<%--</html>--%>



<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/25
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="border: solid 1px #2C87F7;border-radius: 15px 15px 15px 15px;margin-left: 0%;">
    <form name="Sorting" method="post" action="/createVoting3.action">
        <%--得分设置--%>
        <div style="margin-top: 4%;margin-left: 10%;">
            <p style="font-size: 17px;margin-bottom: 2px;">*得分设置：</p>
            <div style="margin-top: 0px;margin-left: 12%;">
                <input type="radio" name="ascOrDesc" value="1">排名第一得满分，以后名次递减一分  <br>
                <input type="radio" name="ascOrDesc" value="2">排名第一得一分，以后名次递增一分  <br>
            </div>
        </div>
        <%--方案选取数--%>
        <div style="margin-left: 10%;margin-top: 10px;">
            <p style="font-size: 17px;margin-bottom: 2px;">*方案选取数：</p>
            <div style="margin-top: 0px;margin-left: 15%;">
                <input type="text" name="optionNumber"> <br/>
            </div>
        </div>
        <%--方案选取原则--%>
        <div style="margin-left: 10%;margin-top: 10px">
            <p style="font-size: 17px;margin-bottom: 2px;">*方案选取原则：</p>
            <div style="margin-top: 0px;margin-left: 17%;">
                <input type="radio" name="principleWordsList" value="1">选得分高的n个方案  <br>
                <input type="radio" name="principleWordsList" value="2">选得分低的n个方案  <br>
            </div>
        </div>
        <%--设置说明--%>
        <%--<div style="margin-top: 13px;margin-left: 10%;">--%>
            <%--<p style="font-size: 17px;margin-bottom: 2px;">*设置说明：</p>--%>
            <%--<div style="margin-left: 14%;margin-top: 2px;">--%>
                <%--<textarea type="text"  style="width:500px;height:300px;" value="${sessionScope.get('patterExplain2')}"></textarea>--%>
            <%--</div>--%>
        <%--</div>--%>
            <div style="width:100%;box-shadow:0 3px 5px rgba(0,0,0,0.1);padding:15px;margin-top:20px ">
                <h4>投票：</h4>
                <ol>
                    <li>请对每个的排序第二位，以此类推。</li>
                    <li>得分规则是：如果有n个方案 ，则满分为N，排名第一的得满分，排名第二的得N-1分，以此类推。</li>
                    <li>方案选取原则：按分值大小选取，排名前n得方案当选</li>
                </ol>
            </div>
        <%--下一步按钮--%>
        <div class="patter1_5" style="white-space:nowrap;margin-top: 2px;margin-left: 46%;">
            <%--<div style="margin-left: 72%;margin-top: 1px;">--%>
                <%--<input type="submit" class="btn btn-primary" style="font-size: 13px;"value="提交">--%>
            <%--</div>--%>
                <div style="margin-top: 1px;">
                    <input type="submit" class="btn btn-primary" style="font-size: 13px;"value="提交">
                </div>
        </div>
    </form>
    <br/>
</div>
</body>
</html>