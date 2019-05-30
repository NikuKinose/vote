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
    <title>专家协商研讨</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/others/modifyScheme.css" media="screen" type="text/css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-slider.css">
    <link rel="stylesheet" type="text/css" href="../css/smartMenu.css">

    <script type="text/javascript">
        <%--var meetingId = ${sessionScope.get('meetingId')};--%>
        <%--var userId = ${sessionScope.get('userId')};--%>
    </script>


    <style>
        ::-webkit-scrollbar-track {  -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.2);  border-radius: 10px;  background-color: #F5F5F5;  }
        ::-webkit-scrollbar {  width
        : 12px;  height: 12px;  background-color: #F5F5F5;  }
        ::-webkit-scrollbar-thumb {  border-radius: 10px;  -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);  background-color: #c1c1c1;  }
        ::-webkit-scrollbar-thumb:hover{  background-color: #555;  }
        .node circle {  cursor: pointer;  fill: #fff;  stroke: steelblue;  stroke-width: 2px;  }
        .node text {  font-size: 12px;  }
        /*a:link {color:white}*/
        a:hover,a:active {color:black}
        #tongzhi{position: fixed;top:7.4%;left: 0.5%; }
        #publishedPlan{position: fixed;top:7.4%;right: 5%;}
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
    <style id="__web-inspector-hide-shortcut-style__" type="text/css">
        .__web-inspector-hide-shortcut__, .__web-inspector-hide-shortcut__ *, .__web-inspector-hidebefore-shortcut__::before, .__web-inspector-hideafter-shortcut__::after
        {  visibility: hidden !important;  }
    </style>
</head>
<%--<h1>${meetingId}</h1>--%>
<%--<h1>${userId}</h1>--%>
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
            <span  aria-hidden="true"></span>  通知
        </button>
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
                <tbody><tr>
                    <th style="width:25%;">方案名称</th>
                    <th style="width:25%;">添加时间</th>
                    <!-- <th style="width:25%;">权重</th> -->
                    <th style="width:25%;">操作</th>
                </tr>

                <tr>
                    <td>采用竞争的策略</td>
                    <td>20180417</td>
                    <td><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
                </tr>
                <tr style="border-top:1px solid gray">
                    <td>以防御为主的南海战略</td>
                    <td >20180417</td>
                    <td ><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
                </tr>

                <tr style="border-top:1px solid gray">
                    <td >岛上加强军事基地建设</td>
                    <td >20180417</td>
                    <td><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">查看</a><a href="file:///D:/%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87/%E4%B8%93%E5%AE%B6%E5%8D%8F%E5%95%86%E7%A0%94%E8%AE%A8%E7%95%8C%E9%9D%A2_files/expertShowDiscussProcess.html###">删除</a></td>
                </tr>
                </tbody>
            </table>
            </div>
        </div>
    </div>
</section>
</body>