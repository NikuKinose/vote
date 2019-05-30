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



//发言websocket（chatWebsocket）
var privateSchemeRefreshWebSocket = new WebSocket('ws://'+_ip+'/privateSchemeRefreshWebSocket');

privateSchemeRefreshWebSocket.onopen = function (event) {
    // alert("privateSchemeRefreshWebSocket  websocket成功连接")
};

privateSchemeRefreshWebSocket.onclose = function (event) {
    // alert("privateSchemeRefreshWebSocket  websocket连接关闭")
};

privateSchemeRefreshWebSocket.onerror = function (event) {
    // alert("privateSchemeRefreshWebSocket  websocket连接出错")
};

privateSchemeRefreshWebSocket.onmessage = function (event) {

    var Faker = {};
    Faker.meetingId = meetingId;

    if (event.data == meetingId) {
        refreshScheme();
    }
};
