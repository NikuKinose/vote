$(function () {
    //定义菜单格式
    var  textMenuData = [
        [
            { text: "插入新阶段",
                func: function() {
                    $("#addnew").modal("toggle");
                }

            },
            {
                text: "删除该阶段",
                func: function() {
                    $("#").modal("toggle");
                }
            },
            { text: "重置该阶段",
                func: function() {
                    $("#reset").modal("toggle");
                }

            }]
    ];
    var option = {
        name: "",
        offsetX: 2,
        offsetY: 2,
        textLimit: 10
        /* beforeShow: $.noop,
         afterShow: $.noop*/
    };

    $(".rightMenu").smartMenu(textMenuData,option);



    var $tabMenu=$('.tab-l .tab-nav li');
    console.log($tabMenu)
    //获取顶部菜单对应的三部分要显示的内容，其中第一个显示，第二三个隐藏
    var $tabContent=$(".tab-l .content-wrap .content-item");

    $tabMenu.click(function () {

        $(this).addClass('active').siblings().removeClass('active');
        //获取当前点击的菜单项的序号，第一个对应0，第二个对应1，
        var tabIndex=$(this).index();
        //$tabContent.eq(tabIndex)为获取对应要显示的内容，然后将其同胞元素（有五个，所以只获取role='tabpanel'的同胞元素）隐藏
        $tabContent.eq(tabIndex).addClass('current').siblings().removeClass('current');

    })
})