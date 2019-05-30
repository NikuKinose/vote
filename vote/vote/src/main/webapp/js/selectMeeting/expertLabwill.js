
/**
 * Created by yinziwei on 2017/9/23.
 */
function enterMeeting(id) {
    var meeting = {};
    meeting.meetingId = id;

    $.ajax({
        type:"POST",
        url: "/enterMeeting",
        data:JSON.stringify(meeting),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data);
            window.parent.location.href = "/expertDiscussHomePage";
        }
    })
}



$(function () {

    //开始载入数据
    var data={};
    data.meetingType = "isUnstarted";
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
                $.each(data.data, function (i, item) {
                    $("#meetingDiv").append(
                        "<div class='row'>" +
                        "<div  class='initContent col-xs-12'><img src=\"image/jj.jpg\" style=\"height: 20%;padding-left: 0;float: left;\">"+
                        "<div style=\"margin:20px 60px;width: 20%;\"> <p>研讨室名称：" + item.meetingName + "</p>" +
                        "<p class='labcontent'>"+"研讨室简介："+item.meetingAbstract+"<a href='#' class='detail' >"+"详情"+"</a>"+"</p> </div>" +
                        "<div style=\"margin:10px 0;\"> <p>"+"研讨室ID:"+item.meetingId +"</p>"+
                        "<p>"+"研讨课题："+item.question.questionName+"</p>" +
                        "<p>"+"研讨预计时间："+getMyDate(item.predictStartTime)+"~"+getMyDate(item.predictEndTime)+"</p>" +
                        "<p>"+"研讨地点："+item.meetingPlace+"</p></div>" +
                        "<button class='enterBtn' onclick='enterMeeting("+item.meetingId +")'>进入研讨室</button>" +
                        "</div></div>"
                    )

                });

            }

        }
    })



    /*
     *
     * 首页查询未开始的研讨室
     *
     * */

    $("#selectUnstartedMeeting").click(function () {

        if ($("#will_lab").val() != null){
            var selectType;
            var key = $("#will_lab").val();
            var meetingType;

            //判断查询条件类型
            if ($("#selectType").val() == "meetingName"){
                selectType = "byMeetingName";
                key =  $("#will_lab").val();
            }else if ($("#selectType").val() == "questionName"){
                selectType = "byQuestionName";
                key =  $("#will_lab").val();
            }else if ($("#selectType").val() == "meetingId"){
                selectType = "byMeetingId";
                key =  $("#will_lab").val();
            }else if ($("#selectType").val() == "creatorId"){
                selectType = "byCreatorId";
                key =  $("#will_lab").val();
            }


            var data = {};
            data.selectType = selectType;
            data.meetingType = "isUnstarted";
            data.key = key;
            data.place = $("#place").val();
            data.startTimeLow = $("#startTimeLow").val();
            data.startTimeHigh = $("#startTimeHigh").val();
            data.endTimeLow = $("#endTimeLow").val();
            data.endTimeHigh = $("#endTimeHigh").val();
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
                                "<div  class='initContent col-xs-12'><img src=\"image/jj.jpg\" style=\"padding-top: 16px;padding-left: 20px;float: left\">"+
                                "<div style=\"margin:20px 60px;width: 20%;\"> <p>研讨室名称：" + item.meetingName + "</p>" +
                                "<p class='labcontent'>"+"研讨室简介："+item.meetingAbstract+"<a href='#' class='detail' >"+"详情"+"</a>"+"</p> </div>" +
                                "<div style=\"margin:10px 0;\"> <p>"+"研讨室ID:"+item.meetingId +"</p>"+
                                "<p>"+"研讨课题："+item.question.questionName+"</p>" +
                                "<p>"+"研讨预计时间："+getMyDate(item.predictStartTime)+"~"+getMyDate(item.predictEndTime)+"</p>" +
                                "<p>"+"研讨地点："+item.meetingPlace+"</p></div>" +
                                "<button class='enterBtn' onclick='enterMeeting("+item.meetingId +")'>进入研讨室</button></div></div>"

                            )
                        });
                    }

                }

            })
        }
    });
});
