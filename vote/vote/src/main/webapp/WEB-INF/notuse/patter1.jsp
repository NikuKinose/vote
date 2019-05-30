<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/23
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<form name="SingleChoiceNoSort" method="post" action="/createVoting1.action">--%>
    <%--最大可投方案数：<br/>--%>
    <%--<input type="text" name="optionSchemeMax"> <br/>--%>
    <%--最大选取方案数： <br/>--%>
    <%--<input type="text" name="votingSchemeNumber"> <br/>--%>
    <%--方案选取原则： <br/>--%>
    <%--<input type="checkbox" name="principleWordsList" value="简单多数原则">  简单多数原则--%>
    <%--<input type="checkbox" name="principleWordsList" value="过半数原则"> 过半数原则--%>
    <%--<input type="checkbox" name="principleWordsList" value="提取式重新投票"> 提取式重新投票--%>
    <%--<input type="checkbox" name="principleWordsList" value="舍去式重投"> <br/> 舍去式重投--%>
<%--<br>--%>
    <%--<input type="hidden" name="meetingId" value="${sessionScope.get('meetingId')}">--%>
    <%--<input type="submit" value="下一步">--%>
<%--</form><br/>--%>
<%--<br>--%>
<%--设置说明：<input type="text" value="${sessionScope.get('patterExplain1')}">--%>





<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="../../css/writing/patter1.css">
    <link rel="stylesheet" href="../../css/jquery-ui.min.css">
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <script src="../../js/jquery-ui.min.js"></script>

</head>
<%--选择方案数--%>
<form name="SingleChoiceNoSort" method="post" action="/createVoting1.action">
<div style="border: solid 1px #2C87F7;border-radius: 15px 15px 15px 15px;margin-left: 0%;">
    <div class="patter1_1">
        <span class="max_schema">最大可投方案数：<input type="text" name="optionSchemeMax"> </span> <br/>
    </div>

    <div class="patter1_1">
        <span class="max_schema">最大选取方案数：<input type="text" name="votingSchemeNumber"> </span><br/>
    </div>

    <%--方案选取原则--%>
    <div class="patter1_2">
        方案选取原则：&nbsp;
        <input type="checkbox" name="principleWordsList" value="简单多数原则">简单多数原则&nbsp;&nbsp;&nbsp;
        <input type="checkbox" name="principleWordsList" value="过半数原则">过半数原则
        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="checkbox" name="principleWordsList" value="提取式重新投票">提取式重新投票
        <input type="checkbox" name="principleWordsList" value="舍去式重投">舍去式重投
    </div>

    <div class="patter1_3">
        <div style="width:95%;box-shadow:0 3px 5px rgba(0,0,0,0.1);padding:15px;margin-top:30px;margin-right: 20px; ">
            <h4>设置说明：</h4>
            <ol>
                <li>单选项非排序式投票选举是指：针对每个方案只有一个投票选项，投票表示支持，不投票表示不支持。方案选取原则有简单数原则和过半数原则。</li>
                <li>最大可投方案数为n,1≤n≤N,N是方案总数。</li>
                <li>简单多数原则是指：得票最多的前n个方案当选。当按得票多少从低到高排序时，如果排第n与第n+1的方案的票数相同，则将这些方案作为备选方案从新投票。</li>
                <li>过半数原则是指得票最多且票数超过投票人数的一半的前n个方案当选，当得票数未过半时，则去掉得票数最小的候选项从新投票，这种方式也称为取舍式重新投票法。</li>
            </ol>
        </div>
        <%--设置说明：<br>--%>
        <%--<div class="patter1_4">--%>
            <%--<textarea style="width:550px;height:300px;" value="${sessionScope.get('patterExplain1')}"></textarea>--%>
        <%--</div>--%>
        <br>

        <div class="patter1_5" style="white-space:nowrap;margin-top: 2px;margin-left: 41%;">
            <%--<a href="javascript:;" class="submit"><small class="patter1_7" style="font-size: 15px;font-family: 宋体;">提交</small>--%>
                <%--<input type="submit" name="" id="patter1_6" value="提交">--%>
            <%--</a>--%>
            <div style="margin-left: 72%;margin-top: 1px;">
                <input type="submit" class="btn btn-primary" style="font-size: 13px;"value="提交">
            </div>
        </div>
    </div>
    <br>

</div>
</form>
</body>
</html>