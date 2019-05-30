

$(function () {

    /**
     *
     * 领域列表的刷新
     *
     */
    $.ajax({
        type : "POST",
        url : "/api/FieldController/selectAllField",
        contentType: "application/json",
        dataType : "json",
        success:function (data) {
            $("#fieldList").append(
                " <option value=''>所有领域</option>"
            );
            $.each(data.data, function (i, item) {//遍历有多少课树
                $("#fieldList").append(
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
        data.questionName = $("#questionName").val();
        data.fieldName = $("#fieldList").val();
        $.ajax({
            type : "POST",
            url : "/api/QuestionTree/Son2farther",
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
    })
});