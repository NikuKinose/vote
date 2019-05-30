/**
 *服务端ip地址
 */
var _ip = 'localhost:8888';

//重绘函数（研讨室管理员和专家通用）
function redrawn() {
    /*重绘*/
    var meeting = {};
    meeting.meetingId = meetingId;
    $.ajax({
        type : "POST",
        url : "/selectAllSchemeAndSpeak",
        data : JSON.stringify(meeting),
        contentType: "application/json",
        dataType : "json",
        success:function (data) {
            console.log(data);
            $("#tree").empty();
            $("#tree").append(
                "<button onclick='gotext()'>减支</button>"
            );
            $.each(data.data, function (i, item) {//遍历有多少课树
                // sel(item, 0);
                drawnMindTree(item);
            })

        }
    });
    /*/重绘*/
}

/**
 *获取上一个界面传的参数
 */
function GetArgs(params,paramName){
    var argsIndex = params.indexOf("?");
    var arg = params.substring(argsIndex+1);
    args = arg.split("&");
    var valArg = "";
    for(var i =0;i<args.length;i++){
        str = args[i];
        var arg = str.split("=");

        if(arg.length<=1) continue;
        if(arg[0] == paramName){
            valArg = arg[1];
        }
    }
    return valArg;
}


    /**
     * 详情的收起和展示
     * @param ct
     * @param btn
     */
    function textLimit(ct,btn) {
        var initFontNum=34;
        var initTextHeight=17;
        var allText=$(ct).text();
        var allHeight=$(ct).height();
        if(allText.length>=initFontNum&&allHeight>initTextHeight)
        {
            var m=$(ct).substring('0',initFontNum);
            $(ct).text(m);
            $(ct).html($(ct).html()+'.....');
            $(ct).css({ "height":initTextHeight+"px",})
            $(btn).click(function () {
                var curText=$(ct).text();
                if(curText==18){
                    $(ct).css({
                        "height":allHeight+'px',
                        "transition":'0.5s',
                    });
                    $(btn).text('收起');
                    $(ct).text(allText);
                }
                else{
                    $(ct).css({
                        height:initTextHeight+"px",
                        "transition":"0.6s",
                    })
                    $(btn).text("展开");
                    setTimeout(function () {
                        $(ct).text($(ct).text().substring(0,initFontNum));
                        $(ct).html($(ct).html()+'......');

                    },500)
                }
                return false;
            })

        }
        else{
            $(btn).hide();
            $(ct).css({
                "opacity":"1",
            })
        }
    }


    /**
     * 将后台时间转换为前台的时间展示
     * @param str
     * @returns {string}
     */
    function getMyDate(str){
        var oDate = new Date(str),
            oYear = oDate.getFullYear(),
            oMonth = oDate.getMonth()+1,
            oDay = oDate.getDate(),
            oHour = oDate.getHours(),
            oMin = oDate.getMinutes(),
            oSen = oDate.getSeconds(),
            oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay) +' '+ getzf(oHour) +':'+ getzf(oMin) +':'+getzf(oSen);//最后拼接时间
        return oTime;
    };
    //补0操作
    function getzf(num){
        if(parseInt(num) < 10){
            num = '0'+num;
        }
        return num;
    }

    /*
         *
         * 获取项目路径
         *
         * */

    function getRootContext(){
        var strPath = window.document.location.pathname;
        return strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
    }
    var urlRootContext = getRootContext();


    /**
     * 协商研讨中，返回研讨室管理员和专家首页
     */
    function backToHomePage(url){
        //创建form
        var turnForm = document.createElement("form");
        //一定要加入到body中！！
        document.body.appendChild(turnForm);
        turnForm.method = 'post';
        turnForm.action = '/'+url;
        turnForm.submit();
    }

    /**
     * 研讨室管理员和专家首页的退出按钮
     */
    function out() {

        //创建form
        var turnForm = document.createElement("form");
        //一定要加入到body中！！
        document.body.appendChild(turnForm);
        turnForm.method = 'post';
        turnForm.action = '/exit.action';
        turnForm.submit();
        /*$.ajax({
            type : "POST",
            url : urlRootContext+"/exit.action",
            // contentType: "application/json",
            // dataType : "json",
            success:function (data) {
                window.location.href = "../WEB-INF/index.jsp";
            }

        })*/
    }

