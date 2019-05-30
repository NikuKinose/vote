

//发言websocket（chatWebsocket）
var privateSchemeSendWebSocket = new WebSocket('ws://'+_ip+'/privateSchemeRefreshWebSocket');

privateSchemeSendWebSocket.onopen = function (event) {
    // alert("privateSchemeSendWebSocket  websocket成功连接")
};

privateSchemeSendWebSocket.onclose = function (event) {
    // alert("privateSchemeSendWebSocket  websocket连接关闭")
};

privateSchemeSendWebSocket.onerror = function (event) {
    // alert("privateSchemeSendWebSocket  websocket连接出错")
};

privateSchemeSendWebSocket.onmessage = function (event) {


};