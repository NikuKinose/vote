//全局变量
var showPrefactingList = {};
showPrefactingList.data = [];


if (window.WebSocket) {

    var expertShowPrefactingWebSocket = new WebSocket('ws://'+_ip+'/showPrefactingWebSocket');

    //提交ok后一些按钮的变化
    function ok(id) {
        //显示打钩图标
        $("#prefactingOkImg"+id).toggle();
        //让对应的文本框不可编辑
        $("#PrefactingText"+id).attr("disabled",true);
        //提交按钮消失
        $("#submit"+id).toggle();
        //点击取消按钮使模态框消失
        $("#default"+id).click();
    }

//提交修改方案
function PrefactingSubmit(id){
    var theScheme = {};
    theScheme.schemeId = id;
    theScheme.schemeAfterContent = $("#PrefactingText"+id).val();

    $.ajax({
        type: 'POST',
        url: "/prefactingSubmit",
        data: JSON.stringify(theScheme),
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            console.log(data);
            ok(id);
            //发送websocket相关信息给管理员，让他的界面刷新
            var test = {};
            test.meetingId = meetingId;
            test.type = "modify";
            // test.message = addhtml;
            // test.data = chatMessage;
            expertShowPrefactingWebSocket.send(JSON.stringify(test));
        }

    })

}


//显示管理员允许显示的方案
function showPerfectingScheme() {
    var Faker = {};
    var index1=0,index2=1;
    Faker.meetingId = meetingId;
    $.ajax({
        type: "POST",
        url: "/api/showscheme/showscheme1",//记得写
        data: JSON.stringify(Faker),
        contentType: "application/json",   //规定前台往后台传值的类型
        dataType: "json",
        success: function (data) {
            console.log(data);
            $("#schemeList").html("");
            $("#mySchemeList").html("");

            if (data.statusCode==200){
                $.each(data.data.user_schemes,function (i, item) {

                    //判断是否完善方案
                    var content = item.schemeBeforeContent;
                    if ((item.schemeAfterContent !== null)&&(item.schemeAfterContent !== "")){
                        content = item.schemeAfterContent;
                    }

                    //打印能显示所有方案
                    if (showPrefactingList != null){
                        var b = showPrefactingList.data.indexOf(item.schemeId);
                        if (showPrefactingList && (b !== -1)){
                            $("#schemeList").append(
                                '<dt><img src="image/fileIcon/fangan.png"></dt>\n' +
                                '    <dd><a href="#user-information'+index1+'" data-toggle="modal">'+item.userName+'—'+item.schemeName+'</a><br>\n'
                                +getMyDate(item.schemeTime)+'</dd><hr>'+
                                '<div class="modal" id="user-information'+index1+'">\n' +
                                '            <div class="modal-dialog">\n' +
                                '                <div class="modal-content">\n' +
                                '                    <div class="modal-header">\n' +
                                '                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>\n' +
                                '                        <h4 class="modal-title">'+item.userName+'—'+item.schemeName+'</h4>\n' +
                                '                    </div>\n' +
                                '                    <div class="modal-body">\n' +
                                '                        <div>'+content+'</div>\n' +
                                '                    </div>\n' +
                                '                </div><!-- /.modal-content -->\n' +
                                '            </div><!-- /.modal-dialog -->\n' +
                                '        </div><!-- /.modal -->'
                            );
                        }
                    }

                    //打印我的方案
                    if (userId && (userId === item.userId)){
                        $("#mySchemeList").append(
                            '<dt><img src="image/fileIcon/fangan.png"></dt>\n' +
                            '    <dd><a href="#user-information'+index2+'" data-toggle="modal">'+item.userName+'—'+item.schemeName+'</a><br>\n'
                            +getMyDate(item.schemeTime)+
                            '<img hidden id=\'prefactingOkImg'+item.schemeId+'\' class="prefactingOk" src="image/prefacting/ok.png">' +
                            '</dd><hr>'+
                            '<div class="modal" id="user-information'+index2+'">\n' +
                            '            <div class="modal-dialog">\n' +
                            '                <div class="modal-content">\n' +
                            '                    <div class="modal-header">\n' +
                            '                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>\n' +
                            '                        <h4 class="modal-title">'+item.userName+'—'+item.schemeName+'</h4>\n' +
                            '                    </div>\n' +
                            '                    <div class="modal-body">' +
                            '                        <textarea id=\'PrefactingText'+item.schemeId+'\' class="form-control">'+content+'</textarea>\n' +
                            '                    </div>' +
                            '                   <div class="modal-footer">' +
                            '                       <button type="button" id=\'default'+item.schemeId+'\' class="btn btn-default" data-dismiss="modal">取消</button>\n' +
                            '                       <button type="button" id=\'submit'+item.schemeId+'\' class="btn btn-primary" onclick =\'PrefactingSubmit('+item.schemeId+')\'>保存修改</button>\n' +
                            '                    </div>' +
                            '                </div><!-- /.modal-content -->\n' +
                            '            </div><!-- /.modal-dialog -->\n' +
                            '        </div><!-- /.modal -->'
                        );
                    }

                    //对我的方案的状态进行判断
                    if ((item.schemeAfterContent !== null)&&(item.schemeAfterContent !== "")){
                        ok(item.schemeId);
                    }


                    index1+=2;
                    index2+=2;
                });

            }
        }
    })
}






    expertShowPrefactingWebSocket.onopen = function (event) {
        // alert("发送通知websocket成功连接")

        //去后台查东西
        var JsonData = {};
        JsonData.meetingId = meetingId;

        $.ajax({
            type: 'POST',
            url: "/showPrefacting",
            data: JSON.stringify(JsonData),
            contentType: "application/json",
            dataType: "json",
            success: function (data) {
                console.log(data);
                showPrefactingList = data.data;
                showPerfectingScheme();
            }
        })

    };

    expertShowPrefactingWebSocket.onclose = function (event) {
        // alert("发言websocket连接关闭")
    };

    expertShowPrefactingWebSocket.onerror = function (event) {
        // alert("发言websocket连接出错")
    };

    expertShowPrefactingWebSocket.onmessage = function (event) {
        /*$("#tongzhi").attr("data-content",event.data);*/
        var receiveData = JSON.parse(event.data);
        if (meetingId == receiveData.meetingId){
            if (receiveData.type == "show"){
                //去后台查东西
                var JsonData = {};
                JsonData.meetingId = meetingId;

                $.ajax({
                    type: 'POST',
                    url: "/showPrefacting",
                    data: JSON.stringify(JsonData),
                    contentType: "application/json",
                    dataType: "json",
                    success: function (data) {
                        console.log(data);
                        showPrefactingList = data.data;
                        showPerfectingScheme();
                        alert("研讨室管理员更新了方案显示！");

                    }
                })
            }

        }

    };




}