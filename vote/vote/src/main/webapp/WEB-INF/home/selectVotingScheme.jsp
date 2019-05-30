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
    <title>Voting</title>
    <link rel="stylesheet" href="css/jquery-ui.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/common.js"></script>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-slider.css">
    <link rel="stylesheet" type="text/css" href="css/smartMenu.css">
    <link rel="stylesheet" href="css/jquery-ui.min.css">

    <script type="text/javascript">
        var meetingId = ${sessionScope.get("meetingId")};
    </script>



    <style type="text/css">
        /* Table Head */
        .sse_4{  box-shadow: #CCCCCC 2px 0px 20px 1px ;  }
        .sse_4 thead th {  background-color: rgb(81, 130, 187);  color: #fff;  border-bottom-width: 0;  }
        /* Column Style */
        .sse_4 td {  color: #000;  }
        /* Heading and Column Style */
        .sse_4 tr, .sse_4 th {  border-width: 1px;  border-style: solid;  border:solid #cccccc; border-width:1px 1px 1px 1px; padding:10px 1px;  }
        .sse_4 td{  border:solid #cccccc; border-width:1px 1px 1px 1px; padding:10px 1px;  }
        /* Padding and font style */
        .sse_4 th{  padding: 5px 10px;  font-size: 15px;  font-family: 微软雅黑;  font-weight: normal;  }
        .sse_4 td{  padding: 5px 10px;  font-size: 15px;  font-family: 微软雅黑;  font-weight: normal;  }
        .sse_5{  margin-top: 20px;  margin-left: 18%;  }
        .submit input {  position: absolute;  font-size: 100px;  right: 0;  top: 0;  opacity: 0;  }
        .submit:hover {  background: #AADFFD;  border-color: #78C3F3;  color: #004974;  text-decoration: none;  }
        .sse_9{  margin-left: 30%;  }
        .sse_12{  margin-left: 30%;  margin-top: 50%;  }
        ::-webkit-scrollbar-track {  -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.2);  border-radius: 10px;  background-color: #F5F5F5;  }
        ::-webkit-scrollbar {  width: 12px;  height: 12px;  background-color: #F5F5F5;  }
        ::-webkit-scrollbar-thumb {  border-radius: 10px;  -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);  background-color: #c1c1c1;  }
        ::-webkit-scrollbar-thumb:hover{  background-color: #555;  }
        .node circle {  cursor: pointer;  fill: #fff;  stroke: steelblue;  stroke-width: 2px;  }
        .node text {  font-size: 12px;  }
        /*a:link {color:white}*/
        a:hover,a:active {color:black}
        .reply-in input {  width: 100%;  height: 30px;  margin-top: 10px;  margin-left: 10px;  }
        .container-fluid{  margin-top: 0%;  margin-left: 0%;  font-size: 25px;  }
        .whole .tab-nav .active a{color: #000}
        /*共有界面样式*/
        .whole .tab-nav {height: 40px;margin-bottom: 0;padding: 0 20px;text-align: center}
        .whole .tab-nav li{margin:0 1%;display: inline-block;}
        .whole .tab-nav li a{font-size:22px;color: #999;height: 40px;line-height: 40px;display: block;text-decoration: none}
        .whole .tab-nav li a:hover{color: #000}
        .whole .tab-nav li span{visibility:hidden;display: block;width: 100%;height: 4px;background-color: #2c87f7;border-radius: 2px;transition: all .2s}
        .whole .tab-nav .active span{visibility: visible}
        .whole hr{margin-top: 5px;margin-bottom: 8px}
        .container-fluid{  margin-top: 0%;  margin-left: 0%;  font-size: 25px;  }
    </style>

<script>
    $(function () {
        //界面刚开始载入就自动运行

        //发送消息存入后台
        var meeting = {};
        meeting.meetingId = meetingId;
        $.ajax({
            type: 'POST',
            url: "/selectVotingScheme.action",
            data: JSON.stringify(meeting),
            contentType: "application/json",
            dataType: "json",
            success: function (data) {
                console.log(data);
                $.each(data, function (i, item) {

                    $("#selectSchemeDiv").append(
                        "<tr>\n" +
                        "                    <td>"+parseInt(i+1)+"</th>" +"<th>"+item.schemeName+"</td>"+
                        "<td>"+item.schemeUserName+"</th>  <th>"+item.schemeTime+"</td>\n" +
                        "    <td>\n  <button class=\"btn btn-primary\" style=\"font-size: 13px;\">查看详情</button>\n" +
                        "                    </td>     " +
                        "    <td style=\"padding: 5px 10px;\">\n" +
                        "                        <div class=\"sse_12\">\n" +
                        "                                <input type=\"checkbox\" value=\""+item.schemeId+"\" name=\"SchemeIds\">\n" +
                        "                        </div>\n" +
                        "                    </td>   " +
                        "            </tr>"
                    )
                })
            }
        })



    })

</script>
</head>
<body>




<div id="sse_1">
    <%--标题--%>
    <div class="container-fluid" style="padding: 0px;">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">选择参与投票的方案</a><span></span></li>
                <!-- <li><a href="javascript:;">添加资料</a><span></span></li> -->
            </ul>
            <hr>
        </div>
    </div>

    <%--备选提示--%>
     <div style="margin-top: 10px;margin-left: 18%;">
         <p style="font-size: 20px;font-family: 宋体;">选择方案></p>
     </div>
<form method="post" action="getScheme.action">
    <%--候选表单--%>
    <div class="sse_5">

            <table class="sse_4" id="selectSchemeDiv" >
                <thead>
                <tr>
                    <th>      </th>
                    <th align="center" valign="middle">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;方案名</th>
                    <th>&nbsp;&nbsp;负责人</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;内容</th>
                    <th>选择</th>
                </tr>
                </thead>

                <tbody id="schemeTableBody">

                </tbody>
            </table>
    </div><br>
    <%--提交按钮--%>
        <div style="margin-left: 72%;margin-top: 1px;">
            <input type="submit" class="btn btn-primary" style="font-size: 13px;"value="提交选择">
        </div>
</form>
</div>
