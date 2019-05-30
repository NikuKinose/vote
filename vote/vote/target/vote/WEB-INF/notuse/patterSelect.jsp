<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/11/5
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>专家协商研讨界面</title>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/expertDiscussHomePage.css" rel="stylesheet">
    <style type="text/css">
        ul li {
            display: inline-block;
            font-size: 15px;
        }
    </style>

    <script type="text/javascript">


    </script>
    <%--<%--%>
        <%--String patterExplain1 = "${patterExplain1}";--%>
        <%--out.println(patterExplain1);--%>
        <%--request.setAttribute("patterExplain1",patterExplain1);--%>
    <%--%>--%>

    <script src="../../download/common.js.下载"></script>
    <script src="../../download/jquery.min.js.下载"></script>
    <script type="text/javascript" src="../../download/jquery-smartMenu-min.js.下载"></script>
    <script src="../../download/bootstrap.min.js.下载"></script>
    <script src="../../download/discussPersonal.js.下载"></script>

    <script src="../../download/expertTemplateWebSocket.js.下载"></script>
    <script src="../../download/expertDiscussHomePage.js.下载"></script>


</head>
<body>
<!--首页-->
<header>
    <div class="container-fluid">

        <div class="row">
            <div class="col-md-6 col-sm-12">
                <img src="../../image/logo.png" style="width: 290px;margin-right:30px;margin-top:10px" >
                <ul style="list-style:none;display:inline-block">

                    <li>表决研讨环境 ></li>
                    <li>主持人 ></li>
                    <li>投票规则设置 ></li>
                    <li>非排序式投票</li>
                </ul>


            </div>
            <div class="col-md-6 col-sm-12 user">
                <div><img src="../../image/details.png"><a href="http://localhost:8888/expertDiscussHomePage#modal-information" data-toggle="modal">查看研讨室基本信息</a> |
                    <img src="../../image/professor.png">欢迎您，专家:董奕
                    <a id="out" class="userExit" onclick="backToHomePage(&#39;expertHomePage&#39;)">退出</a></div>
            </div>
        </div>
        <div class="modal" id="modal-information">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title">当前研讨室基本信息</h4>
                    </div>
                    <div class="modal-body">
                        <div class="argu-ifm"></div>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

        <!--  进度条-->

        <div class="row topNav">
            <div class="col-md-9 col-xs-12">
                <div class="row" id="row"><div class="col-md-offset-1 col-md-2 col-xs-4 ">
                    <!--设置研讨时间按钮-->
                    <div class="rect rightMenu" id="rect2" style="background: rgb(169, 169, 169);">
                        <h5 style="font-family: &#39;Adobe Garamond Pro Bold&#39;;color: white;padding-top:13px;text-align: center">添加备选方案</h5>
                    </div>
                    <div class="recta" id="recta2" style="border-left: 12px solid rgb(169, 169, 169);">
                    </div>
                    <div style="margin-left: 10px;margin-top: -29px">
                    </div>
                </div><div class="col-md-2 col-xs-4  ">
                    <div class="rect rightMenu" style="background: #2c87f7;" id="rect3">
                        <h5 style="font-family: &#39;Adobe Garamond Pro Bold&#39;;color:white;padding-top:13px;text-align: center">投票规则设置</h5>
                    </div>
                    <div class="recta" id="recta3" style="border-left:14px solid #2c87f7">
                    </div>
                    <div style="margin-left: 10px;margin-top: -29px">
                    </div>
                </div><div class="col-md-2 col-xs-4  ">
                    <div class="rect rightMenu" style="background: darkgrey" id="rect12">
                        <h5 style="font-family: &#39;Adobe Garamond Pro Bold&#39;;color:white;padding-top:13px;text-align: center">专家进行投票</h5>
                    </div>
                    <div class="recta" id="recta12">
                    </div>
                    <div style="margin-left: 10px;margin-top: -29px">
                    </div>
                </div><div class="col-md-2 col-xs-4  ">
                    <div class="rect rightMenu" style="background: darkgrey;width:200px" id="rect13">
                        <h5 style="font-family: &#39;Adobe Garamond Pro Bold&#39;;color:white;padding-top:13px;text-align: center">生成研讨报告并结束研讨</h5>
                    </div>
                    <div class="recta" id="recta13" style="margin-left:76px;">
                    </div>
                    <div style="margin-left: 10px;margin-top: -29px">
                    </div>
                </div><div class="col-md-2 col-xs-4  ">


                    <div style="margin-left: 10px;margin-top: -29px">
                    </div>
                </div><div class="col-md-2 col-xs-4  ">


                    <div style="margin-left: 10px;margin-top: -29px">
                    </div>
                </div></div>
            </div>
            <div class="col-md-3 col-xs-12">
                <div>
                    <span style="display: inline-block;width: 200px;margin: 5px 0">当前环节完成时间：15:30:15</span><button type="button" class="btn btn-default btn-xs" style="height: 20px;">调整</button>
                </div>
                <div>
                    <span style="display: inline-block;width: 200px">当前环节剩余时间：5:30:15</span><button type="button" class="btn btn-default btn-xs" style="height: 20px;">调整</button>
                </div>
            </div>
        </div>

    </div>
</header>
<!--公有界面和私有界面-->
<section>
    <div class="container-fluid" style="padding: 0">
        <!--左边的公有界面-->
        <div class="col-lg-6 col-xs-12" style="width:59%;">
            <!--16:9 aspect ratio-->
            <div class="public-page">
                <iframe class="embed-responsive-item ww" name="pp" src="../home/patterSelect.jsp" id="iframepage" style=""></iframe>
                <div class="to-right"><img src="../../image/more.png" title="点击展开或收起"></div>
            </div>
        </div>
        <!-- 右边的私有界面-->
        <div class="col-lg-6 col-xs-12" style="width:40%;">
            <div class="private-page">
                <iframe name="privateMenu" class="embed-responsive-item ww" src="../../content/privateMenu.jsp"></iframe>
                <iframe id="content" src="../../content/privateScheme.jsp" name="nn"></iframe>
                <div class="to-left"><img src="../../image/back.png" title="点击展开或收起"></div>
            </div>
        </div>

        <div class="col-md-1 col-xs-2 sideBar">
            <div class="wrap">
                <div class="item"><div><img src="../../image/AdhesiveTape.png"><span>SWOT<br>分析</span></div></div>
                <div class="item"><div><img src="../../image/Compasses.png"><span>情景<br>分析</span></div></div>
                <div class="item"><div><img src="../../image/FeatherPen.png"><span>AHP<br>法</span></div></div>
                <div class="item"><div><img src="../../image/Magnifier.png"><span>ANP<br>法</span></div></div>
                <div class="item"><div><img src="../../image/Notebook.png"><span>Topsis<br>法</span></div></div>
                <div class="item"><div><img src="../../image/Scissors.png"><span>博弈<br>分析</span></div></div>

            </div>
            <div class="content-wrap">
                <div class="navContent">
                    <div>SWOT分析</div>
                    <span class="glyphicon glyphicon-remove navClose"></span>
                    <div></div>
                </div>
                <div class="navContent">
                    <div>情景分析</div>
                    <span class="glyphicon glyphicon-remove navClose"></span>
                    <div></div>
                </div>
                <div class="navContent">
                    <div>AHP法</div>
                    <span class="glyphicon glyphicon-remove navClose"></span>
                    <div></div>
                </div>
                <div class="navContent">
                    <div>ANP法</div>
                    <span class="glyphicon glyphicon-remove navClose"></span>
                    <div></div>
                </div>
                <div class="navContent">
                    <div>Topsis法</div>
                    <span class="glyphicon glyphicon-remove navClose"></span>
                    <div></div>
                </div>
                <div class="navContent">
                    <div>博弈分析</div>
                    <span class="glyphicon glyphicon-remove navClose"></span>
                    <div></div>
                </div>

            </div>
        </div>
    </div>

</section>



</body></html>
