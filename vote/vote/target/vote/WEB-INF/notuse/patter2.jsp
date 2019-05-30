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
<%--<form name="MultipleChoiceNoSort" method="post" action="/createVoting2.action">--%>
    <%--<input type="radio" name="optionNumber" value="1">1--%>
    <%--<input type="radio" name="optionNumber" value="2">2--%>
    <%--<input type="radio" name="optionNumber" value="3">3--%>
    <%--<input type="radio" name="optionNumber" value="4">4  <br>--%>
    <%--选项1名称：<input type="text" name="optionOne">--%>
    <%--选项2名称：<input type="text" name="optionTwo">--%>
    <%--选项3名称：<input type="text" name="optionThree">--%>
    <%--选项4名称：<input type="text" name="optionFour"> <br>--%>
    <%--选项1最大可投方案数：<input type="text" name="optionOneSchemeMax"> <br/>--%>
    <%--选项2最大可投方案数：<input type="text" name="optionTwoSchemeMax"> <br/>--%>
    <%--选项3最大可投方案数：<input type="text" name="optionThreeSchemeMax"> <br/>--%>
    <%--选项4最大可投方案数：<input type="text" name="optionFourSchemeMax"> <br/>--%>
    <%--方案选取原则： <br/>--%>
    <%--<input type="checkbox" name="principleWordsList" value="选项1简单多数原则">  选项1简单多数原则--%>
    <%--<input type="checkbox" name="principleWordsList" value="选项1过半数原则"> 选项1过半数原则--%>
    <%--<input type="checkbox" name="principleWordsList" value="选项1简单多数且选项N一票否决原则"> 选项1简单多数且选项N一票否决原则--%>

    <%--<br>--%>
    <%--<input type="submit" value="下一步">--%>
<%--</form><br/>--%>
<%--<br>--%>
<%--设置说明：<input type="text" value="${sessionScope.get('patterExplain2')}">--%>
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
    <form name="MultipleChoiceNoSort" method="post" action="/createVoting2.action">
        <%--选项名称按钮--%>
        <div style="margin-left: 40%;margin-top: 3%">
            <input type="radio" name="optionNumber" value="1">1&nbsp;&nbsp;
            <input type="radio" name="optionNumber" value="2">2&nbsp;&nbsp;
            <input type="radio" name="optionNumber" value="3">3&nbsp;&nbsp;
            <input type="radio" name="optionNumber" value="4">4  <br>
        </div>

        <%--选项名称--%>
        <div style="margin-left: 10%;margin-top: 2%">
            <div style="margin-bottom: 4px">
                选项1名称：<input type="text" name="optionOne">&nbsp;&nbsp;&nbsp;
                选项2名称：<input type="text" name="optionTwo"><br>
            </div>
            <div>
                选项3名称：<input type="text" name="optionThree">&nbsp;&nbsp;&nbsp;
                选项4名称：<input type="text" name="optionFour"> <br>
            </div>
        </div>

        <%--最大可投方案数    --%>
        <div style="margin-top: 13px;margin-left: 10%;">
            <p>*最大可投方案数:</p>
            <div style="margin-bottom: 4px;margin-top: 10px;margin-left: 34px">
                选项1：<input type="text" name="optionOneSchemeMax">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                选项2：<input type="text" name="optionTwoSchemeMax"> <br/>
            </div>
            <div style="margin-left: 34px;">
                选项3：<input type="text" name="optionThreeSchemeMax">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                选项4：<input type="text" name="optionFourSchemeMax"> <br/>
            </div>
        </div>

        <%--方案选取原则--%>
        <div style="margin-left: 10%;margin-top: 13px">
            *方案选取原则： <br/>
            <div style="margin-top: 8px;margin-left: 2px;">
                <input type="checkbox" name="principleWordsList" value="选项1简单多数原则">  选项1简单多数原则&nbsp;
                <input type="checkbox" name="principleWordsList" value="选项1过半数原则"> 选项1过半数原则&nbsp;
                <input type="checkbox" name="principleWordsList" value="选项1简单多数且选项N一票否决原则"> 选项1简单多数且选项N一票否决原则
            </div>
            <%--<div style="margin-top: 13px;">--%>
                <%--*设置说明：<br/>--%>
                <%--<div style="margin-left: 14%;margin-top: 2px;">--%>
                    <%--<textarea type="text"  style="width:500px;height:300px;" value="${sessionScope.get('patterExplain2')}"></textarea>--%>
                <%--</div>--%>
            <%--</div>--%>
            <div style="width:95%;box-shadow:0 3px 5px rgba(0,0,0,0.1);padding:15px;margin-top:20px;margin-left: 12px;">
                <h4>设置说明：</h4>
                <ol><li>多选项非排序式投票选举是指：针对每个方案有多个选项，针对每个方案只能在这些项中勾选一个。</li>
                    <li>针对选项i,最多只能选取ni个方案，ni的最小值为1，最大值为方案总数N。</li>
                </ol>
            </div>

            <div class="patter1_5" style="white-space:nowrap;margin-top: 2px;margin-left: 20%;">
                <%--<div style="margin-left: 72%;margin-top: 1px;">--%>
                    <%--<input type="submit" class="btn btn-primary" style="font-size: 13px;"value="提交">--%>
                <%--</div>--%>
                    <div style="margin-top: 1px;">
                        <input type="submit" class="btn btn-primary" style="font-size: 13px;"value="提交">
                    </div>
            </div>
            <%--<input type="submit" value="下一步">--%>
        </div>
    </form>
    <%--设置说明：<input type="text" value="${sessionScope.get('patterExplain2')}">--%>
</div>
</body>
</html>
