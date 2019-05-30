function enterMeeting(id) {
    var meeting = {};
    meeting.meetingId = id;

    $.ajax({
        type:"POST",
        url:"/enterMeeting",
        data:JSON.stringify(meeting),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data);
            window.parent.location.href = "/discussHomePage";
        }
    })
}

function createReport(meetingId){
    $("#createReportDiv").append(
        "<form id='createReportForm' action=\"/api/MeetingReport/Report\" method=\"post\" hidden>\n" +
        "    <input type=\"text\" name=\"meetingId\" id=\"meetingId\" value='"+meetingId+"' hidden>\n" +
        "    <input type=\"submit\" value=\"生成研讨报告\">\n" +
        "</form>"
    )
    $("#createReportForm").submit();
    $("#createReportDiv").html("");

}

$(function () {


    var data={};
    data.meetingType = "isEnded";
    $.ajax({
        type:"POST",
        url:"/selectMeetingByStatus",
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)
            if(data.statusCode==200)
            {
                $("#meetingDiv").html("");
                $.each(data.data, function (i, item) {
                    $("#meetingDiv").append(
                        "<div class='row'>" +
                        "<div  class='initContent col-xs-12'><img src=\"image/jj.jpg\" style=\"height: 20%;float: left\">"+
                        "<div style=\"margin:20px;width: 20%;\"> <p>研讨室名称：" + item.meetingName + "</p>" +
                        "<p class='labcontent'>"+"研讨室简介："+item.meetingAbstract+"<a  class='detail' >"+"详情"+"</a>"+"</p> </div>" +
                        "<div style=\"margin:10px 0;\"> <p>"+"研讨室ID:"+item.meetingId +"</p>"+
                        "<p>"+"研讨课题："+item.question.questionName+"</p>" +
                        "<p>"+"研讨时间："+getMyDate(item.startTime)+"~"+getMyDate(item.startTime)+"</p>" +
                        "<p>"+"研讨地点："+item.meetingPlace+"</p></div>"+
                        "<button class='enterBtn' onclick='createReport("+item.meetingId +")'>生成研讨报告</button>"+
                        "</div></div>"
                    )
                });

            }

        }
    });


    $("#selectEndedMeeting").click(function () {

        if ($("#ed_lab").val() != null){
            var selectType;
            var key = $("#ed_lab").val();
            var meetingType;

            //判断查询条件类型
            if ($("#selectend_selectType").val() == "meetingName"){
                selectType = "byMeetingName";
                var key = $("#ed_lab").val();
            }else if ($("#selectend_selectType").val() == "questionName"){
                selectType = "byQuestionName";
                var key = $("#ed_lab").val();
            }else if ($("#selectend_selectType").val() == "meetingId"){
                selectType = "byMeetingId";
                var key = $("#ed_lab").val();
            }else if ($("#selectend_selectType").val() == "creatorId"){
                selectType = "byCreatorId";
                var key = $("#ed_lab").val();
            }


            var data = {};
            data.selectType = selectType;
            data.meetingType = "isEnded";
            data.key = key;
            data.place = $("#selectend_place").val();
            data.startTimeLow = $("#selectend_startTimeLow").val();
            data.startTimeHigh = $("#selectend_startTimeHigh").val();
            data.endTimeLow = $("#selectend_endTimeLow").val();
            data.endTimeHigh = $("#selectend_endTimeHigh").val();
            console.log(data);

            $.ajax({
                type : "POST",
                url : "/selectMeetingByCondition",
                data : JSON.stringify(data),
                contentType: "application/json",
                dataType : "json",
                success:function (data) {
                    console.log(data);
                    if(data.statusCode == 200){
                        $("#meetingDiv").html("");
                        $.each(data.data, function (i, item) {
                            $("#meetingDiv").append(
                                "<div class='row'>" +
                                "<div  class='initContent col-xs-12'><img src=\"image/jj.jpg\" style=\"height: 20%;float: left\">"+
                                "<div style=\"margin:20px\"> <p>研讨室名称：" + item.meetingName + "</p>" +
                                "<p class='labcontent'>"+"研讨室简介："+item.meetingAbstract+"<a  class='detail' >"+"详情"+"</a>"+"</p> </div>" +
                                "<div style=\"margin:10px 0;\"> <p>"+"研讨室ID:"+item.meetingId +"</p>"+
                                "<p>"+"研讨课题："+item.question.questionName+"</p>" +
                                "<p>"+"研讨时间："+getMyDate(item.startTime)+"~"+getMyDate(item.startTime)+"</p>" +
                                "<p>"+"研讨地点："+item.meetingPlace+"</p></div>"+
                                "<button class='enterBtn' onclick='createReport("+item.meetingId +")'>生成研讨报告</button>"+
                                "</div></div>"
                            )
                        });
                    }

                }

            })
        }
    });

});




