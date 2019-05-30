/**
 * Created by yinziwei on 2017/9/23.
 */
$(function () {
    /**
     *
     * 领域列表的刷新
     *
     */
    $.ajax({
        type : "POST",
        url : "/selectAllField",
        contentType: "application/json",
        dataType : "json",
        success:function (data) {
            $("#fieldType").append(
                " <option value=''>所有领域</option>"
            );
            $.each(data.data, function (i, item) {//遍历有多少课树
                $("#fieldType").append(
                    " <option value='" + item.fieldName + "'>" + item.fieldName + "</option>"
                )
            })

        }
    });


    /*
     *
     * 课题树查询
     *
     * */
    $("#QuestionSon2farther").click(function () {
        var data = {};
        data.questionName = $("#projectName").val();
        data.fieldName = $("#fieldType").val();
        $.ajax({
            type : "POST",
            url : "/Son2farther",
            data : JSON.stringify(data),
            contentType: "application/json",
            dataType : "json",
            success:function (data) {
                console.log(data);
                $("#tree").empty();
                $.each(data.data, function (i, item) {//遍历有多少课树
                    drawnTree(item);
                })
            }
        })
        // $("#clickMeetingNode").show();
    });


    /*
     * 说明：第一步界面的确认按钮。选中课题之后，点击确定按钮触发的函数
     * 实现功能：当创建研讨室时，当该课题被选中，并且发送id到后台后。
     * 发送：questionId
     * 处理流程：1、获取隐藏的input框（id为choosedQuestion）的值，发送给后台
     *          2、后台接收，查询数据库，该课题是否已经选过。若是，则false；若否，则存入数据库，并返回确认信息给前台。
     *          3、前台收到确认后，则发送websocket消息给其他所有人，并跳转进入创建研讨室第二步界面form.jsp
     *          4、其他用户收到websocket消息后，将界面上的课题按钮变灰，不能点击。
     *
     */
    $("#clickMeetingNode").click(function () {
        var question = {};
        // var a = $("#choosedQuestion").val();
        question.questionId = $("#choosedQuestion").val();
        console.log(question);
        $.ajax({
            type : "POST",
            url : "/clickMeetingNode",
            data : JSON.stringify(question),
            contentType : "application/json",
            dataType : "json",
            success : function (data) {
                console.log(data);
                if (data.message === "NO"){
                    alert("该课题已经被研讨，请选择其他课题！")
                } else {
                    alert("已成功创建研讨室！")
                    window.open('/form','pp');
                }
                // el表达式获取session中的createMeetingQuestionName
            // alert(${sessionScope.get('createMeetingQuestionName')});
            }
        })
    });

});