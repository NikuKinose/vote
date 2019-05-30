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

    <script src="../download/jquery.min.js.下载"></script>
    <script type="text/javascript" src="../download/jquery-smartMenu-min.js.下载"></script>
    <script src="../download/bootstrap.min.js.下载"></script>
    <script src="../download/bootstrap-slider.js.下载"></script>
    <script src="../download/common.js.下载"></script>
    <script src="../download/jquery.form.js.下载"></script>
    <script src="../download/sendNotificationWebSocket.js.下载"></script>
    <script src="../download/privateMasterialSelectWebSocket.js.下载"></script>
    <script src="../download/privateReceiveWebSocket.js.下载"></script>
    <script src="../download/privateSchemeSendWebSocket.js.下载"></script>
    <script src="../download/chatWebSocket.js.下载"></script>
    <script src="../download/privateRelativeSendWebSocket.js.下载"></script>
    <script src="../download/d3.v3.min.js.下载"></script>
    <script src="../download/drawnMindTree.js.下载"></script>
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
        .whole{width: 100%;position: fixed;background-color: #fff;opacity: .9}
        .whole .tab-nav .active a{color: #000}
        /*共有界面样式*/
        .whole .tab-nav {height: 40px;margin-bottom: 0;padding: 0 20px;text-align: center}
        .whole .tab-nav li{margin:0 1%;display: inline-block;}
        .whole .tab-nav li a{font-size:22px;color: #999;height: 40px;line-height: 40px;display: block;text-decoration: none}
        .whole .tab-nav li a:hover{color: #000}
        .whole .tab-nav li span{visibility:hidden;display: block;width: 100%;height: 4px;background-color: #2c87f7;border-radius: 2px;transition: all .2s}
        .whole .tab-nav .active span{visibility: visible}
        .whole hr{margin-top: 5px;margin-bottom: 8px}
    </style>
</head>
<body class="" style="padding-right: 12px;">
<!--导航栏部分-->
<section id="zw-product">
    <div class="container-fluid" style="padding: 0px;">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">专家参与投票</a><span></span></li>
            </ul>
            <hr>
        </div>
    </div>
    <!--文本模式  上面基本部分-->
    <div class="container" style="margin-top:50px;font-size:16px!important;">
        <p style="    margin-top: 35px;   font-size:16px; ">单选项非排序式 >简单多数排序 >第二轮投票</p>
        <div style="width:100%;box-shadow:0 3px 5px rgba(0,0,0,0.1);padding:15px;margin-top:20px ">
            <h4>投票说明：</h4>
            <ol>
                <li>设方案总数为N，拟选方案个数为n，在第一轮投票中，按的票数从低到高排列，第n个方&nbsp;&nbsp;案 与第n+1个方案得票数相同，这时就需要进行第二轮投票。</li>
                <li>重新投票前，先要进行重新投票设置，设置原则是：将要与第n个方案得票相同作为备选方案，从这些方案中选取x个方案。设得票数比第n得方案得得票数多得方案个数为y，则x=n-y</li>
            </ol>
        </div>
        <div  style="  margin-top: 50px;"><table class="table table-bordered">
            <tbody>
            <tr>
                <th style="width:85%;  font-size:16px;"  >备选方案  </th>
                <th style="width:15%; font-size:16px;     text-align: center;">投票</th>
            </tr>
            <tr style="border-top:1px solid gray">
                <td style=" width:85%; font-size:16px;">
                    <div style="margin-top: 7px">
                    采取进攻得策略<a href="" style="position: absolute;left: 53%;">查看详情</a>
                    </div>
                </td>
                <td style="text-align: center">
                    <div style="margin-bottom: 15px">
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                    </label>
                    </div>
                </td>
            </tr>
            <tr>
                <td style="font-size:16px;">
                    <div style="margin-top: 7px">
                    以防御为主得南海战略<a href="" style="position: absolute;left: 53%;">查看详情</a>
                    </div>
                </td>
                <td style="text-align: center; vertical-align:middle;">
                    <div style="margin-bottom: 15px">
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                    </label>
                    </div>
                </td>
            </tr>
            <tr>
                <td style="font-size: 16px;width: 35%;">
                    <div style="margin-top: 7px">
                    岛上多加强军事基地建设<a href="" style="position: absolute;left: 53%;">查看详情</a>
                    </div>
                </td>
                <td style="text-align: center">
                    <div style="margin-bottom: 15px">
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                    </label>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
        </div>
        <div style=" width: 100%;text-align: center;
    margin-top: 30px;" >
            <button class="btn btn-primary">确认投票</button>
        </div>
    </div>
</section>
</body>