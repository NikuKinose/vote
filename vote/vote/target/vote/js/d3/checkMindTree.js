$(function () {

    var meeting = {};
    meeting.meetingId = meetingId;

    $.ajax({
        type : "POST",
        url : "/selectAllSchemeAndSpeak",
        data : JSON.stringify(meeting),
        contentType: "application/json",
        dataType : "json",
        success:function (data) {
            console.log(data);
            $("#tree").empty();
            $.each(data.data, function (i, item) {//遍历有多少课树
                // sel(item, 0);
                drawnMindTree(item);
                redrawn();
            })

        }
    })


});