<%--
  Created by IntelliJ IDEA.
  User: 40880
  Date: 2018/7/23
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>建立模式选择</h1>


<div class="votingPatter">
    <div id="one"style="margin-top: 10px">
        <span class="bob" style="margin-left: 30px;cursor: pointer">单选项非排序式</span>
        <span style="margin-left: 20px;cursor: pointer">多选项非排序式</span>
        <span style="margin-left: 20px;cursor: pointer">单选项排序式</span>
    </div>
    <br/>

<div id="two" style="width:700px">

    <div class="tab1" style="width:600px;display: block">
        <jsp:include page="content/patter1.jsp"></jsp:include>
    </div>
    <div class="tab2" style="display: none">
        <jsp:include page="content/patter2.jsp"></jsp:include>
    </div>
    <div class="tab3" style="display: none">
        <jsp:include page="content/patter3.jsp"></jsp:include>
    </div>

</div>
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
