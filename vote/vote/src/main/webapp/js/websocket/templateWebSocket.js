//全局变量
var _linkId;
var _linkNext;
var _id;
//判断当前阶段是链式结构的第几个结点(0开始)
var _currentLink = 0;
var _nextId = 0;
//定义不能单独删除或者重置的阶段linkId
var prohibition = [4, 6, 7];
//定义不能单独插入的阶段linkId
var prohibitInsert = [3, 5, 6];

//过程控制时公有界面跳转
function goCurrentJSP(RealLink) {
    switch (RealLink) {
        case 1:
            // 未开始
            // window.open('/','pp');
            break;
        case 2:
            // 已结束
            // window.open('/','pp');
            break;
        case 3:
            //自由协商研讨界面，对应link表id=3
            window.open('/showDiscussProcess', 'pp');
            break;
        case 4:
            //完善研讨方案界面，对应link表id=4
            window.open('/perfectingScheme', 'pp');
            break;
        case 5:
            //准备会议纪要界面，对应link表id=5
            window.open('/meetingSummary', 'pp');
            break;
        case 6:
            //协同编辑界面，对应link表id=6
            window.open('/coedting', '_self');
            break;
        case 7:
            //生成研讨报告界面，对应link表id=7
            window.open('/', 'pp');
            break;
        case 8:
            //文本研讨界面，对应link表id=8
            window.open('/', 'pp');
            break;
        case 9:
            //设置准则界面，对应link表id=9
            window.open('/', 'pp');
            break;
        case 10:
            //决策研讨界面，对应link表id=10
            window.open('/', 'pp');
            break;
        case 11:
            //选择投票方案界面，对应link表id=11
            window.open('/selectVotingScheme', 'pp');
            break;
        case 12:
            //设置投票规则界面，对应link表id=12
            window.open('/', 'pp');
            break;
        case 13:
            //专家投票界面，对应link表id=13
            window.open('/', 'pp');
            break;
        default:
            alert("发生未知错误，请重新登录系统！")
    }
}

if (window.WebSocket) {

    //发言websocket（chatWebsocket）
    var templateWebsocket = new WebSocket('ws://' + _ip + '/templateWebsocket');


    //删除该阶段
    function deleteLink() {
        if (!prohibition.indexOf(_linkId)) {
            alert("该阶段不能单独删除！")
        } else {
            var boolean = confirm("确认删除该阶段？");
            if (boolean === true) {
                var meetingLink = {};
                meetingLink.id = _id;
                $.ajax({
                    type: "POST",
                    url: "/deleteLink",
                    contentType: "application/json",
                    data: JSON.stringify(meetingLink),
                    dataType: "json",
                    success: function (data) {
                        //v1.0 直接刷新动态模板
                        templateWebsocket.send(meetingId);
                    }
                })
            }
        }

    }

    //插入新阶段
    function insertLink() {
        if (!prohibitInsert.indexOf(_linkId)) {
            alert("该阶段不能进行插入！")
        } else {
            var meetingLink = {};
            meetingLink.id = _id;
            meetingLink.meetingIdFk = meetingId;
            meetingLink.linkNext = _linkNext;
            meetingLink.linkIdFk = $("input[name='linkType']:checked").val();

            var a = $("input[name='linkTimeRadio']:checked").val();
            var b = "0";
            if (a === "xxx") {
                b = $("#timeIpt").val();
            } else {
                b = a;
            }
            meetingLink.linkTime = b;

            $.ajax({
                type: "POST",
                url: "/insertLink",
                contentType: "application/json",
                data: JSON.stringify(meetingLink),
                dataType: "json",
                success: function (data) {
                    //v1.0 直接刷新动态模板
                    $("#addnew").modal("toggle");
                    templateWebsocket.send(meetingId);
                }
            })
        }
    }

    //重置该阶段
    function updateLink() {
        if (!prohibition.indexOf(_linkId)) {
            alert("该阶段不能单独重置！")
        } else {
            var meetingLink = {};
            meetingLink.id = _id;
            meetingLink.meetingIdFk = meetingId;
            meetingLink.linkNext = _linkNext;
            meetingLink.linkIdFk = $("input[name='linkType_update']:checked").val();

            var a = $("input[name='linkTimeRadio_update']:checked").val();
            var b = "0";
            if (a === "xxx") {
                b = $("#timeIpt_update").val();
            } else {
                b = a;
            }
            meetingLink.linkTime = b;

            $.ajax({
                type: "POST",
                url: "/updateLink",
                contentType: "application/json",
                data: JSON.stringify(meetingLink),
                dataType: "json",
                success: function (data) {
                    //v1.0 直接刷新动态模板
                    $("#reset").modal("toggle");
                    templateWebsocket.send(meetingId);
                }
            })
        }

    }

    //保存过程链
    var linkList = new Array();

    //传入一个链式的list，返回链式的当前节点
    function findList(list, number, type) {
        if (type === true) {
            $.each(list, function (i, item) {
                if (item.linkIdFk === number) {
                    linkList.push(item);
                    findList(list, item.linkNext, false);
                }
            })
        } else {
            $.each(list, function (i, item) {
                if (item.id === number) {
                    linkList.push(item);
                    findList(list, item.linkNext, false);
                }
            })
        }
    }

    //单击事件-过程控制
    function processControll(test1) {
        if (_nextId !== 0 && test1 === _nextId) {
            var boolean = confirm("确认进入下一阶段？");
            //test1是中间表的id
            if (boolean === true) {
                var meeting = {};
                meeting.meetingId = meetingId;
                meeting.meetingCurrentLink = test1;

                $.ajax({
                    type: "POST",
                    url: "/processLink",
                    contentType: "application/json",
                    data: JSON.stringify(meeting),
                    dataType: "json",
                    success: function (data) {
                        //v1.0 直接刷新动态模板
                        templateWebsocket.send(meetingId);
                    }
                })
            }
        }
    }


    //动态模板
    function template() {
        //给currentLink重新赋值currentLink
        var meeting = {};
        meeting.meetingId = meetingId;
        $.ajax({
            type: "POST",
            url: "/currentLink",
            contentType: "application/json",
            data: JSON.stringify(meeting),
            dataType: "json",
            success: function (data) {
                //currentLink是指中间表的id
                currentLink = data.data;
                //正式开始动态加载
                //清空模板区，初始化linklist
                $("#row").html("");
                linkList = [];
                //载入流程模板
                var meeting = {};
                meeting.meetingId = meetingId;
                $.ajax({
                    type: "POST",
                    url: "/allMeetingLink",
                    contentType: "application/json",
                    data: JSON.stringify(meeting),
                    dataType: "json",
                    success: function (data) {
                        //动态加载流程模板
                        var start = 1;
                        var next = 999;

                        //找出链式结构
                        findList(data.data, 1, true);

                        for (var i = 0; i < linkList.length; i++) {
                            if (currentLink === linkList[i].id) {
                                _currentLink = i;
                            }
                        }

                        //分配模板区域
                        var num = 100 / (linkList.length-1);



                        //打印第一个阶段
                        if (linkList.length != 0) {
                            $("#row").append(
                                "<div style=\"width:" + num + "% ; display: inline-block\">\n" +
                                "                     <!--设置研讨时间按钮-->\n" +
                                "                     <div onclick='processControll(" + linkList[1].id + ")'  class=\"rect rightMenu\"id=\"rect" + linkList[1].id + "\">\n" +
                                "                         <h5 style=\"font-family: 'Adobe Garamond Pro Bold';color: white;padding-top:13px;text-align: center\">\n" +
                                "                             " + linkList[1].linkName + "\n" +
                                "                         </h5>\n" +
                                "                     </div>\n" +
                                "                     <div class=\"recta\"id=\"recta" + linkList[1].id + "\">\n" +
                                "                     </div>\n" +
                                "                     <div style=\"margin-left: 10px;margin-top: -29px\">\n" +
                                "                     </div>\n" +
                                "                 </div>"
                            );
                            //添加鼠标右键事件
                            $("#rect" + linkList[1].id).mousedown(function (e) {
                                rightMouse(e, linkList[1].id, linkList[1].linkIdFk, linkList[1].linkNext);
                            });

                            //为点击事件做准备
                            if (1 === _currentLink + 1) {
                                _nextId = linkList[1].id;
                            }
                        }
                        //打印剩下的阶段
                        for (var i = 2; i < linkList.length; i++) {
                            $("#row").append(
                                "<div style=\"width:" + num + "% ; display: inline-block\">\n" +
                                "                     <div onclick='processControll(" + linkList[i].id + ")' class=\"rect rightMenu\"style=\"background: darkgrey\"id=\"rect" + linkList[i].id + "\">\n" +
                                "                         <h5 style=\"font-family: 'Adobe Garamond Pro Bold'; color:white;padding-top:13px;text-align: center\">\n" +
                                "                             " + linkList[i].linkName + "\n" +
                                "                         </h5>\n" +
                                "                     </div>\n" +
                                "                     <div class=\"recta\" id=\"recta" + linkList[i].id + "\">\n" +
                                "                     </div>\n" +
                                "                     <div style=\"margin-left: 10px;margin-top: -29px\">\n" +
                                "                     </div>\n" +
                                "                 </div>"
                            );

                            //添加鼠标右键事件
                            var nowid = linkList[i].id;
                            var nowidFk = linkList[i].linkIdFk;
                            var nownext = linkList[i].linkNext;
                            $("#rect" + nowid).bind("mousedown", {
                                test1: nowid,
                                test2: nowidFk,
                                test3: nownext
                            }, function (event) {
                                rightMouse(event, event.data.test1, event.data.test2, event.data.test3);
                            });

                            //为点击事件做准备
                            if (i === _currentLink + 1) {
                                _nextId = nowid;
                            }

                        }

                        //点亮正在进行的阶段
                        $("#rect" + currentLink).css("background", "#4978c5");
                        $("#recta" + currentLink).css("border-left", "12px solid #4978c5");

//**************************** 右键菜单 ****************************//

                        //右键事件
                        function rightMouse(e, id, linkId, next) {
                            //全局变量赋值
                            _id = id;
                            _linkId = linkId;
                            _linkNext = next;

                            if (e.which == 3) {
                                //定义菜单格式
                                var textMenuData = [
                                    [
                                        {
                                            text: "插入新阶段",
                                            func: function () {
                                                $("#addnew").modal("toggle");
                                            }

                                        },
                                        {
                                            text: "删除该阶段",
                                            func: function () {
                                                deleteLink();
                                                $("#").modal("toggle");
                                            }
                                        },
                                        {
                                            text: "重置该阶段",
                                            func: function () {
                                                $("#reset").modal("toggle");
                                            }

                                        }]
                                ];

                                var option = {
                                    name: "",
                                    offsetX: 2,
                                    offsetY: 2,
                                    textLimit: 10
                                    /* beforeShow: $.noop,
                                     afterShow: $.noop*/
                                };

                                $(".rightMenu").smartMenu(textMenuData, option);
                            }
                        }


                        var $tabMenu = $('.tab-l .tab-nav li');
                        //获取顶部菜单对应的三部分要显示的内容，其中第一个显示，第二三个隐藏
                        var $tabContent = $(".tab-l .content-wrap .content-item");

                        $tabMenu.click(function () {

                            $(this).addClass('active').siblings().removeClass('active');
                            //获取当前点击的菜单项的序号，第一个对应0，第二个对应1，
                            var tabIndex = $(this).index();
                            //$tabContent.eq(tabIndex)为获取对应要显示的内容，然后将其同胞元素（有五个，所以只获取role='tabpanel'的同胞元素）隐藏
                            $tabContent.eq(tabIndex).addClass('current').siblings().removeClass('current');

                        });

//**************************** /右键菜单 ****************************//

//**************************** template()尾部：跳转到当前界面 ****************************//
                        //1、根据currentLink找到对应的到底是什么阶段
                        var RealLink = 0;
                        for (var i = 0; i < linkList.length; i++) {
                            if (currentLink === linkList[i].id) {
                                RealLink = linkList[i].linkIdFk;
                                break;
                            }
                        }
                        goCurrentJSP(RealLink);


                    }


                });


            }
        });


    }


    templateWebsocket.onopen = function (event) {
        // alert("发送通知websocket成功连接")
        // templateWebsocket.send(meetingId);
        template();
    };


    templateWebsocket.onclose = function (event) {
        // alert("发言websocket连接关闭")
    };

    templateWebsocket.onerror = function (event) {
        // alert("发言websocket连接出错")
    };

    templateWebsocket.onmessage = function (event) {
        if (event.data == meetingId) {
            template();
        }
    };


}