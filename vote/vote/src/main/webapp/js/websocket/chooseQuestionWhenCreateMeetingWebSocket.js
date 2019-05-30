/*
 * 实现功能：当创建研讨室时，当该课题被选中，并且发送id到后台后，其他所有人界面上的该课题按钮变灰，不能选中。
 *
 * 发送：questionId（点击确定按钮后，传到后台）
 * 处理流程：1、点击确定按钮，questionId发送给后台
 *          2、后台接收，查询数据库，该课题是否已经选过。若是，则false；若否，则存入数据库，并返回确认信息给前台。
 *          3、前台收到确认后，则发送websocket消息给其他所有人，并跳转进入创建研讨室第二步界面form.jsp
 *          4、其他用户收到websocket消息后，将界面上的课题按钮变灰，不能点击。
 *
 */

// if (window.WebSocket) {
    var chooseQuestionWhenCreateMeetingWebSocket = new WebSocket('ws://'+_ip+'/chooseQuestionWhenCreateMeetingWebSocket');

chooseQuestionWhenCreateMeetingWebSocket.onopen = function (event) {
        alert("chooseQuestionWhenCreateMeetingWebSocket成功连接");
    };

chooseQuestionWhenCreateMeetingWebSocket.onclose = function (event) {
        // alert("发言websocket连接关闭")
    };

chooseQuestionWhenCreateMeetingWebSocket.onerror = function (event) {
        // alert("发言websocket连接出错")
    };

chooseQuestionWhenCreateMeetingWebSocket.onmessage = function (event) {
        var receiveData = JSON.parse(event.data);
        if (meetingId == receiveData.meetingId){ //是这个研讨室
            //按钮变灰

        }
}