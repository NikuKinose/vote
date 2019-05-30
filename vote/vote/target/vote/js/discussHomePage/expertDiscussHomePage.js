/*
//全局变量
var _linkId;
var _linkNext;
var _id;



//删除该阶段
function deleteLink() {
    var boolean = confirm("确认删除该阶段？");
    if (boolean === true){
        var meetingLink = {};
        meetingLink.id = _id;
        $.ajax({
            type : "POST",
            url : "/deleteLink",
            contentType: "application/json",
            data:JSON.stringify(meetingLink),
            dataType : "json",
            success:function (data) {
                //v1.0 直接刷新动态模板
                template();
            }
        })
    }
}

//插入新阶段
function insertLink() {
    var meetingLink = {};
    meetingLink.id = _id;
    meetingLink.meetingIdFk = meetingId;
    meetingLink.linkNext = _linkNext;
    meetingLink.linkIdFk = $("input[name='linkType']:checked").val();

    var a = $("input[name='linkTimeRadio']:checked").val();
    var b = "0";
    if (a === "xxx"){
        b = $("#timeIpt").val();
    }else {
        b = a;
    }
    meetingLink.linkTime = b;

    $.ajax({
        type : "POST",//提交方式
        url : "/insertLink",//action地址
        contentType: "application/json",//前台传给后台的格式json 不改
        data:JSON.stringify(meetingLink),//数据
        dataType : "json",
        success:function (data) {
            //v1.0 直接刷新动态模板
            $("#addnew").modal("toggle");
            template();
        }
    })

}

//重置该阶段
function updateLink() {
    var meetingLink = {};
    meetingLink.id = _id;
    meetingLink.meetingIdFk = meetingId;
    meetingLink.linkNext = _linkNext;
    meetingLink.linkIdFk = $("input[name='linkType_update']:checked").val();

    var a = $("input[name='linkTimeRadio_update']:checked").val();
    var b = "0";
    if (a === "xxx"){
        b = $("#timeIpt_update").val();
    }else {
        b = a;
    }
    meetingLink.linkTime = b;

    $.ajax({
        type : "POST",
        url : "/updateLink",
        contentType: "application/json",
        data:JSON.stringify(meetingLink),
        dataType : "json",
        success:function (data) {
            //v1.0 直接刷新动态模板
            $("#reset").modal("toggle");
            template();
        }
    })

}

//保存过程链
var linkList = new Array();
//传入一个链式的list，返回链式的当前节点
function findList(list, number ,type) {
    if (type === true){
        $.each(list,function (i, item) {
            if (item.linkIdFk === number){
                linkList.push(item);
                findList(list, item.linkNext, false);
            }
        })
    }else {
        $.each(list,function (i, item) {
            if (item.id === number){
                linkList.push(item);
                findList(list, item.linkNext, false);
            }
        })
    }
}

//动态模板
function template() {
    //清空模板区，初始化linklist
    $("#row").html("");
    linkList = [];
    //载入流程模板
    var meeting = {};
    meeting.meetingId = meetingId;
    $.ajax({
        type : "POST",
        url : "/allMeetingLink",
        contentType: "application/json",
        data:JSON.stringify(meeting),
        dataType : "json",
        success:function (data) {
            //动态加载流程模板
            var start = 1;
            var next = 999;

            //找出链式结构
            findList(data.data, 1, true);

            //打印第一个阶段
            if (linkList.length != 0){
                $("#row").append(
                    "<div class=\"col-md-offset-1 col-md-2 col-xs-4 \">\n" +
                    "                     <!--设置研讨时间按钮-->\n" +
                    "                     <div  class=\"rect rightMenu\"id=\"rect"+linkList[1].id+"\">\n" +
                    "                         <h5 style=\"font-family: 'Adobe Garamond Pro Bold';color: white;padding-top:13px;text-align: center\">\n" +
                    "                             "+linkList[1].linkName+"\n" +
                    "                         </h5>\n" +
                    "                     </div>\n" +
                    "                     <div class=\"recta\"id=\"recta"+linkList[1].id+"\">\n" +
                    "                     </div>\n" +
                    "                     <div style=\"margin-left: 10px;margin-top: -29px\">\n" +
                    "                     </div>\n" +
                    "                 </div>"
                )
                //添加鼠标右键事件
                $("#rect"+linkList[1].id).mousedown(function(e){
                    // rightMouse(e, linkList[1].id, linkList[1].linkIdFk, linkList[1].linkNext);
                })
            }
            //打印剩下的阶段
            for (var i=2; i<linkList.length; i++){
                $("#row").append(
                    "<div class=\"col-md-2 col-xs-4  \">\n" +
                    "                     <div class=\"rect rightMenu\"style=\"background: darkgrey\"id=\"rect"+linkList[i].id+"\">\n" +
                    "                         <h5 style=\"font-family: 'Adobe Garamond Pro Bold';color:white;padding-top:13px;text-align: center\">\n" +
                    "                             "+linkList[i].linkName+"\n" +
                    "                         </h5>\n" +
                    "                     </div>\n" +
                    "                     <div class=\"recta\" id=\"recta"+linkList[i].id+"\">\n" +
                    "                     </div>\n" +
                    "                     <div style=\"margin-left: 10px;margin-top: -29px\">\n" +
                    "                     </div>\n" +
                    "                 </div>"
                );

                //添加鼠标右键事件
                var nowid = linkList[i].id;
                var nowidFk = linkList[i].linkIdFk;
                var nownext = linkList[i].linkNext;
                $("#rect"+nowid).bind("mousedown", {test1:nowid, test2:nowidFk, test3:nownext}, function(event) {
                    // rightMouse(event,event.data.test1 , event.data.test2 , event.data.test3 );
                })
            }
            //点亮正在进行的阶段
            $("#rect"+currentLink).css("background", "rgb(44,135,247)");
            $("#recta"+currentLink).css("border-left", "12px solid rgb(44,135,247)");

//!**************************** 右键菜单 ****************************!//

            //右键事件
            function rightMouse(e,id,linkId,next){
                //全局变量赋值
                _id = id;
                _linkId = linkId;
                _linkNext = next;

                if (e.which == 3) {
                    //定义菜单格式
                    var  textMenuData = [
                        [
                            { text: "插入新阶段",
                                func: function() {
                                    $("#addnew").modal("toggle");
                                }

                            },
                            {
                                text: "删除该阶段",
                                func: function() {
                                    deleteLink();
                                    $("#").modal("toggle");
                                }
                            },
                            { text: "重置该阶段",
                                func: function() {
                                    $("#reset").modal("toggle");
                                }

                            }]
                    ];

                    var option = {
                        name: "",
                        offsetX: 2,
                        offsetY: 2,
                        textLimit: 10
                        /!* beforeShow: $.noop,
                         afterShow: $.noop*!/
                    };

                    $(".rightMenu").smartMenu(textMenuData,option);
                }
            }





            var $tabMenu=$('.tab-l .tab-nav li');
            //获取顶部菜单对应的三部分要显示的内容，其中第一个显示，第二三个隐藏
            var $tabContent=$(".tab-l .content-wrap .content-item");

            $tabMenu.click(function () {

                $(this).addClass('active').siblings().removeClass('active');
                //获取当前点击的菜单项的序号，第一个对应0，第二个对应1，
                var tabIndex=$(this).index();
                //$tabContent.eq(tabIndex)为获取对应要显示的内容，然后将其同胞元素（有五个，所以只获取role='tabpanel'的同胞元素）隐藏
                $tabContent.eq(tabIndex).addClass('current').siblings().removeClass('current');

            })

//!**************************** /右键菜单 ****************************!//

        }

    });
}

$(function () {
    //载入动态模板
    template();

});
*/
