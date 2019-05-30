<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/9/7
  Time: 15:34
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

    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="css/modifyScheme.css" media="screen" type="text/css">
    <link rel="stylesheet" type="text/css" href="../../css/bootstrap-slider.css">
    <link rel="stylesheet" type="text/css" href="../../css/smartMenu.css">


    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;
    </script>

    <script src="../../download/jquery.min.js.下载"></script>
    <script type="text/javascript" src="../../download/jquery-smartMenu-min.js.下载"></script>
    <script src="../../download/bootstrap.min.js.下载"></script>
    <script src="../../download/bootstrap-slider.js.下载"></script>

    <script src="../../download/common.js.下载"></script>
    <script src="../../download/jquery.form.js.下载"></script>

    <script src="../../download/sendNotificationWebSocket.js.下载"></script>
    <script src="../../download/privateMasterialSelectWebSocket.js.下载"></script>
    <script src="../../download/privateReceiveWebSocket.js.下载"></script>
    <script src="../../download/privateSchemeSendWebSocket.js.下载"></script>
    <script src="../../download/chatWebSocket.js.下载"></script>
    <script src="../../download/privateRelativeSendWebSocket.js.下载"></script>

    <script src="../../download/d3.v3.min.js.下载"></script>
    <script src="../../download/drawnMindTree.js.下载"></script>

    <style>

        ::-webkit-scrollbar-track
        {
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.2);
            border-radius: 10px;
            background-color: #F5F5F5;
        }

        ::-webkit-scrollbar
        {
            width: 12px;
            height: 12px;
            background-color: #F5F5F5;
        }

        ::-webkit-scrollbar-thumb
        {
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #c1c1c1;
        }
        ::-webkit-scrollbar-thumb:hover{
            background-color: #555;
        }

        .node circle {
            cursor: pointer;
            fill: #fff;
            stroke: steelblue;
            stroke-width: 2px;
        }

        .node text {
            font-size: 12px;
        }

        .link {
            fill: none;
            stroke: #ccc;
            stroke-width: 1.5px;
        }
        /*a:link {color:white}*/
        a:hover,a:active {color:black}
        #xiudao{position: fixed;top: 0}
        #tongzhi{position: fixed;top:7.4%;left: 0.5%; }
        #whole{position: fixed; width: 100%}
        #publishedPlan{position: fixed;top:7.4%;right: 5%;}
        #bott{width: 85%;height: 400px;background:rgb(242,242,242);
            padding-top:4px;border: 1px solid lightgray;margin-bottom: 20px;
            position:fixed; bottom:150px;left: 84px }

        .pictureMagin{
            margin-top: 132px;
        }
        .TopBottom{
            margin-top: 100px;
        }
        .bt-unfold{
            margin-top: 5px;
            border-radius: 4px;
            border: none;
            background-color: #1BB394;
            color: white;
            margin-right: 15px;
        }

        .unfoldReply{
            margin-top: 5px;
            border-radius: 4px;
            border: none;
            background-color: #1BB394;
            color: white;
            margin-right: 15px;
        }

        .user-reply {
            display: none;
            width: 100%;
            height: 50px;
        }

        .reply-in {
            float: left;
            width: 78%;
            height: 50px;
        }

        .reply-in input {
            width: 100%;
            height: 30px;
            margin-top: 10px;
            margin-left: 10px;
        }

        .reply-buttons {
            float: right;
            margin-top: 10px;
        }

        .btn-comment {
            float: right;
            margin-right: 14px;
            background-color: #1BB394;
            border: none;
            color: white;
        }

        .btn-cancel {
            float: right;
            margin-right: 10px;
        }

        .reply-input{

        }
        .schemeComment{
            display: none;
        }
        .test {

            overflow: hidden;
            display: -webkit-box;/*必须*/
            -webkit-line-clamp: 3;/*//必须*/
            -webkit-box-orient: vertical;/*//必须*/
            border-radius: 5px;

        }
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



    <script>
        var meetingId = 1;
        var userId = 7;




        /**
         * 发表方案
         */
        function publishedPlan() {
            var newScheme = {};
            newScheme.schemeMeetingIdFk = meetingId;
            newScheme.schemeUserIdFk = 7;
            newScheme.schemeBeforeContent = $("#ner").val();
            newScheme.schemeName = $("#planName").val();
            console.log(newScheme);

            $.ajax({
                type:"POST",
                url:urlRootContext+"/api/Scheme/newScheme",
                data:JSON.stringify(newScheme),
                contentType:"application/json",
                dataType:"json",
                success:function (data) {
                    console.log(data);
                    var _schemeId = data.data.schemeId;
                    newScheme.schemeId = _schemeId;
                    /**
                     * 因为要先插入数据，再查询。chatWebsocket.send("selectAllSchemeAndSpeak");如果写在ajax外面，就是先查询后插入数据了。
                     */
                    var addhtml =  "\n" +
                        "        <div id=\"left\" style=\"width: 80px;height: inherit;float: left; /*border: solid green 1px;*/\">\n" +
                        "            <img src=\"image/expertPicture/"+newScheme.schemeUserIdFk+".jpg\" style='width: 60px;height: 60px;border-radius: 5%' />\n" +

                        "        </div>\n" +
                        "        <div id=\"right\" style=\"/*border: solid red 1px;*/height: inherit;width: 88%;margin-left: 80px;padding-bottom: 51px;\">\n" +
                        "            <div id=\"scheme\" style=\"border: solid #2c87f7 1.5px;border-radius: 5px;width: 100%;height: auto;padding: 12px\">\n" +
                        "\n" +
                        "                <div id=\"expertName\" style=\"color:#2c87f7;margin: 3px\">\n" +
                        "                    董奕\n" +
                        "                </div>\n" +
                        "                <div  id=\"schemeContent\">\n" +
                        "                <div id='schemeMore"+_schemeId+"' class='test'>" +
                        "                    &nbsp;&nbsp;"+newScheme.schemeBeforeContent+"\n" +
                        "                </div>" +
                        "                </div>\n" +
                        "                <div><a id='schemeMoreA"+_schemeId+"' onclick=\"readMore("+_schemeId+",1)\">更多</a><a id='schemeHiddenA"+_schemeId+"' hidden onclick=\"readHidden("+_schemeId+",1)\">收起</a></div>" +

                        "\n" +

                        "                <div id=\"unfold\" align=\"right\">\n" +
                        "                  <span style='font-size: 5px'color='#5e5e5e'>提出时间："+time+"</span>&nbsp;&nbsp;" +
                        "                    <span id='SchemeCommentNumber"+_schemeId+"' style='font-size: 5px'color='#5e5e5e'>评论数："+0+"</span>&nbsp;&nbsp;" +
                        "                    <button class='bt-unfold'id='schemeSwitch"+_schemeId+"' onclick=\"unfold(schemeComment"+_schemeId+",schemeSwitch"+_schemeId+")\">展开</button>\n" +
                        "                    <button onclick='reply(this)' name='replyButton' class=\"unfoldReply\">回复</button>" +
                        "                </div>\n" +
                        "                <div class=\"user-reply\">\n" +
                        //这里是程度滑动条
                        "                        <input id=\"sliderbtn"+_schemeId+"\" type=\"text\" data-slider-min=\"-10\" data-slider-max=\"10\" data-slider-step=\"1\" data-slider-value=\"0\"/>" +
                        "                        <span id=\"currentSliderValLabel"+_schemeId+"\">&nbsp;&nbsp;强度：<span id=\"sliderVal"+_schemeId+"\">0</span></span>"+

                        "                    <div class=\"reply-in\">\n" +
                        "                        <input class='reply-input' type=\"text\" value=\"\" name=\"\" placeholder=\"请输入评论内容\" />\n" +
                        "                    </div>\n" +
                        "                    <div class=\"reply-buttons\">\n" +/* onload=\"slider("+item.schemeId+")\"*/
                        "                        <button type=\"button\" class=\"btn btn-primary btn-comment btn-sm\" onclick='comment(this, "+_schemeId+", 0, getspeakMatchedDegree("+_schemeId+"))'>评论</button>\n" +
                        "                        <button type=\"button\" class=\"btn btn-default btn-cancel btn-sm\" onclick='cancel(this)'>取消</button>\n" +
                        "                    </div>\n" +
                        "                </div>" +
                        "                <hr style=\"height:1px;background-color: #2c87f7;width: 100%\" />\n" +
                        "                <div class='schemeComment' id=\"schemeComment"+_schemeId+"\">\n" +
                        "                </div>\n" +
                        "\n" +
                        "            </div>\n" +
                        "\n" +
                        "        </div>"
                    ;

                    var test = {};
                    test.meetingId = meetingId;
                    test.type = "scheme";
                    test.message = addhtml;
                    test.data = newScheme;
                    chatWebsocket.send(JSON.stringify(test));
//                    privateSchemeSendWebSocket.send(meetingId);
//                    privateRelativeSendWebSocket.send(meetingId);
                    redrawn();
                    $("#closeNewScheme").click();
                }
            });
        }

        /**
         * 发言区的隐藏与显示
         * @param id
         */
        function unfold(id,selfId) {

            if(id.style.display != "block") {
                id.style.display = "block";
                selfId.innerHTML="收起";
            } else {
                id.style.display = "none";
                selfId.innerHTML="展开";
            }

        }

        /**
         * 发表方案时，上传文件
         */
        function uploadFile() {

            $("#uploadFile").ajaxSubmit({
                type: "POST",
                url: urlRootContext+"/uploadFile.action",
                //一定要设置contentType的utf-8，不然会中文乱码(然而还是没有，是在后台进行转码)
                contentType: "application/x-www-form-urlencoded; charset=utf-8",
                dataType: "json",
                success: function(data){
                    console.log(data);
                    $("#fak").toggle();
                    privateMaterialSelectWebSocket.send(meetingId);
                }
            });

        }

        //减支
        function gotext() {
            var meeting = {};
            meeting.meetingId = meetingId;

            $.ajax({
                type : "POST",
                url : "/text",
                data : JSON.stringify(meeting),
                contentType: "application/json",
                dataType : "json",
                success:function (data) {
                    console.log(data);
                    $("#tree").empty();
                    $.each(data.data, function (i, item) {//遍历有多少课树
                        // sel(item, 0);
                        drawnMindTree(item);
                    })

                }
            })
        }

        $(function() {
            var slidevalue = 0;
            $('#smdresponse').slider().on('slide', function (slideEvt) {
                //当滚动时触发
                //console.info(slideEvt);
                //获取当前滚动的值，可能有重复
                console.log(slideEvt.value);
                slidevalue = slideEvt.value;
                //字显示
                $("#smdresponseAValAdd").text(slideEvt.value);

            }).on('change', function (e) {
                //当值发生改变的时候触发
                //console.info(e);
                slidevalue = e.value.newValue;
            });


            //树形图发言的保存按钮-传入数据库
            $("#newnode").click(function () {
                var responsedata = {};
                responsedata.speakMatchedDegree = slidevalue;
                responsedata.speakContent = $("#scresponse").val();
                responsedata.speakFatherId = responsedataFar;
                responsedata.speakSchemeId = responsedataScheme;
                responsedata.speakUserId = userId;


                console.log(responsedata);
                $.ajax({
                    type:"POST",
                    url:urlRootContext+"/api/SpeakController/newSpeak",
                    data:JSON.stringify(responsedata),
                    contentType:"application/json",
                    dataType:"json",
                    success:function (data) {
                        console.log(data);

                        $("#newNodeClose").click();
                        $("#scresponse").val("");
                        $("#smdresponse").val("");
                        //发送给所有人查询指令，前端数据展示的代码写在chatWebsocket的onmessage方法的ajax里面，不是这里
                        chatWebsocket.send(meetingId);
                        privateSpeakingLinesWebSocket.send(meetingId);
                        privateRelativeSendWebSocket.send(meetingId);

                        redrawn();

                    }
                });
            });

            $("#fak").hide();
            $("#publishedPlan").click(function(){
                $("#fak").toggle();
            });


            //获取顶部菜单的三项
            var $tabMenu=$('.whole .tab-nav li');
            //获取顶部菜单对应的三部分要显示的内容，其中第一个显示，第二三个隐藏
            var $tabContent=$("section>div[role='tabpanel']");

            $tabMenu.click(function () {

                $(this).addClass('active').siblings().removeClass('active');
                //获取当前点击的菜单项的序号，第一个对应0，第二个对应1，
                var tabIndex=$(this).index();
                //$tabContent.eq(tabIndex)为获取对应要显示的内容，然后将其同胞元素（有五个，所以只获取role='tabpanel'的同胞元素）隐藏
                $tabContent.eq(tabIndex).show().siblings("div[role='tabpanel']").hide();

            });
            $("#we").click(function(){
                $("li.wen").css("background","white" );
                $("li.si").css("background","rgb(138,174,196)" );
            });

            $("[data-toggle='popover']").popover();

            $(".btn-reply").click(function() {
                // console.log($(this).index());
                // 获取回复按钮集合,getElementByClassName;
                var m = document.getElementsByClassName("btn-reply");
                var n = document.getElementsByClassName("user-reply");
                console.log('回复按钮集合' +
                    m);
                // 获取回复按钮的索引
                var index = $(".btn-reply").index($(this));
                console.log(index);
                $(".user-reply").eq(index).css("display",
                    "block");
            });
            $('.btn-cancel').click(function() {
                var m = document.getElementsByClassName("btn-reply");
                var n = document.getElementsByClassName("user-reply");
                var index = $(".btn-cancel").index($(this));
                console.log(index);
                $(".user-reply").eq(index).css("display",
                    "none");
            });





            //重绘
            redrawn();

        });

        function reply(button) {
            var m = document.getElementsByClassName("btn-reply");
            var n = document.getElementsByClassName("user-reply");
            console.log('回复按钮集合' +
                m);
            // 获取回复按钮的索引
            var index = $(".unfoldReply").index(button);
            console.log(index);
            $(".user-reply").eq(index).css("display",
                "block");
        }

        function cancel(button) {
            var m = document.getElementsByClassName("btn-reply");
            var n = document.getElementsByClassName("user-reply");
            var index = $(".btn-cancel").index($(button));
            console.log(index);
            $(".user-reply").eq(index).css("display",
                "none");
        }

        function comment(button, schemeId, speakFatherId, speakMatchedDegree) {
            var m = document.getElementsByClassName("btn-reply");
            var n = document.getElementsByClassName("user-reply");
            var index = $(".btn-comment").index($(button));
            var speakContent = $(".reply-input").eq(index).val();
            chat(schemeId, speakContent, speakFatherId, speakMatchedDegree);
        }
        //时间序列发言文本，
        /*function loadMes(){
            $('#timeMessages').load('/privateSpeakingLines')
        }*/


    </script>

    <style id="__web-inspector-hide-shortcut-style__" type="text/css">
        .__web-inspector-hide-shortcut__, .__web-inspector-hide-shortcut__ *, .__web-inspector-hidebefore-shortcut__::before, .__web-inspector-hideafter-shortcut__::after
        {
            visibility: hidden !important;
        }
    </style></head>
<body class="" style="padding-right: 12px;">


<!--导航栏部分-->
<section id="zw-product">
    <div class="container-fluid" style="padding: 0px;">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">备选方案设置</a><span></span></li>
                <li><a href="javascript:;">添加资料</a><span></span></li>


            </ul>
            <hr>
        </div>
    </div>
    <!--文本模式  上面基本部分-->
    <div class="container">
        <button type="button" class="btn btn-default" id="tongzhi" data-container="body" data-toggle="popover" data-placement="right" data-content=" 言论中不要涉及暴力，敏感话题等！" data-original-title="" title="">
            <span class="glyphicon glyphicon-bullhorn" aria-hidden="true"></span>  通知
        </button>
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#fak" id="publishedPlan">添加新方案</button>
    </div>
    <div role="tabpanel" id="messages">
        <div id="whole1" style="width: 100%;min-height: 400px;margin-top: 100px;">
            <div id="left" style="width: 80px;height: inherit;float: left; /*border: solid green 1px;*/">

            </div>
            <div id="right" style="width: 80%;margin:0 auto;">
                <form method="post" action="/addScheme.action">
                    <div>
                        <span>方案名称：</span>
                        <input type="text" placeholder="输入文本" name="SchemeName" style="padding:4px;width:80%;margin-top: 20px">
                    </div>


                    <div style="margin-top:30px;">
                        <span style="float:left">方案描述：</span>
                        <textarea placeholder="输入文本" name="SchemeAfterContent" style="width:80%;height:100px;float:Left"></textarea>
                    </div>
                <div style="width:100%;margin-top: 150px;"><p style="text-align:center"><button type="submit" class="btn btn-primary">确认添加</button></p></div>
                </form>
            </div>
            <div><table class="table table-bordered" style="margin:40px;width: 90%">
                <tbody><tr ">
                <th style="width:25%;">方案名称</th>
                <th style="width:25%;">添加时间</th>
                <!-- <th style="width:25%;">权重</th> -->
                <th style="width:25%;">操作</th>
                </tr>

                <tr>
                    <td>采用竞争的策略</td>
                    <td>20180417</td>
                    <!-- <td style="border-left:1px solid gray;">0.15</td> -->
                    <td><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
                </tr>
                <tr style="border-top:1px solid gray">
                    <td>以防御为主的南海战略</td>
                    <td >20180417</td>
                    <!-- <td style="border-left:1px solid gray;">0.15</td> -->
                    <td ><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
                </tr>

                <tr style="border-top:1px solid gray">
                    <td >岛上加强军事基地建设</td>
                    <td >20180417</td>
                    <!-- <td style="border-left:1px solid gray;">0.3</td> -->
                    <td><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
                </tr>

                <!-- <tr style="border-top:1px solid gray">
                     <td style="border-left:1px solid gray;">政治影响</td>
                     <td style="border-left:1px solid gray;">20180417</td>
                     <!-- <td style="border-left:1px solid gray;">0.2</td> -->
                <!-- <td style="border-left:1px solid gray;"><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
            </tr>

         <tr style="border-top:1px solid gray">
                <td style="border-left:1px solid gray;">获胜概率</td>
                <td style="border-left:1px solid gray;">20180417</td>
                <!-- <td style="border-left:1px solid gray;">0.2</td> -->
                <!-- <td style="border-left:1px solid gray;"><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
            </tr> -->
                </tbody></table></div>
        </div>























    </div>

    </div>








</section>
<div class="modal fade" id="fak" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="display: none;">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <!--<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span><tton>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>-->
            <div class="modal-body">
                <div>

                    <!-- Nav tabs -->
                    <div style="font-size: 18px;margin-left: 42%;"><span>提出新方案</span></div>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="home">
                            <div style="margin: 2.5%;">
                                <div>方案名称：<input id="planName" type="text" style="width:80%; "></div>
                                <div style="position: fixed;margin-top: 2.5%;">方案内容：</div>
                                <span><textarea id="ner" style="resize: none;width: 80%;height: 250px;margin-left: 18%;margin-top: 3%;"></textarea></span>
                            </div>
                        </div>


                        <div><button type="button" class="btn btn-primary" style="float:right;margin-top:-10px;margin-bottom:10px;">添加资料</button></div>
                        <table cellpadding="1" cellspace="1" style="width:100%;border:1px solid rgb(169, 169, 169);">
                            <tbody><tr style="background-color:#2c87f7;color:white;">
                                <th style="width:30px;">&nbsp;&nbsp;&nbsp;</th>
                                <th style="width:100px;border-left:1px solid rgb(169, 169, 169);">资料名称</th>
                                <th style="width:50px;border-left:1px solid rgb(169, 169, 169);">创建时间</th>
                                <th style="width:50px;border-left:1px solid rgb(169, 169, 169);">操作</th>
                            </tr>
                            <tr style="border-top:1px solid rgb(169, 169, 169);">
                                <td>1</td>
                                <td style="border-left:1px solid rgb(169, 169, 169);">南海地图</td>
                                <td style="border-left:1px solid rgb(169, 169, 169);">20180417</td>
                                <td style="border-left:1px solid rgb(169, 169, 169);"><a href="http://localhost:8082/expertShowDiscussProcess###">查看</a>&nbsp;&nbsp;<a href="http://localhost:8888/expertShowDiscussProcess###">删除</a></td>
                            </tr>

                            <tr style="border-top:1px solid rgb(169, 169, 169);">
                                <td>2</td>
                                <td style="border-left:1px solid rgb(169, 169, 169);">关于南海问题的报道</td>
                                <td style="border-left:1px solid rgb(169, 169, 169);">20180417</td>
                                <td style="border-left:1px solid rgb(169, 169, 169);"><a href="http://localhost:8082/expertShowDiscussProcess###">查看</a>&nbsp;&nbsp;<a href="http://localhost:8888/expertShowDiscussProcess###">删除</a></td>
                            </tr>



                            </tbody></table>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" onclick="publishedPlan()" class="btn btn-primary" style="background-color: #C3D7E8;color: black">提交</button>
                <button type="button" id="closeNewScheme" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="schemedetail" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>

            </div>
            <div class="modal-body">
                <div class="media" style="">
                    <div class="media-left">
                        <img class="media-object" src="image/1.jpg" alt="甘升稳" style="width:100px;height:115px">

                    </div>
                    <div class="media-body  ">
                        <h4 class="media-heading" style="margin-bottom: 22px;margin-top: 20px;">甘升稳</h4>
                        <p style="float: left ;font-size: 10px">评论时间：<input id="schemetime" disabled=""></p>
                        <p style="float: left;font-size: 10px">响应强度：<input id="speakmatcheddegree" disabled=""></p>
                        <p style="float: left;font-size: 10px">评论内容：<input id="speakcontent" disabled=""></p>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="responseinput" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>

            </div>
            <div class="modal-body">
                <div class="media" style="">
                    <div class="media-left">
                        <img class="media-object" src="image/1.jpg" alt="甘升稳" style="width:100px;height:115px">

                    </div>
                    <div class="media-body  ">
                        <h4 class="media-heading" style="margin-bottom: 22px;margin-top: 20px;">回复<span id="tospeak"></span></h4>

                        <div style="float: left;font-size: 10px">响应强度：<div class="slider slider-horizontal" id="ex1Slider"><div class="slider-track"><div class="slider-track-low" style="left: 0px; width: 0%;"></div><div class="slider-selection" style="left: 0%; width: 50%;"></div><div class="slider-track-high" style="right: 0px; width: 50%;"></div></div><div class="tooltip tooltip-main top" role="presentation" style="left: 50%;"><div class="tooltip-arrow"></div><div class="tooltip-inner">0</div></div><div class="tooltip tooltip-min top" role="presentation"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div><div class="tooltip tooltip-max top" role="presentation"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div><div class="slider-handle min-slider-handle round" role="slider" aria-valuemin="-10" aria-valuemax="10" aria-valuenow="0" tabindex="0" style="left: 50%;"></div><div class="slider-handle max-slider-handle round hide" role="slider" aria-valuemin="-10" aria-valuemax="10" aria-valuenow="-10" tabindex="0" style="left: 0%;"></div></div><div class="slider slider-horizontal" id="ex1Slider"><div class="slider-track"><div class="slider-track-low" style="left: 0px; width: 0%;"></div><div class="slider-selection" style="left: 0%; width: 50%;"></div><div class="slider-track-high" style="right: 0px; width: 50%;"></div></div><div class="tooltip tooltip-main top" role="presentation" style="left: 50%;"><div class="tooltip-arrow"></div><div class="tooltip-inner">0</div></div><div class="tooltip tooltip-min top" role="presentation"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div><div class="tooltip tooltip-max top" role="presentation"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div><div class="slider-handle min-slider-handle round" role="slider" aria-valuemin="-10" aria-valuemax="10" aria-valuenow="0" tabindex="0" style="left: 50%;"></div><div class="slider-handle max-slider-handle round hide" role="slider" aria-valuemin="-10" aria-valuemax="10" aria-valuenow="-10" tabindex="0" style="left: 0%;"></div></div><input id="smdresponse" data-slider-id="ex1Slider" type="text" data-slider-min="-10" data-slider-max="10" data-slider-step="1" data-slider-value="0" data-value="0" value="0" style="display: none;">
                            <span id="smdresponseAdd">&nbsp;&nbsp;强度：<span id="smdresponseAValAdd">0</span></span>
                        </div>

                        <div style="float: left;font-size: 10px">评论内容：<textarea id="scresponse" rows="8" cols="35"></textarea></div>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" id="newNodeClose">关闭</button>
                <button type="button" class="btn btn-primary" id="newnode">保存</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="fak1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <!--<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span><tton>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>-->
            <div class="modal-body">
                <div>

                    <!-- Na
                    v tabs -->
                    <div style="font-size: 18px;margin-left: 42%;"><span>查看方案详情</span></div>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active">

                            <form class="form-horizontal">
                                <div class="form-group">
                                    <label for="planName1" class="col-sm-3 control-label">方案名称：</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="planName1" disabled="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ner1" class="col-sm-3 control-label">方案内容：</label>
                                    <div class="col-sm-9">
                                        <textarea class="form-control" id="ner1" disabled=""></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="ner4" class="col-sm-3 control-label">提出时间：</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="ner4" disabled="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ner3" class="col-sm-3 control-label">共识值：</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="ner3" disabled="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ner2" class="col-sm-3 control-label">评论数：</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="ner2" disabled="">
                                    </div>
                                </div>




                            </form>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" style="background-color: #C3D7E8;color: black">提交</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>


<script>
    $("#meetingId").val(meetingId) ;
</script>

</body>
</html>