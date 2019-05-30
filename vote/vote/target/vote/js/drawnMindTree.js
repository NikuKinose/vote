
var data = new Array();
var count1 = 0;
var count2 = 0;
var imageMenuData = new Array();
data.data = new Array();
var responsedataFar;
var responsedataScheme;
function drawnMindTree(root) {
    var count = 0;
    console.log(root.schemeName);
    var width = 600;
    var height = 500;

//边界空白
    var padding = {left: 80, right: 400, top: 20, bottom: 20};

    var svg = d3.select("#tree")
        .append("svg")
        .attr("width", width + padding.left + padding.right)
        .attr("height", height + padding.top + padding.bottom)
        .append("g")
        .attr("transform", "translate(" + padding.left + "," + padding.top + ")");

//树状图布局
    var tree = d3.layout.tree()
        .size([height, width])
        .separation(function (a, b) {
            return (a.parent == b.parent ? 2 : 3);
        });//设置相隔节点的间距，a、b节点相隔

//对角线生成器
    var diagonal = d3.svg.diagonal()
        .projection(function (d) {
            return [d.y, d.x];
        });

    //给第一个节点添加初始坐标x0和x1
    root.x0 = width / 2;
    root.y0 = 0;

    //以第一个节点为起始节点，重绘
    redraw(root);


    //切换开关，d 为被点击的节点
    function toggle(d) {
        if (d.children) { //如果有子节点
            d._children = d.children; //将该子节点保存到 _children
            d.children = null;  //将子节点设置为null
        } else {  //如果没有子节点
            d.children = d._children; //从 _children 取回原来的子节点
            d._children = null; //将 _children 设置为 null
        }
    }

    //重绘函数
    function redraw(source) {

        /*
         （1） 计算节点和连线的位置
         */
        //应用布局，计算节点和连线
        var nodes = tree.nodes(root);
        var links = tree.links(nodes);

        //重新计算节点的y坐标
        nodes.forEach(function (d) {
            d.y = d.depth * 100;
        });

        /*
         （2） 节点的处理
         */
        //获取节点的update部分
        var index=0;
        var nodeUpdate = svg.selectAll(".node")
            .data(nodes, function (d) {
                data.data[count1]=this;
                if(index===this.length-1){
                    count1++;
                    index=0;
                }
                /*  console.log(this);*/
                index++;
                //console.log("遍历的名称"+d.speakContent);
                return d.speakContent;
            });

        //获取节点的enter部分
        var nodeEnter = nodeUpdate.enter();

        data.node = new Array();
        imageMenuData[count2]=new Array();


        var display=function (i,x) {
            /!*  console.log(data.data[i][x]);*!/
            var datas=data.data[i][x];
            var time=getMyDate(datas.speakTime);
            $("#schemetime").val(time);
            $("#speakmatcheddegree").val(datas.speakMatchedDegree);
            $("#speakcontent").val(datas.speakContent);

        };
        var displayscheme=function (i,x) {
            /*  console.log(data.data[i][x]);*/
            var datas = data.data[i][x];
            var time = getMyDate(datas.schemeTime);
            $("#planName1").val(datas.schemeName);
            $("#ner4").val(time);
            $("#ner3").val(datas.schemeConsistencyDegree);
            $("#ner1").val(datas.schemeBeforeContent);
            // $("#ner2").val(datas.schemeOpposeNumber);
        }

        var addNode=function (i,x) {
            var datas=data.data[i][x];
            //console.log("父结点的坐标"+  datas.speakId);
            responsedataFar =datas.speakId;
            responsedataScheme = datas.speakSchemeId;

            //当回复的是方案时
            if (responsedataScheme === undefined && responsedataFar === undefined){
                responsedataFar = 0;
                responsedataScheme = datas.schemeId;
            }

            $("#replyUser").text(datas.user_field.userName);
            /*var  speakid=   datas.speakId;
           dad.push(speakid)
             var  speakschemeid=   datas.speakSchemeId;
             dad.push(speakschemeid)
             var  schemeid=  datas.schemeId;
             dad.push(schemeid);
             //return dad;*/

        }





        for (var x in data.data[count2]) {
            imageMenuData[count2][x] = [
                [{
                    text: "查看详情",
                    func: function () {
                        //console.log($(this).index);
                        //console.log( typeof $(this))
                        console.log("传的值的类型"+$(this).data("index1"),$(this).data("index2"));

                        var schemeif =$(this).data("index2");
                        if(schemeif==0){
                            $("#fak1").modal("toggle");
                            displayscheme($(this).data("index1"),$(this).data("index2"));
                        }else{
                            display($(this).data("index1"),$(this).data("index2"));
                            $("#schemedetail").modal("toggle");
                        };
                    }

                }],
                [{
                    text: "回复",
                    func: function () {
                        addNode($(this).data("index1"),$(this).data("index2"));


                        $("#responseinput").modal("toggle");
                    }
                }]

            ];
        }


        //获取节点的exit部分
        var nodeExit = nodeUpdate.exit();


        //添加提示框的div
        var tooltip = d3.select("body").append("div")
            .attr("class","tooltip") //用于css设置类样式
            .attr("opacity",0.0);


        //1. 节点的 Enter 部分的处理办法
        var enterNodes = nodeEnter.append("g")
            .attr("class", "node")
            .attr("transform", function (d) {
                console.log(this);

                $(this).attr('data-index1',count2);
                $(this).attr('data-index2',count);
                $(this).smartMenu(imageMenuData[count2][count], opertionn);

                data.node[count2] = new Array();

                data.node[count2].push(this);
                //console.log("this是什么"+this)
                count++;
                return "translate(" + source.y0 + "," + source.x0 + ")";
            })
            .on("click", function (d) {
                toggle(d);
                redraw(d);

            })
            .on("mouseover",function(d)
            {
                console.log(d);
                //设置tooltip文字
                tooltip.html(d.speakContent+"....num:"+d.speakMatchedDegree+"<br/>")
                //设置tooltip的位置(left,top 相对于页面的距离)
                    .style("left",(d3.event.pageX)+"px")
                    .style("top",(d3.event.pageY+20)+"px")
                    .style("opacity",1.0);
            })
            //--鼠标移出事件
            .on("mouseout",function(d)
            {
                tooltip.style("opacity",0.0);
            });

        count2++;

        //菜单属性
        var opertionn = {
            name: "",
            offsetX: 2,
            offsetY: 2,
            textLimit: 10,
            /* beforeShow: $.noop,
             afterShow: $.noop*/
        };



        enterNodes.append("circle")
            .attr("r", 0)
            .style("fill", function (d) {
                return d._children ? "lightsteelblue" : "#fff";
            })

        ;


        enterNodes.append("text")
            .attr("x", function (d) {
                return d.children || d._children ? -14 : 14;
            })
            .attr("dy", ".35em")
            .attr("text-anchor", function (d) {
                return d.children || d._children ? "end" : "start";
            })
            .text(function (d) {
               /* return d.speakMatchedDegree*/
                if (d.speakContent != null && d.speakContent != undefined){
                    if (d.depth == 1){
                        return d.speakContent;
                    }

                }else {
                    // return d.schemeName;
                }


            })
            .style("fill-opacity", 0);


        //2. 节点的 Update 部分的处理办法
        var updateNodes = nodeUpdate.transition()
            .duration(500)
            .attr("transform", function (d) {
                return "translate(" + d.y+ "," + d.x + ")";
            })
        ;



        updateNodes.select("circle")
            .attr("r", 8)
            .style("fill", function (d) {
                //根据共识度判断结点颜色
                if (d.depth != 0){
                    //是评论
                    if (d.speakMatchedDegree > 0){
                        //赞成是绿色
                        return d._children ? "lightsteelblue" : "#12C91A";
                    }else if(d.speakMatchedDegree = 0){
                        //中立是白色
                        return d._children ? "lightsteelblue" : "#fff";
                    }else {
                        //反对是红色
                        return d._children ? "lightsteelblue" : "#9B0A0A";
                    }
                }else {
                    //是方案
                    return d._children ? "lightsteelblue" : "#fff";
                }

            })




        updateNodes.select("text")
            .attr("dx", function (d) {
                return d.children ? -8 : 8;
            })//定义文本显示x轴偏移量
            .attr("dy", 3)//定义文本显示y轴偏移量
            .style("text-anchor", function (d) {
                return d.children ? "end" : "start";
            })//文字对齐显示
            .text(function (d) {
                /*return d.speakMatchedDegree*/
                if (d.speakContent != null && d.speakContent != undefined){
                    if (d.depth == 1){
                        return d.speakContent;
                    }

                }else {
                    // return d.schemeName;
                }


            })
            .style("fill-opacity", 1);

        //3. 节点的 Exit 部分的处理办法
        var exitNodes = nodeExit.transition()
            .duration(500)
            .attr("transform", function (d) {
                return "translate(" + d.y + "," + d.x + ")";
            })
            .remove();

        exitNodes.select("circle")
            .attr("r", 0);

        exitNodes.select("text")
            .style("fill-opacity", 0);

        /*
         （3） 连线的处理
         */

        //获取连线的update部分
        var linkUpdate = svg.selectAll(".link")
            .data(links, function (d) {
                return d.target.speakId;
            });

        //获取连线的enter部分
        var linkEnter = linkUpdate.enter();

        //获取连线的exit部分
        var linkExit = linkUpdate.exit();

        //1. 连线的 Enter 部分的处理办法
        linkEnter.insert("path", ".node")
            .attr("class", "link")
            .attr("d", function (d) {
                var o = {x: source.x0, y: source.y0};
                return diagonal({source: o, target: o});
            })
            /* .attr("marker-end", function(d){
             return getArrow();
             })*/
            .transition()
            .duration(500)
            .attr("d", diagonal);


        //2. 连线的 Update 部分的处理办法
        linkUpdate.transition()
            .duration(500)
            .attr("d", diagonal);

        //3. 连线的 Exit 部分的处理办法
        linkExit.transition()
            .duration(500)
            .attr("d", function (d) {
                var o = {x: source.x, y: source.y};
                return diagonal({source: o, target: o});
            })
            .remove();

        console.log(data);
        console.log(imageMenuData);
        console.log(count1+' '+' '+count2+' '+count);
        /**
         * 定义扩展箭头方法
         */
        /*function getArrow(){
         if($('marker#end-arrow').length==0){
         svg.append('svg:defs').append('svg:marker')
         .attr('id', 'end-arrow')
         .attr('viewBox', '0 -5 10 10')
         .attr('refX', 10)
         .attr('markerWidth', 6)//箭头参数适当按需调整
         .attr('markerHeight', 10)
         .attr('orient', 'auto')
         .append('svg:path')
         .attr('d', 'M0,-5L10,0L0,5')//绘制箭头形状
         .attr('fill', 'blue');
         }
         return 'url(#end-arrow)';
         }*/

        /*
         （4） 将当前的节点坐标保存在变量x0、y0里，以备更新时使用
         */
        nodes.forEach(function (d) {
            d.x0 = d.x;
            d.y0 = d.y;
        });

    }


}

