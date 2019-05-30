<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2019/1/14
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <!--声明文档兼容模式，表示使用IE浏览器的最新模式-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--设置视口的宽度(值为设备的理想宽度)，页面初始缩放值<理想宽度/可见宽度>-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>专家协商研讨</title>
    <h1 id="hzj">wshzj</h1>
    <%--<script>document.getElementById("hzj").style.color="blue"</script>--%>

    <%--<link rel="stylesheet" href="css/bootstrap.min.css">--%>
    <%--<!-- <link rel="stylesheet" href="./modifyScheme.css" media="screen" type="text/css"> -->--%>
    <%--<link rel="stylesheet" type="text/css" href="css/bootstrap-slider.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="css/smartMenu.css">--%>



    <%--<script src="download/jquery.min.js.下载"></script>--%>
    <%--<script type="text/javascript" src="download/jquery-smartMenu-min.js.下载"></script>--%>
    <%--<script src="download/bootstrap.min.js.下载"></script>--%>
    <%--<script src="download/bootstrap-slider.js.下载"></script>--%>

    <%--<script src="download/common.js.下载"></script>--%>
    <%--<script src="download/jquery.form.js.下载"></script>--%>

    <%--<script src="download/sendNotificationWebSocket.js.下载"></script>--%>
    <%--<script src="download/privateMasterialSelectWebSocket.js.下载"></script>--%>
    <%--<script src="download/privateReceiveWebSocket.js.下载"></script>--%>
    <%--<script src="download/privateSchemeSendWebSocket.js.下载"></script>--%>
    <%--<script src="download/chatWebSocket.js.下载"></script>--%>
    <%--<script src="download/privateRelativeSendWebSocket.js.下载"></script>--%>

    <%--<script src="download/d3.v3.min.js.下载"></script>--%>
    <%--<script src="download/drawnMindTree.js.下载"></script>--%>

    <%--<style>--%>

        <%--::-webkit-scrollbar-track--%>
        <%--{--%>
            <%---webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.2);--%>
            <%--border-radius: 10px;--%>
            <%--background-color: #F5F5F5;--%>
        <%--}--%>

        <%--::-webkit-scrollbar--%>
        <%--{--%>
            <%--width: 12px;--%>
            <%--height: 12px;--%>
            <%--background-color: #F5F5F5;--%>
        <%--}--%>

        <%--::-webkit-scrollbar-thumb--%>
        <%--{--%>
            <%--border-radius: 10px;--%>
            <%---webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);--%>
            <%--background-color: #c1c1c1;--%>
        <%--}--%>
        <%--::-webkit-scrollbar-thumb:hover{--%>
            <%--background-color: #555;--%>
        <%--}--%>

        <%--.node circle {--%>
            <%--cursor: pointer;--%>
            <%--fill: #fff;--%>
            <%--stroke: steelblue;--%>
            <%--stroke-width: 2px;--%>
        <%--}--%>

        <%--.node text {--%>
            <%--font-size: 12px;--%>
        <%--}--%>

        <%--.link {--%>
            <%--fill: none;--%>
            <%--stroke: #ccc;--%>
            <%--stroke-width: 1.5px;--%>
        <%--}--%>
        <%--/*a:link {color:white}*/--%>
        <%--a:hover,a:active {color:black}--%>
        <%--#xiudao{position: fixed;top: 0}--%>
        <%--#tongzhi{position: fixed;top:7.4%;left: 0.5%; }--%>
        <%--#whole{position: fixed; width: 100%}--%>
        <%--#publishedPlan{position: fixed;top:7.4%;right: 5%;}--%>
        <%--#bott{width: 85%;height: 400px;background:rgb(242,242,242);--%>
            <%--padding-top:4px;border: 1px solid lightgray;margin-bottom: 20px;--%>
            <%--position:fixed; bottom:150px;left: 84px }--%>

        <%--.pictureMagin{--%>
            <%--margin-top: 132px;--%>
        <%--}--%>
        <%--.TopBottom{--%>
            <%--margin-top: 100px;--%>
        <%--}--%>
        <%--.bt-unfold{--%>
            <%--margin-top: 5px;--%>
            <%--border-radius: 4px;--%>
            <%--border: none;--%>
            <%--background-color: #1BB394;--%>
            <%--color: white;--%>
            <%--margin-right: 15px;--%>
        <%--}--%>

        <%--.unfoldReply{--%>
            <%--margin-top: 5px;--%>
            <%--border-radius: 4px;--%>
            <%--border: none;--%>
            <%--background-color: #1BB394;--%>
            <%--color: white;--%>
            <%--margin-right: 15px;--%>
        <%--}--%>

        <%--.user-reply {--%>
            <%--display: none;--%>
            <%--width: 100%;--%>
            <%--height: 50px;--%>
        <%--}--%>

        <%--.reply-in {--%>
            <%--float: left;--%>
            <%--width: 78%;--%>
            <%--height: 50px;--%>
        <%--}--%>

        <%--.reply-in input {--%>
            <%--width: 100%;--%>
            <%--height: 30px;--%>
            <%--margin-top: 10px;--%>
            <%--margin-left: 10px;--%>
        <%--}--%>

        <%--.reply-buttons {--%>
            <%--float: right;--%>
            <%--margin-top: 10px;--%>
        <%--}--%>

        <%--.btn-comment {--%>
            <%--float: right;--%>
            <%--margin-right: 14px;--%>
            <%--background-color: #1BB394;--%>
            <%--border: none;--%>
            <%--color: white;--%>
        <%--}--%>

        <%--.btn-cancel {--%>
            <%--float: right;--%>
            <%--margin-right: 10px;--%>
        <%--}--%>

        <%--.reply-input{--%>

        <%--}--%>
        <%--.schemeComment{--%>
            <%--display: none;--%>
        <%--}--%>
        <%--.test {--%>

            <%--overflow: hidden;--%>
            <%--display: -webkit-box;/*必须*/--%>
            <%---webkit-line-clamp: 3;/*//必须*/--%>
            <%---webkit-box-orient: vertical;/*//必须*/--%>
            <%--border-radius: 5px;--%>

        <%--}--%>
        <%--.whole{width: 100%;position: fixed ;top:0px;background-color: #fff;opacity: .9}--%>
        <%--.whole .tab-nav .active a{color: #000}--%>

        <%--/*共有界面样式*/--%>
        <%--.whole .tab-nav {height: 40px;margin-bottom: 0;padding: 0 20px;text-align: center}--%>
        <%--.whole .tab-nav li{margin:0 1%;display: inline-block;}--%>
        <%--.whole .tab-nav li a{font-size:22px;color: #999;height: 40px;line-height: 40px;display: block;text-decoration: none}--%>
        <%--.whole .tab-nav li a:hover{color: #000}--%>
        <%--.whole .tab-nav li span{visibility:hidden;display: block;width: 100%;height: 4px;background-color: #2c87f7;border-radius: 2px;transition: all .2s}--%>
        <%--.whole .tab-nav .active span{visibility: visible}--%>
        <%--.whole hr{margin-top: 5px;margin-bottom: 8px}--%>

    <%--</style>--%>


    <%--<style id="__web-inspector-hide-shortcut-style__" type="text/css">--%>
        <%--.__web-inspector-hide-shortcut__, .__web-inspector-hide-shortcut__ *, .__web-inspector-hidebefore-shortcut__::before, .__web-inspector-hideafter-shortcut__::after--%>
        <%--{--%>
            <%--visibility: hidden !important;--%>
        <%--}--%>
    <%--</style></head>--%>
<%--<body class="" style="padding-right: 12px;">--%>


<!--导航栏部分-->
<div id="zw-product">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">专家参与投票</a><span></span></li>
                <!-- <li><a href="javascript:;">添加资料</a><span></span></li> -->
            </ul>
        </div>
    </div>
    <!--文本模式  上面基本部分-->
    <div class="container" style="margin-top:50px;font-size:16px!important;">
        <!-- <ul style="list-style: none; ">
            <li style="display: inline-block;padding: 5px;margin: 5px 10px;border-bottom: 3px solid #337ab7">单选项非排序式</li>
            <li style="display: inline-block;padding: 5px;margin: 5px 10px">多选项非排序式</li>
            <li style="display: inline-block;padding: 5px;margin: 5px 10px">排序式投票</li>
        </ul> -->


        <div><br>单项非排序式>简单多数当选原则</div>
        <div style="width:100%;box-shadow:0 3px 5px rgba(0,0,0,0.2);padding:15px;margin-top:40px ">
            <h4>投票说明：</h4>
            <ol><li>每个方案只有一个选项，勾选代表支持，不勾选代表不支持；</li>
                <li>在下列n个方案，最多只能勾选n方案，多选无效，得票最多的n个方案当选。</li>
                <li>请谨慎投票，一旦提交就不能修改。</li>
            </ol>
        </div>
        <div><table class="table table-bordered" style="width:100%;border:1px solid gray;margin-top:40px;" id="schemeTable">
            <tbody><tr >
                <th style="width: 5%">#</th>
                <th style="width:70%;">方案名称</th>
                <th></th>
                <th style="width:25%;">投票</th>

            </tr>

            <tr>
                <td>1</td>
                <td >采用竞争的策略</td>
                <td><button class="btn btn-primary">查看详情</button></td>
                <td style="text-align: center"><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                </label></td>

            </tr>
            <tr>
                <td>2</td>
                <td>以防御为主的南海战略</td>
                <td><button class="btn btn-primary">查看详情</button></td>
                <td style="text-align: center"><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option1">
                </label></td>
            </tr>

            <tr>
                <td>3</td>
                <td>岛上加强军事基地建设</td>
                <td><button class="btn btn-primary">查看详情</button></td>
                <td style="text-align: center"><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option1">
                </label></td>
            </tr>


            </tbody></table></div>

    </div>
</div>
</body></html>