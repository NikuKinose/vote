
var privateRelativeSendWebSocket = new WebSocket('ws://'+_ip+'/privateRelativeWebSocket');

privateRelativeSendWebSocket.onopen = function (event) {
    // alert("receivewebsocket成功连接");
};

privateRelativeSendWebSocket.onclose = function (event) {
    // alert("发言websocket连接关闭")
};

privateRelativeSendWebSocket.onerror = function (event) {
    // alert("发言websocket连接出错")
};

privateRelativeSendWebSocket.onmessage = function (event) {
    // alert("receive收到")
};
