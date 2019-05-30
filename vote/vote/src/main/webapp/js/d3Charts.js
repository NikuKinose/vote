function d3Charts(ok,no,yes,num,max){
    //yes和ok需要互换位置，可能是数组选择时下标反着来计算的

    //yes是查出来的反向票数序列
    //no是查出来的反向票数序列
    //ok是查出来的反向票数序列
    //num是方案数
    //max是yes、no、ok中的正向最大票数

    var n = num, // number of samples
        m = 3; // number of series
    var realyes=yes;
    var realno=no;
    var realok=ok;
    //yes和ok需要互换位置，可能是数组选择时下标反着来计算的
    var data=[realok,realno,realyes];

    console.log(data);
    //设置svg变量和宽高
    var margin = {
            top: 20,
            right: 30,
            bottom: 30,
            left: 40
        },
        width = 800 - margin.left - margin.right,
        height = 500 - margin.top - margin.bottom;

    //设置y轴的比例尺
    var y = d3.scale.linear()
        .domain([0, max])  //需要存贮最大值的变量
        .range([height,0]);

    //设置X轴的比例尺
    var x0 = d3.scale.ordinal()
        .domain(d3.range(n))
        .rangeBands([0,width]);

    console.log(x0.rangeBand());//上面每一个区间间隔的长度

    //设置一个比例尺来求得四个小rect在一个区间的占的长度
    var x1=d3.scale.ordinal()
        .domain(d3.range(m))
        .rangeBands([5,x0.rangeBand()]);
    //设置颜色的比例尺
    var z=d3.scale.category10();

    //x轴的比例尺
    var xAxis=d3.svg.axis()
        .scale(x0)
        .orient('bottom');
    //y轴比例尺
    var yAxis=d3.svg.axis()
        .scale(y)
        .orient('left');

    //添加svg并且设置宽高并且添加一个g和偏移
    var svg=d3.select('body').append('svg')
        .attr('width',width+margin.left+margin.right)
        .attr('height',height+margin.top+margin.bottom)
        .append('svg:g')
        .attr("transform","translate("+margin.left+","+margin.top+")");

    //添加一个y轴的分组标签
    svg.append("g")
        .attr("class", "y axis")
        .call(yAxis);
    //
    //添加一个x周到分组标签
    svg.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(xAxis);


    svg.append('g')                             //添加一个分组g标签
        .selectAll('g')                         //选择所有g元素
        .data(data)                             //绑定数据  即二维数组中的个数4
        .enter()                                //添加数据的标志
        .append('g')                            //添加g元素，也就是数据绑定元素
        .style('fill',function(d,i){            //4个元素添加不同颜色。
            return z(i);
        })
        .attr('transform',function(d,i){        //然后移动g标签
            console.log(d);
            return "translate("+x1(i)+",0)" ;   //x1比例尺的范围是x0的rangeband即一个的区间范围
        })
        .selectAll('rect')                      //选择所有的rect，下面将要在每一个g标签里面开始添加20个rect
        .data(function(d){
            return d;                       //这里面的每一个d都是一个长度为20的一维数组。
        })
        .enter()                            //根据数据开始添加rect
        .append('rect')
        .attr('width',x1.rangeBand())       //设置x1的rangBand()宽度。
        .attr('height',function(d,i){return y(d);})                 //设置rect高度
        .attr('x',function(d,i){return x0(i);}) //设置rect的x坐标。
        .attr('y',function(d){
            return height-y(d);         //设置y的所在位置
        })


}
