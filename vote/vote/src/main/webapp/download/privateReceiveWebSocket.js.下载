function loadLineData() {
    var Faker = {};
    Faker.meetingId = meetingId;
    $.ajax({
        type: 'POST',
        url:  "/privateSelectSpeaking",
        data: JSON.stringify(Faker),
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            //在这里数据展示
            console.log(data);
            $("#timeMessages").html("");
            $.each(data.data,function (i, item) {
                $("#timeMessages").append(
                    "<div id=\"expertName\" style=\"color:#2c87f7;\">\n" +
                    "        " + item.user_field.userName+ "\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                    getMyDate(item.speakTime)+
                    "    </div>\n" +
                    "    <div id=\"schemeContent\">\n" +
                    "        &nbsp;&nbsp;&nbsp;&nbsp;"+item.speakContent +"\n" +
                    "    </div>\n" +
                    "    <hr/>\n"

                )
            })
        }
    })

}


var privateReceiveWebsocket = new WebSocket('ws://'+_ip+'/privateSpeakingLinesWebSocket');

privateReceiveWebsocket.onopen = function (event) {
    // alert("receivewebsocket成功连接");
    loadLineData();
};

privateReceiveWebsocket.onclose = function (event) {
    // alert("发言websocket连接关闭")
};

privateReceiveWebsocket.onerror = function (event) {
    // alert("发言websocket连接出错")
};

privateReceiveWebsocket.onmessage = function (event) {
    // alert("receive收到")
    var receiveData = JSON.parse(event.data);
    if (meetingId == receiveData.meetingId) { //是这个研讨室
        $("#timeMessages").append(receiveData.message);
    }
};
