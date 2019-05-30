<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--声明文档兼容模式，表示使用IE浏览器的最新模式-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--设置视口的宽度(值为设备的理想宽度)，页面初始缩放值<理想宽度/可见宽度>-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Title</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="./modifyScheme.css" media="screen" type="text/css"> -->
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-slider.css">
    <link rel="stylesheet" type="text/css" href="../css/smartMenu.css">

    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;
    </script>

    <link rel="stylesheet" href="../css/others/jquery-ui.min.css">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>

    <style type="text/css">
        ::-webkit-scrollbar-track {  -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.2);  border-radius: 10px;  background-color: #F5F5F5;  }
        ::-webkit-scrollbar {  width: 12px;  height: 12px;  background-color: #F5F5F5;  }
        ::-webkit-scrollbar-thumb {  border-radius: 10px;  -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);  background-color: #c1c1c1;  }
        ::-webkit-scrollbar-thumb:hover{  background-color: #555;  }
        .node circle {  cursor: pointer;  fill: #fff;  stroke: steelblue;  stroke-width: 2px;  }
        .node text {  font-size: 12px;  }
        /*a:link {color:white}*/
        a:hover,a:active {color:black}
        .reply-in input {  width: 100%;  height: 30px;  margin-top: 10px;  margin-left: 10px;  }
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


    <script type="text/javascript">

        var meetingId = ${sessionScope.get("meetingId")};
        $(function () {
            //页面载入时直接运行
//            $("#findScheme").submit(); //即选择id为findScheme的form表单直接运行

            //定义发送数据
            var meeting = {};
            meeting.meetingId = meetingId;

            //ajax异步刷新界面
            $.ajax({
                type: "POST",
                url:"/findVoteScheme.action",
                data:JSON.stringify(meeting),
                contentType:"application/json",
                dataType:"json",
                success:function (data) {
                    console.log(data);

                    //打印方案数据
                    $.each(data, function (i,item) {
                        //data:被遍历的数据；i:循环次数；item：当前循环变量
                        $("#schemes").append(
                            "<tr>\n" +
                            "                        <td>"+parseInt(i+1)+"</td>\n" +
                            "                        <td >"+item.schemeName+"</td>\n" +
                            "                        <td><button class=\"btn btn-primary\">查看详情</button></td>\n" +
                            "                        <td style=\"text-align: center\">\n" +
                            "                            <label class=\"checkbox-inline\">\n" +
                            "                                <input type=\"checkbox\" name=\"schemeSelection\" value=\""+item.schemeId+"\">\n" +
                            "                            </label>\n" +
                            "                        </td>\n" +
                            "                    </tr>"
                        )

                    })

                }
            })

        })
    </script>
</head>
<body>
<%--大框架--%>
<div>
    <%--标题--%>
    <div class="container-fluid" style="padding: 0px;">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">专家参与投票</a><span></span></li>
                <!-- <li><a href="javascript:;">添加资料</a><span></span></li> -->
            </ul>
            <hr>
        </div>
    </div>
    <%--投票介绍及投票--%>
        <div class="container" style="margin-top:0px;font-size:16px!important;">
            <%--过程标识--%>
            <div><br>
                单项非排序式>简单多数当选原则
            </div>
                <%--投票介绍--%>
            <div style="width:100%;box-shadow:0 3px 5px rgba(0,0,0,0.2);padding:15px;margin-top:40px ">
                <h4>投票说明：</h4>
                <ol><li>每个方案只有一个选项，勾选代表支持，不勾选代表不支持；</li>
                    <li>在下列n个方案，最多只能勾选n方案，多选无效，得票最多的n个方案当选。</li>
                    <li>请谨慎投票，一旦提交就不能修改。</li>
                </ol>
            </div>
                <%--简单非排序式投票--%>


            <div><form method="post" action="/voteOne.action">
                <table id="schemes" class="table table-bordered" style="width:100%;border:1px solid gray;margin-top:40px;">
                    <tbody>
                    <tr >
                        <th style="width: 5%">#</th>
                        <th style="width:70%;">方案名称</th>
                        <th></th>
                        <th style="width:25%;">投票</th>
                    </tr>
                    <%--<tr>--%>
                        <%--<td>1</td>--%>
                        <%--<td >采用竞争的策略</td>--%>
                        <%--<td><button class="btn btn-primary">查看详情</button></td>--%>
                        <%--<td style="text-align: center">--%>
                            <%--<label class="radio-inline">--%>
                                <%--<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">--%>
                            <%--</label>--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                        <%--<td>2</td>--%>
                        <%--<td>以防御为主的南海战略</td>--%>
                        <%--<td><button class="btn btn-primary">查看详情</button></td>--%>
                        <%--<td style="text-align: center">--%>
                            <%--<label class="radio-inline">--%>
                                <%--<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">--%>
                            <%--</label>--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                        <%--<td>3</td>--%>
                        <%--<td>岛上加强军事基地建设</td>--%>
                        <%--<td><button class="btn btn-primary">查看详情</button></td>--%>
                        <%--<td style="text-align: center">--%>
                            <%--<label class="radio-inline">--%>
                                <%--<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">--%>
                            <%--</label>--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                    </tbody>
                </table>
                <div style="margin-top: 4px;margin-left: 45%">
                    <button class="btn btn-primary">确认投票</button>
                </div>
            </form>
            </div>
        </div>
    <%--提交按钮--%>
</div>
</body>
</html>