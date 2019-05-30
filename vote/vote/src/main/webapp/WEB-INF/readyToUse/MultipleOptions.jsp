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
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-slider.css">
    <link rel="stylesheet" type="text/css" href="../css/smartMenu.css">

    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;
    </script>



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

    <style id="__web-inspector-hide-shortcut-style__" type="text/css">
        .__web-inspector-hide-shortcut__, .__web-inspector-hide-shortcut__ *, .__web-inspector-hidebefore-shortcut__::before, .__web-inspector-hideafter-shortcut__::after
        {
            visibility: hidden !important;
        }
    </style>
</head>
<body class="" style="padding-right: 12px;">
<!--导航栏部分-->
<section id="zw-product">
    <div class="container-fluid" style="padding: 0px;">
        <div class="whole">
            <!-- Nav tabs -->
            <ul class="tab-nav">
                <li class="active"><a href="javascript:;">多选项投票</a><span></span></li>
                <!-- <li><a href="javascript:;">添加资料</a><span></span></li> -->
            </ul>
            <hr>
        </div>
    </div>
    <!--文本模式  上面基本部分-->
    <div class="container" style="margin-top:80px;font-size:16px!important;">
        <table class="table" >
            <tr>
                <th>采取进攻的策略</th>
                <th><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 优秀
                </label></th>
                <th><label class="radio-inline" style="left: 30px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 合格
                </label></th>
                <th><label class="radio-inline" style="right: 10px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 基本合格
                </label></th>
                <th><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 不合格
                </label></th>
            </tr>

            <tr>
                <th>以防御为主的南海策略</th><th><label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 优秀
            </label></th>
                <th><label class="radio-inline" style="left: 30px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 合格
                </label></th>
                <th><label class="radio-inline" style="right: 10px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 基本合格
                </label></th>
                <th><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 不合格
                </label></th>
            </tr>

            <tr>
                <th>岛内多加强军事基地建设</th><th><label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 优秀
            </label></th>
                <th><label class="radio-inline" style="left: 30px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 合格
                </label></th>
                <th><label class="radio-inline" style="right: 10px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 基本合格
                </label></th>
                <th><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 不合格
                </label></th>
            </tr>
            <tr>
                <th>快速摧毁外国军事基地</th><th><label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 优秀
            </label></th>
                <th><label class="radio-inline" style="left: 30px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 合格
                </label></th>
                <th><label class="radio-inline" style="right: 10px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 基本合格
                </label></th>
                <th><label class="radio-inline">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 不合格
                </label></th>
            </tr>
            <tr>
                <th>是否一票否决：</th><th><label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 是
            </label></th>

                <th><label class="radio-inline" style="left: 30px">
                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 否
                </label></th>
                <th></th>
                <th></th>
            </tr>

            <tr>
                <th></th>
                <th></th>
                <th><label class="radio-inline">
                    <button class="btn btn-primary">确认提交</button>
                </label></th>
                <th></th>
                <th></th>
            </tr>
        </table>

        <div style="width:100%;box-shadow:0 3px 5px rgba(0,0,0,0.2);padding:15px;margin-top: 50px">
            <h4>投票说明：</h4>
            <ol>
                <li>每个方案有多个选项，对每个方案都要投票，在多个投票选项中任选一个进行投票。</li>
                <li>第一个选项最多只能投N个方案。</li>
                <li>方案选取原则：第一个选项得票最多且第四个选项得票为0的前n个方案当选。</li>
            </ol>
        </div>
    </div>
</section>
</body>
