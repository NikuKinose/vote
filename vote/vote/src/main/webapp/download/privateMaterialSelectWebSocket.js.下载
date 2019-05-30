function download(materialName) {

    $("#materialName").val(materialName);
    $("#download").submit();
    /*$.ajax({
        type:"POST",
        url:urlRootContext+"/download.action",
        data:JSON.stringify(materialName),
        contentType: "application/json",
        dataType: "json",
        success:function(data){
            console.log(data);
        }
    })*/
}
/*function download(materialName) {
    $.ajax({
        type:"POST",
        url:urlRootContext+"/download.action",
        data:JSON.stringify(materialName),
        contentType: "application/json",
        dataType: "json",
        success:function(data){
            console.log(data);
        }
    })
}*/
    //发言websocket（chatWebsocket）
    var privateMaterialSelectWebSocket = new WebSocket('ws://'+_ip+'/privateMaterialSelectWebSocket');

    privateMaterialSelectWebSocket.onopen = function (event) {
        // alert("privateMaterialSelectWebSocket  websocket成功连接")
    };

    privateMaterialSelectWebSocket.onclose = function (event) {
        // alert("privateMaterialSelectWebSocket  websocket连接关闭")
    };

    privateMaterialSelectWebSocket.onerror = function (event) {
        // alert("privateMaterialSelectWebSocket  websocket连接出错")
    };

    privateMaterialSelectWebSocket.onmessage = function (event) {
        // alert(1231)
        if (event.data == meetingId) {
            // alert(123);
            var Faker = {};
            Faker.meetingId = meetingId;
            $.ajax({
                type: 'POST',
                url:  urlRootContext+"api/refreshMaterial/refreshMaterial1",
                data: JSON.stringify(Faker),
                contentType: "application/json",
                dataType: "json",
                success: function (data) {
                    //在这里数据展示
                    console.log(data);
                    if(data.statusCode==200){
                        $("#materilList").html("<table class=\"table1\"\tborder=\"1px\" cellspacing=\"0px\"  width=\"100%\" height=\"200px\" id=\"materilList\">\n" +
                            "        <tr id=\"tr1\">\n" +
                            "            <th>文件名</th>\n" +
                            "            <th>类型</th>\n" +
                            "            <th>关键字</th>\n" +
                            "            <th>大小</th>\n" +
                            "            <th>创建时间</th>\n" +
                            "            <th>添加者</th>\n" +
                            "            <th>源</th>\n"+
                            "            <th>操作</th>\n" +
                            "        </tr>\n" +
                            "    </table>");
                        $.each(data.data,function (i, item) {
                            $.each(item.material_users,function (mu, mu1) {
                                $("#materilList").append(
                                    "<tr>"+
                                    "<th>"+mu1.materialName+"</th>"+
                                    "<th>"+mu1.materialType+"</th>"+
                                    "<th>"+mu1.materialLabel+"</th>"+
                                    "<th>"+mu1.materialSize+"</th>"+
                                    "<th>"+mu1.createTime+"</th>"+
                                    "<th>"+mu1.userName+"</th>"+
                                    "<th>"+mu1.materialSource+"</th>"+
                                    "<th>"+"<a>查看详情"+"</a>"+"<button onclick=\"download('"+mu1.materialName+"')\">下载"+"</button>"+
                                    "</tr>"
                                )
                            })
                        })
                    }
                }
        })
    }
    };
