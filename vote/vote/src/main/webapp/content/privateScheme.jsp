<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/9/8
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研讨室私有界面方案</title>
    <script src="../../download/jquery.min.js.下载"></script>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">

    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;
        var currentLink = 2;
    </script>
    <script src="./download/bootstrap.min.js.下载"></script>
    <script src="./download/common.js.下载"></script>
    <script src="./download/privateSchemeSendWebSocket.js.下载"></script>
    <script src="./download/privateSchemeRefreshWebSocket.js.下载"></script>
    <style type="text/css">

        dl {
            margin:10px;
        }

        dd,dt{
            display: inline-block;
            margin: 5px 0;
        }
        dd>a{
            font-weight:bold;
            font-size: 17px;
            color: #000;
        }
        dd>a:hover{
            text-decoration: none;
        }
        dt{
            width: 15%;
            text-align: center;
        }
        dd{
            width: 70%;
            letter-spacing: 1px;
            line-height: 27px;
        }

        dl img {
            width: 55px;
            height: 55px;
            vertical-align: -8px;

        }
        dl hr{
            margin: 10px;
        }
        ul.file {
            list-style: none;

        }
        .file li,.file li div{
            display: inline-block;
            margin: 5px
        }
        .file li {
            width: 120px;
            vertical-align: top;
        }
        .file li div:first-child{
            overflow: hidden;

            background: url("../image/文件列表.png");
            width: 100px;
            height: 110px;

        }
    </style>
    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;

        //刷新界面
        function refreshScheme() {
            var Faker = {};
            var index=0;
            Faker.meetingId = meetingId;
            console.log(Faker);
            $.ajax({
                type: "POST",
                url: "/api/showscheme/showscheme1",//记得写
                data: JSON.stringify(Faker),
                contentType: "application/json",   //规定前台往后台传值的类型
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    if (data.statusCode==200){
                        $("#schemeList").html("");
                        $.each(data.data.user_schemes,function (i, item) {
                            $("#schemeList").append(
                                '<dt><img src="image/fileIcon/fangan.png"></dt>\n' +
                                '    <dd><a href="#user-information'+index+'" data-toggle="modal">'+item.userName+'—'+item.schemeName+'</a><br>\n'
                                +getMyDate(item.schemeTime)+'</dd><hr>'+
                                '<div class="modal" id="user-information'+index+'">\n' +
                                '            <div class="modal-dialog">\n' +
                                '                <div class="modal-content">\n' +
                                '                    <div class="modal-header">\n' +
                                '                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>\n' +
                                '                        <h4 class="modal-title">'+item.userName+'—'+item.schemeName+'</h4>\n' +
                                '                    </div>\n' +
                                '                    <div class="modal-body">\n' +
                                '                        <div>'+item.schemeBeforeContent+'</div>\n' +
                                '                    </div>\n' +
                                '                </div><!-- /.modal-content -->\n' +
                                '            </div><!-- /.modal-dialog -->\n' +
                                '        </div><!-- /.modal -->'
                            )
                            index++;
                        })
                    }
                }
            })

        }

        $(function () {
            refreshScheme();
        })
    </script>
</head>
<body>
<div>
    <ul class="file">
        <li><div style="background-position: -15px -30px"></div><div style="text-align: center;width:110px">用户信息表</div></li>
        <li><div style="background-position: -155px -30px"></div><div>论电脑量刑的基本原理</div></li>
        <li><div style="background-position: -155px -30px"></div><div>论黑客及其刑事责任</div></li>
        <li><div style="background-position: -155px -30px"></div><div>软件研制成熟度模型</div></li>
        <li><div style="background-position: -11px -177px"></div><div>第13章 算法性能分析</div></li>
        <li><div style="background-position: -155px -177px"></div><div>研讨可视化工具的比较</div></li>
        <li><div style="background-position: -295px -177px"></div><div>BBC记者直击南海造岛</div></li>
        <li><div style="background-position: -435px -177px"></div><div>初期会议管理界面</div></li>
    </ul>



</body></html>