<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/9/8
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test</title>
    <!--引入style.css文件-->


    <link rel="stylesheet" href="../../css/menuContent.css" media="screen" type="text/css">
    <link href="stylesheet" href="../../css/bootstrap.min.css">

    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;
        var currentLink = 2;
    </script>
    <script src="./download/jquery.min.js.下载"></script>
    <script src="./download/common.js.下载"></script>
    <script type="text/javascript">
        var meetingId = 1;
        var userId = 7;
        $(".nav__menu-item").click(function(){
            var url = $(this).data("href");
            $('iframe#content',parent.document.body).attr("src",url);
        });


    </script>
    <script>
        $(function () {
            $(".nav-menu-item").click(function () {
                $(this).addClass("active").siblings().removeClass("active");
            })

            $("#julei").click(function () {
                $("#speakConsistencyDegreeInput").val(meetingId);
                $("#speakConsistencyDegree").submit();
            });
        })
    </script>


</head>
<body>
<div  style="height: auto" class="tab-r" >

    <ul class="tab-nav">

        <li class="nav-menu-item active"><a href="javascript:; " >方案列表</a></li>
        <li class="nav-menu-item"><a id="julei" href="javascript:; ">准则列表</a></li>



        <li class="nav-menu-item"><a href="javascript:; " >资料列表</a></li>
        <li class="nav-menu-item"><a href="javascript:; " >专家列表</a></li>

    </ul>

</div>

<form id="speakConsistencyDegree" action="http://localhost:8082/julei" method="post" target="nn" hidden="">
    <input type="text" name="id" id="speakConsistencyDegreeInput">
</form>




</body></html>
