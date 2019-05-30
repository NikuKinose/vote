<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/23
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<h1>建立模式选择</h1>--%>


<%--<div class="votingPatter">--%>
    <%--<div id="one"style="margin-top: 10px">--%>
        <%--<span class="bob" style="margin-left: 30px;cursor: pointer">单选项非排序式</span>--%>
        <%--<span style="margin-left: 20px;cursor: pointer">多选项非排序式</span>--%>
        <%--<span style="margin-left: 20px;cursor: pointer">单选项排序式</span>--%>
    <%--</div>--%>
    <%--<br/>--%>

<%--<div id="two" style="width:700px">--%>

    <%--<div class="tab1" style="width:600px;display: block">--%>
        <%--<jsp:include page="patter1.jsp"></jsp:include>--%>
    <%--</div>--%>
    <%--<div class="tab2" style="display: none">--%>
        <%--<jsp:include page="patter2.jsp"></jsp:include>--%>
    <%--</div>--%>
    <%--<div class="tab3" style="display: none">--%>
        <%--<jsp:include page="patter3.jsp"></jsp:include>--%>
    <%--</div>--%>

<%--</div>--%>
<%--<script>--%>
    <%--<!--按钮切换-->--%>
    <%--function $(id){--%>
        <%--return typeof id==='string'?document.getElementById(id):id;--%>
    <%--}--%>
    <%--window.onload=function () {--%>
        <%--var s=$('one').getElementsByTagName('span');--%>
        <%--var t=$('two').getElementsByTagName('div');--%>
        <%--for(var a=0;a<s.length;a++){--%>
            <%--s[a].id=a;--%>
            <%--s[a].onclick=function () {--%>
                <%--for(var b=0;b<s.length;b++){--%>
                    <%--s[b].className='';--%>
                    <%--t[b].style.display='none';--%>
                <%--}--%>
                <%--this.className='bob';--%>
                <%--t[this.id].style.display='block';--%>
            <%--}--%>
        <%--}--%>
    <%--}--%>

<%--</script>--%>


<%--</body>--%>
<%--</html>--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--声明文档兼容模式，表示使用IE浏览器的最新模式-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--设置视口的宽度(值为设备的理想宽度)，页面初始缩放值<理想宽度/可见宽度>-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-slider.css">
    <link rel="stylesheet" type="text/css" href="css/smartMenu.css">
    <%--<link rel="stylesheet" type="text/css" href="css/writing/patterSelect.css">--%>

    <script type="text/javascript">
        var votingId = ${sessionScope.get('votingId')};
    </script>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/jquery-smartMenu-min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap-slider.js"></script>

    <script src="js/common.js"></script>
    <script src="js/jquery.form.js"></script>

    <script src="js/sendNotificationWebSocket.js"></script>
    <script src="js/privateMasterialSelectWebSocket.js"></script>
    <script src="js/privateReceiveWebSocket.js"></script>
    <script src="js/privateSchemeSendWebSocket.js"></script>
    <script src="js/chatWebSocket.js"></script>
    <script src="js/privateRelativeSendWebSocket.js"></script>

    <script src="js/d3.v3.min.js"></script>
    <script src="js/drawnMindTree.js"></script>
    <style type="text/css">
        .one span{
            text-decoration: none;
            font-family: 宋体;
            text-align: center;
            font-size: 15px;
            line-height: 30px;
            color: #000;
            cursor: pointer;
            padding-bottom: 5px;
        }
        /*.container{*/
        /*margin-top: 0px;*/
        /*}*/

        .container ul .active
        {
            display: inline-block;
            padding: 5px;
            margin: 5px 10px;
            border-bottom: 3px solid  #4978c5;
        }
        .container ul li
        {
            display: inline-block;
            padding: 5px;
            margin: 5px 10px;
        }
        .container ul li a
        {
            text-decoration: none;
            font-family: 宋体;
            color: #000;
        }
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
        /*a:link {color:white}*/
        a:hover,a:active {color:black}

        .reply-in input {
            width: 100%;
            height: 30px;
            margin-top: 10px;
            margin-left: 10px;
        }

        .whole .tab-nav .active a{color: #000}

        /*共有界面样式*/
        .whole .tab-nav {height: 40px;margin-bottom: 0;padding: 0 20px;text-align: center}
        .whole .tab-nav li{margin:0 1%;display: inline-block;}
        .whole .tab-nav li a{font-size:22px;color: #999;height: 40px;line-height: 40px;display: block;text-decoration: none}
        .whole .tab-nav li a:hover{color: #000}
        .whole .tab-nav li span{visibility:hidden;display: block;width: 100%;height: 4px;background-color: #2c87f7;border-radius: 2px;transition: all .2s}
        .whole .tab-nav .active span{visibility: visible}
        .whole hr{margin-top: 5px;margin-bottom: 8px}

        .container-fluid{
            margin-top: 0%;
            margin-left: 0%;
            font-size: 25px;
        }
        .pts_1{
            margin-left: 93px;
        }
    </style>
</head>
<body style="padding-right: 12px">
<%--一级内嵌--%>
<section id="zw-product">
    <div class="container-fluid" style="padding: 0px;">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">建立模式选择</a><span></span></li>
                <!-- <li><a href="javascript:;">添加资料</a><span></span></li> -->
            </ul>
            <hr>
        </div>
    </div>


    <%--按钮设置--%>
    <script>
        $(function () {
            $(".nav-menu-item").click(function () {
                $(this).addClass("active").siblings().removeClass("active");
            })
        })
    </script>
    <%--二级嵌套--%>
    <div class="container" style="margin-top:0px; font-size:16px!important;">
        <%--<div style="white-space:nowrap;">--%>
        <div class="pts_1">
            <ul style="list-style: none;" >
                <li class="nav-menu-item active" >
                    <a href="#part1" data-toggle="tab">单选项非排序式</a>
                </li>
                <li class="nav-menu-item">
                    <a href="#part2" data-toggle="tab">多选项非排序式</a>
                </li>
                <li class="nav-menu-item">
                    <a href="#part3" data-toggle="tab">单选项排序式</a>
                </li>
            </ul>
        </div>
        <%--</div>--%>

        <div class="tab-content" style="margin-left:0px;">
            <div class="tab-pane active row" id="part1">
                <form name="SingleChoiceNoSort" method="post" action="/createVoting1.action">
                    <div style="border: solid 1px #2C87F7;border-radius: 15px 15px 15px 15px;margin-left: 0%;">
                        <br/>
                        <div class="patter1_1">

                            &nbsp;<span class="max_schema">选取方案个数：<input type="text" name="votingSchemeNumber"> </span> <br/>
                        </div>
                        <br/>

                        <div class="patter1_1">
                            &nbsp;<span class="max_schema">最多同意个数：<input type="text" name="optionSelectMax"> </span><br/>
                        </div>
                        <br/>

                        <%--方案选取原则--%>
                        <div class="patter1_2">
                            &nbsp;方案选取原则：&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" name="principle" value="1">简单多数原则&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" name="principle" value="2">过半数原则

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
            </div>
            <div class="tab-pane row" id="part2">
                <form name="MultipleChoiceNoSort" method="post" action="/createVoting2.action">
                    <%--选项名称按钮--%>
                    <div style="margin-top: 3%;margin-left: 10%;">
                        *选取方案个数:
                        <input type="text" name="votingSchemeNumber"><br/>
                    </div>

                    <div style="margin-left: 10%;margin-top: 2%">
                        *投票选项个数：
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
                            <input type="checkbox" name="principle" value="5">  选项1简单多数原则&nbsp;
                            <input type="checkbox" name="principle" value="6"> 选项1过半数原则&nbsp;
                            <input type="checkbox" name="principle" value="7"> 选项1简单多数且选项N一票否决原则
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
            </div>
            <div class="tab-pane row" id="part3">
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
            </div>
        </div>
    </div>
</section>





<script>
    <!--按钮切换-->
    function $(id){
        return typeof id==='string'?document.getElementById(id):id;
    }
    window.onload=function () {
        var s=$('one').getElementsByTagName('span');
        var t=$('two').getElementsByTagName('div');
        for(var a=0;a<s.length;a++){
            s[a].id=a;
            s[a].onclick=function () {
                for(var b=0;b<s.length;b++){
                    s[b].className='';
                    t[b].style.display='none';
                }
                this.className='bob';
                t[this.id].style.display='block';
            }
        }
    }
</script>


</body>
</html>

