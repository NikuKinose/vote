

if (window.WebSocket) {

    var showPrefactingWebSocket = new WebSocket('ws://'+_ip+'/showPrefactingWebSocket');

    //显示所有方案信息
    function showPrefacting() {
        var meeting = {};
        meeting.meetingId = meetingId;
        $.ajax({
            type: 'POST',
            url: "/api/showscheme/showscheme1",
            data: JSON.stringify(meeting),
            contentType: "application/json",
            dataType: "json",
            success: function (data) {
                console.log(data);
                $("#allScheme").html("");
                $.each(data.data.user_schemes, function (i, item) {
                    var state = "未完善";
                    var addContent = item.schemeBeforeContent;
                    if ((item.schemeAfterContent !== null)&&(item.schemeAfterContent !== "")){
                        addContent = item.schemeAfterContent;
                        state = "已完善";
                    }


                    $("#allScheme").append(
                        "<tr>\n" +
                        "                        <td>"+item.schemeName+"</td>\n" +
                        "                        <td>"+item.userName+"</td>\n" +
                        "                        <td>"+state+"</td>\n" +
                        "                        <td>\n" +
                        "                            <button type=\"button\" class=\"btn btn-info btn-xs\" data-toggle=\"modal\" data-target=\"#myModal"+item.schemeId+"\">查看详情</button>\n" +
                        "                        </td>\n" +
                        "                        <td>" +
                        "                            <input type=\"checkbox\" name='box' class=\"box\" value='"+item.schemeId+"' />" +
                        "                       </td>\n" +
                        "                    </tr>"
                    )

                    $("#body").append(
                        //隐藏的模态框
                        "<div class=\"modal fade\" id=\"myModal"+item.schemeId+"\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n" +
                        "    <div class=\"modal-dialog\" role=\"document\">\n" +
                        "        <div class=\"modal-content\">\n" +
                        "            <div class=\"modal-header\">\n" +
                        "                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
                        "                <h4 class=\"modal-title\" id=\"myModalLabel\">Modal title</h4>\n" +
                        "            </div>\n" +
                        "            <div class=\"modal-body\">\n" +
                        "                "+addContent+"\n" +
                        "            </div>\n" +
                        "            <div class=\"modal-footer\">\n" +
                        "                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</div>"
                    )
                })


            }
        })

    }




    showPrefactingWebSocket.onopen = function (event) {
        // alert("发送通知websocket成功连接")
        showPrefacting();
    };

    showPrefactingWebSocket.onclose = function (event) {
        // alert("发言websocket连接关闭")
    };

    showPrefactingWebSocket.onerror = function (event) {
        // alert("发言websocket连接出错")
    };

    showPrefactingWebSocket.onmessage = function (event) {
        var receiveData = JSON.parse(event.data);
        if (meetingId == receiveData.meetingId){
            if (receiveData.type == "modify"){
                //刷新界面
                showPrefacting();
            }
        }
    };




}