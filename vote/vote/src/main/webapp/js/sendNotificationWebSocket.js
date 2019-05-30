
if (window.WebSocket) {
    //发言websocket（chatWebsocket）
    var sendNotificationWebsocket = new WebSocket('ws://'+_ip+'/messageWebsocket');

    sendNotificationWebsocket.onopen = function (event) {
        // alert("发送通知websocket成功连接")
    };

    sendNotificationWebsocket.onclose = function (event) {
        // alert("发言websocket连接关闭")
    };

    sendNotificationWebsocket.onerror = function (event) {
        // alert("发言websocket连接出错")
    };

    sendNotificationWebsocket.onmessage = function (event) {
        if (event.data == meetingId){
            $("#tongzhi").attr("data-content",event.data);
        }
    };


    function sendNotification() {
        var Notification = $("#ner").val();
        sendNotificationWebsocket.send(Notification);
        $("#fak").hide();
    }

}