

//根据speakId查找发言者的相关信息
function selectUser(speakId,speakSchemeId) {
    var name = "无数据";
    var speak = {};
    if (speakId == 0){
        speak.schemeId = speakSchemeId;
        $.ajax({
            async: false, //async设置为 false，则所有的请求均为同步请求
            type: 'POST',
            url: "/selectSchemer",
            data: JSON.stringify(speak),
            contentType: "application/json",
            dataType: "json",
            success:  function (thisdata) {
                console.log(thisdata.data);
                name = thisdata.data.userName;
            }
        });
    }else {
        speak.speakId = speakId;
        $.ajax({
            async: false, //async设置为 false，则所有的请求均为同步请求
            type: 'POST',
            url: "/selectSpeaker",
            data: JSON.stringify(speak),
            contentType: "application/json",
            dataType: "json",
            success:  function (thisdata) {
                console.log(thisdata.data);
                name = thisdata.data.userName;
            }
        });
    }

    return name;
}




function readMore(Id,type){
    if (type == 1){
        $("#schemeMore"+Id).removeClass("test");
        $("#schemeMoreA"+Id).toggle();
        $("#schemeHiddenA"+Id).toggle();
    }else {
        $("#readMore"+Id).removeClass("test");
        $("#readMoreA"+Id).toggle();
        $("#readHiddenA"+Id).toggle();
    }


}

function readHidden(Id,type){
    if (type == 1){
        $("#schemeMore"+Id).addClass("test");
        $("#schemeMoreA"+Id).toggle();
        $("#schemeHiddenA"+Id).toggle();
    }else {
        $("#readMore"+Id).addClass("test");
        $("#readMoreA"+Id).toggle();
        $("#readHiddenA"+Id).toggle();
    }
}


/*获取系统时间*/
var d=new Date();
var time=getMyDate(d);
//用来显示评论内容
function sel(Node, number, comment, fatherName, schemeId, speakFatherId) {
    //记录第几次递归调用
    number=number+1;
    //每一级发言前面的空格
    //style="margin-left: 70px;"
    var space = -40;
    for (var num = 0;num<number;num++){
        space = space + 40;
    }

    //评论数
    var commentNumber = 0;
    if (Node.children != null){
        commentNumber = Node.children.length;
    }

    var addhtml = "<div style=\"margin-left: "+space+"px;\">\n" +
        "                        <div style=\"float: left;\"><img src=\"image/expertPicture/"+Node.user_field.userId+".jpg\" width=\"55px\" height=\"55px\" /></div>\n" +
        "                        <br />\n" +
        "                        <div style=\"float: left;color:#2c87f7;text-align: center;\">&nbsp;"+Node.user_field.userName+"&nbsp;回复&nbsp;"+fatherName+":</div>\n" +
        "\n" +
        "                        <div>" +
        "                        <div class='test' id='readMore"+Node.speakId+"'>&nbsp;&nbsp;"+ Node.speakContent +"\n" +
        "                        </div>  " +
        "                       <div><a id='readMoreA"+Node.speakId+"' onclick=\"readMore("+Node.speakId+",2)\">更多</a><a id='readHiddenA"+Node.speakId+"' hidden onclick=\"readHidden("+Node.speakId+",2)\">收起</a></div>" +
        "\n" +
        "                            <div align=\"right\">\n" +
        "                                " +
        "                             <span style='font-size: 5px'color='#5e5e5e'>提出时间："+time+"</span>&nbsp;&nbsp;" +
        "                          <span style='font-size: 5px'color='#5e5e5e'>共识值："+Node.speakMatchedDegree+"</span>&nbsp;&nbsp;" +
        "                             <span id='commentNumber"+Node.speakId+"' style='font-size: 5px'color='#5e5e5e'>评论数："+commentNumber+"</span>&nbsp;&nbsp;" +
        "                                <button class=' bt-unfold'id='speakSwitch"+Node.speakId+"' onclick=\"unfold(comment"+Node.speakId+",speakSwitch"+Node.speakId+")\">展开</button>\n" +
        "                                <button class=\" unfoldReply\" name='replyButton' onclick='reply(this)'>回复</button>\n" +
        "                            </div>\n" +
        "                        </div>\n" +
        "\n" +
        "                        <div class=\"user-reply\">\n" +
        //这里是程度滑动条
        "                        <input id=\"sliderbtnAdd"+Node.speakId+"\" type=\"text\" data-slider-min=\"-10\" data-slider-max=\"10\" data-slider-step=\"1\" data-slider-value=\"0\"/>" +
        "                        <span id=\"currentSliderValLabelAdd"+Node.speakId+"\">&nbsp;&nbsp;强度：<span id=\"sliderValAdd"+Node.speakId+"\">0</span></span>"+

        "                            <div class=\"reply-in\">\n" +
        "                                <input class='reply-input' type=\"text\" value=\"\" name=\"\" placeholder=\"请输入评论内容\" />\n" +
        "                            </div>\n" +
        "                            <div class=\"reply-buttons\">\n" +
        "                                <button type=\"button\" class=\"btn btn-primary btn-comment btn-sm\" onclick='comment(this, "+schemeId+", "+Node.speakId+",getspeakMatchedDegreeAdd("+Node.speakId+"))'>评论</button>\n" +
        "                                <button type=\"button\" class=\"btn btn-default btn-cancel btn-sm\" onclick='cancel(this)'>取消</button>\n" +
        "                            </div>\n" +
        "                        </div>\n" +
        "\n" +
        "            </div>\n" +
        "\n" +
        "                    <hr style=\"height:1px;border:none;border-top:1px dashed #2c87f7;\" />" +
        "                     <div class='schemeComment' id='comment"+Node.speakId+"' ></div>";


    $("#"+comment).append(addhtml);

    $("#sliderbtnAdd"+Node.speakId).slider();
    $("#sliderbtnAdd"+Node.speakId).on("slide", function(slideEvt) {
        $("#sliderValAdd"+Node.speakId).text(slideEvt.value);
    });

    if(Node.children != null){
        for (var i = 0; i < Node.children.length; i++){
            sel(Node.children[i], number, "comment"+Node.speakId, Node.user_field.userName, schemeId, Node.speakId);
        }
    }

}

/**
 * 获取发言数据时的强度
 * @param schemeId
 * @returns {jQuery}
 */
function getspeakMatchedDegree(schemeId){
    return $("#sliderVal"+schemeId).text();
}

function getspeakMatchedDegreeAdd(schemeId){
    return $("#sliderValAdd"+schemeId).text();
}

//载入聊天数据
function loadChatData() {
    var meeting = {};
    meeting.meetingId = meetingId;

    $.ajax({
        type: 'POST',
        url: "/selectAllSchemeAndSpeak",
        data : JSON.stringify(meeting),
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            //在这里数据展示
            console.log(data);
            $("#whole1").html("");
            $.each(data.data, function (i, item) {
                //评论数
                var SchemeCommentNumber = 0;
                if (item.children != null){
                    SchemeCommentNumber = item.children.length;
                }

                //用来显示方案
                $("#whole1").append(

                    "\n" +
                    "        <div id=\"left\" style=\"width: 80px;height: inherit;float: left; /*border: solid green 1px;*/\">\n" +
                    "            <img src=\"image/expertPicture/"+item.user_field.userId+".jpg\" style='width: 60px;height: 60px;border-radius: 5%' />\n" +

                    "        </div>\n" +
                    "        <div id=\"right\" style=\"/*border: solid red 1px;*/height: inherit;width: 88%;margin-left: 80px;padding-bottom: 51px;\">\n" +
                    "            <div id=\"scheme\" style=\"border: solid #2c87f7 1.5px;border-radius: 5px;width: 100%;height: auto;padding: 12px\">\n" +
                    "\n" +
                    "                <div id=\"expertName\" style=\"color:#2c87f7;margin: 3px\">\n" +
                    "                    "+item.user_field.userName+"\n" +
                    "                </div>\n" +
                    "                <div  id=\"schemeContent\">\n" +
                    "                <div id='schemeMore"+item.schemeId+"' class='test'>" +
                    "                    &nbsp;&nbsp;"+item.schemeBeforeContent+"\n" +
                    "                </div>" +
                    "                </div>\n" +
                    "                <div><a id='schemeMoreA"+item.schemeId+"' onclick=\"readMore("+item.schemeId+",1)\">更多</a><a id='schemeHiddenA"+item.schemeId+"' hidden onclick=\"readHidden("+item.schemeId+",1)\">收起</a></div>" +

                    "\n" +

                    "                <div id=\"unfold\" align=\"right\">\n" +
                    "                  <span style='font-size: 5px'color='#5e5e5e'>提出时间："+time+"</span>&nbsp;&nbsp;" +
                    "                    <span id='SchemeCommentNumber"+item.schemeId+"' style='font-size: 5px'color='#5e5e5e'>评论数："+SchemeCommentNumber+"</span>&nbsp;&nbsp;" +
                    "                    <button class='bt-unfold'id='schemeSwitch"+item.schemeId+"' onclick=\"unfold(schemeComment"+item.schemeId+",schemeSwitch"+item.schemeId+")\">展开</button>\n" +
                    "                    <button onclick='reply(this)' name='replyButton' class=\"unfoldReply\">回复</button>" +
                    "                </div>\n" +
                    "                <div class=\"user-reply\">\n" +
                    //这里是程度滑动条
                    "                        <input id=\"sliderbtn"+item.schemeId+"\" type=\"text\" data-slider-min=\"-10\" data-slider-max=\"10\" data-slider-step=\"1\" data-slider-value=\"0\"/>" +
                    "                        <span id=\"currentSliderValLabel"+item.schemeId+"\">&nbsp;&nbsp;强度：<span id=\"sliderVal"+item.schemeId+"\">0</span></span>"+

                    "                    <div class=\"reply-in\">\n" +
                    "                        <input class='reply-input' type=\"text\" value=\"\" name=\"\" placeholder=\"请输入评论内容\" />\n" +
                    "                    </div>\n" +
                    "                    <div class=\"reply-buttons\">\n" +/* onload=\"slider("+item.schemeId+")\"*/
                    "                        <button type=\"button\" class=\"btn btn-primary btn-comment btn-sm\" onclick='comment(this, "+item.schemeId+", 0, getspeakMatchedDegree("+item.schemeId+"))'>评论</button>\n" +
                    "                        <button type=\"button\" class=\"btn btn-default btn-cancel btn-sm\" onclick='cancel(this)'>取消</button>\n" +
                    "                    </div>\n" +
                    "                </div>" +
                    "                <hr style=\"height:1px;background-color: #2c87f7;width: 100%\" />\n" +
                    "                <div class='schemeComment' id=\"schemeComment"+item.schemeId+"\">\n" +
                    "                </div>\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "        </div>"
                );
                //初始化滑动条
                $("#sliderbtn"+item.schemeId).slider();
                $("#sliderbtn"+item.schemeId).on("slide", function(slideEvt) {
                    $("#sliderVal"+item.schemeId).text(slideEvt.value);
                });

                if (item.children != null){
                    $.each(item.children, function (i1,item1) {
                        sel(item1, 0 , "schemeComment"+item.schemeId, item.user_field.userName, item.schemeId, 0);
                    });
                }
            });


        }
    });

}

// if (window.WebSocket) {
    //发言websocket（chatWebsocket）
    var chatWebsocket = new WebSocket('ws://'+_ip+'/chatWebsocket');

    chatWebsocket.onopen = function (event) {
        // alert("发言websocket成功连接");
        //连接成功时载入聊天数据
       loadChatData();
    };

    chatWebsocket.onclose = function (event) {
        // alert("发言websocket连接关闭")
    };

    chatWebsocket.onerror = function (event) {
        // alert("发言websocket连接出错")
    };

    chatWebsocket.onmessage = function (event) {
        var receiveData = JSON.parse(event.data);
        if (meetingId == receiveData.meetingId){ //是这个研讨室
            if (receiveData.type == "comment"){  //是评论
                if (receiveData.data.speakFatherId == 0){ //是对方案的评论
                    //这里是对方案的评论数+1
                    var _thecomment = $("#SchemeCommentNumber"+receiveData.data.speakSchemeId).text();
                    var n = _thecomment.indexOf("：");
                    var _num = _thecomment.substring(n+1, _thecomment.length);
                    _num = parseInt(_num)+1;
                    _thecomment = "评论数：" + _num;
                    $("#SchemeCommentNumber"+receiveData.data.speakSchemeId).text(_thecomment);
                    //直接打印语句
                    $("#schemeComment"+receiveData.data.speakSchemeId).append(receiveData.message);

                    $("#sliderbtnAdd"+receiveData.speakId).slider();
                    $("#sliderbtnAdd"+receiveData.speakId).on("slide", function(slideEvt) {
                        $("#sliderValAdd"+receiveData.speakId).text(slideEvt.value);
                    });

                }else {
                    //是对评论的评论
                    //这里是对父评论的评论数+1
                    var _thecomment = $("#commentNumber"+receiveData.data.speakFatherId).text();
                    var n = _thecomment.indexOf("：");
                    var _num = _thecomment.substring(n+1, _thecomment.length);
                    _num = parseInt(_num)+1;
                    _thecomment = "评论数：" + _num;
                    $("#commentNumber"+receiveData.data.speakFatherId).text(_thecomment);
                    //直接打印语句
                    $("#comment"+receiveData.data.speakFatherId).append(receiveData.message);//直接打印语句

                    $("#sliderbtnAdd"+receiveData.speakId).slider();
                    $("#sliderbtnAdd"+receiveData.speakId).on("slide", function(slideEvt) {
                        $("#sliderValAdd"+receiveData.speakId).text(slideEvt.value);
                    });
                }
            }else {//发表方案
                $("#whole1").append(receiveData.message);
                //初始化滑动条
                $("#sliderbtn"+receiveData.data.schemeId).slider();
                $("#sliderbtn"+receiveData.data.schemeId).on("slide", function(slideEvt) {
                    $("#sliderVal"+receiveData.data.schemeId).text(slideEvt.value);
                });
            };
            //重绘
            redrawn();
        }
    };


//以json的格式发送一条发言信息给后台，后台会转换为Speak类型数据
//chat逻辑处理流程：
//1、发言数据存入数据库
//2、转发给所有人查询指令
//因此，用户收到的只是查询指令，然后用ajax异步刷新发言界面
    function chat(schemeId, speakContent, speakFatherId, speakMatchedDegree) {

        //定义发言数据的json形式(时间靠后台获取)
        var chatMessage = {};
        chatMessage.speakSchemeId = schemeId;
        chatMessage.speakFatherId = speakFatherId;
        chatMessage.speakUserId = userId;
        chatMessage.speakMatchedDegree = speakMatchedDegree;
        chatMessage.speakContent = speakContent;

        //清空发言框
        $(".reply-input").val("").focus();

        //将发言数据传给后台
        $.ajax({
            type: 'POST',
            url: "/api/SpeakController/newSpeak",
            data: JSON.stringify(chatMessage),
            contentType: "application/json",
            dataType: "json",
            success: function (data) {
                var _data = data.data;
                console.log(_data);

                //获取margin-left长度
                var space = $("#comment"+_data.speakFatherId).prev().prev().css('marginLeft');
                if(space != undefined){
                    space = parseInt(space) + 20;
                }else {
                    space = 0;
                }
                //构造评论语句
                var addhtml = "<div style=\"margin-left: "+space+"px;\">\n" +
                    "                        <div style=\"float: left;\"><img src=\"image/expertPicture/"+_data.speakUserId+".jpg\" width=\"55px\" height=\"55px\" /></div>\n" +
                    "                        <br />\n" +
                    "                        <div style=\"float: left;color:#2c87f7;text-align: center;\">&nbsp;"+selectUser(_data.speakId,_data.speakSchemeId)+"&nbsp;回复&nbsp;"+selectUser(_data.speakFatherId,_data.speakSchemeId)+":</div>\n" +
                    "\n" +
                    "                        <div>" +
                    "                        <div class='test' id='readMore"+_data.speakId+"'>&nbsp;&nbsp;"+ _data.speakContent +"\n" +
                    "                        </div>  " +
                    "                       <div><a id='readMoreA"+_data.speakId+"' onclick=\"readMore("+_data.speakId+",2)\">更多</a><a id='readHiddenA"+_data.speakId+"' hidden onclick=\"readHidden("+_data.speakId+",2)\">收起</a></div>" +
                    "\n" +
                    "                            <div align=\"right\">\n" +
                    "                                " +
                    "                             <span style='font-size: 5px'color='#5e5e5e'>提出时间："+time+"</span>&nbsp;&nbsp;" +
                    "                          <span style='font-size: 5px'color='#5e5e5e'>共识值："+_data.speakMatchedDegree+"</span>&nbsp;&nbsp;" +
                    "                             <span id='commentNumber"+_data.speakId+"' style='font-size: 5px'color='#5e5e5e'>评论数："+0+"</span>&nbsp;&nbsp;" +
                    "                                <button class=' bt-unfold'id='speakSwitch"+_data.speakId+"' onclick=\"unfold(comment"+_data.speakId+",speakSwitch"+_data.speakId+")\">展开</button>\n" +
                    "                                <button class=\" unfoldReply\" name='replyButton' onclick='reply(this)'>回复</button>\n" +
                    "                            </div>\n" +
                    "                        </div>\n" +
                    "\n" +
                    "                        <div class=\"user-reply\">\n" +
                    //这里是程度滑动条
                    "                        <input id=\"sliderbtnAdd"+_data.speakId+"\" type=\"text\" data-slider-min=\"-10\" data-slider-max=\"10\" data-slider-step=\"1\" data-slider-value=\"0\"/>" +
                    "                        <span id=\"currentSliderValLabelAdd"+_data.speakId+"\">&nbsp;&nbsp;强度：<span id=\"sliderValAdd"+_data.speakId+"\">0</span></span>"+

                    "                            <div class=\"reply-in\">\n" +
                    "                                <input class='reply-input' type=\"text\" value=\"\" name=\"\" placeholder=\"请输入评论内容\" />\n" +
                    "                            </div>\n" +
                    "                            <div class=\"reply-buttons\">\n" +
                    "                                <button type=\"button\" class=\"btn btn-primary btn-comment btn-sm\" onclick='comment(this, "+_data.speakSchemeId+", "+_data.speakId+",getspeakMatchedDegreeAdd("+_data.speakId+"))'>评论</button>\n" +
                    "                                <button type=\"button\" class=\"btn btn-default btn-cancel btn-sm\" onclick='cancel(this)'>取消</button>\n" +
                    "                            </div>\n" +
                    "                        </div>\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "                    <hr style=\"height:1px;border:none;border-top:1px dashed #2c87f7;\" />" +
                    "                     <div class='schemeComment' id='comment"+_data.speakId+"'></div>";

                //结构化发言websocket
                var test = {};
                test.meetingId = meetingId;
                test.type = "comment";
                test.message = addhtml;
                test.data = chatMessage;
                test.speakId = _data.speakId;
                chatWebsocket.send(JSON.stringify(test));


                //时间序列发言websocket
                var addhtml2 = "<div style=\"color:#2c87f7;\">\n" +
                    "        " + selectUser(_data.speakId,_data.speakSchemeId)+ "\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                    getMyDate(_data.speakTime)+
                    "    </div>\n" +
                    "    <div id=\"schemeContent\">\n" +
                    "        &nbsp;&nbsp;&nbsp;&nbsp;"+_data.speakContent +"\n" +
                    "    </div>\n" +
                    "    <hr/>\n";

                test.message = addhtml2;
                privateReceiveWebsocket.send(JSON.stringify(test));
                /*//发送给所有人查询指令，前端数据展示的代码写在chatWebsocket的onmessage方法的ajax里面，不是这里
                chatWebsocket.send(meetingId);
                privateSpeakingLinesWebSocket.send(meetingId);
                privateRelativeSendWebSocket.send(meetingId);
                redrawn();*/
            }
        });


}