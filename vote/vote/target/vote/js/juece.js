<!--倒计时器-->
var maxtime = 15*60*60
function CountDown(){
    if(maxtime>=0){
        hours = Math.floor(maxtime/3600);
        minutes = Math.floor(maxtime/60-hours*60);
        seconds = Math.floor(maxtime%60);
        msg =+hours+":"+minutes+":"+seconds;
        document.all["timer"].innerHTML=msg;
        if(maxtime == 5*60) alert('注意，还有5分钟!');
        --maxtime;
    }
    else{
        clearInterval(timer);
        alert("时间到，结束!");
    }
}
timer = setInterval("CountDown()",1000);

<!--计时器-->

var Maxtime =15*60*60 ;
var s=0;
var m=0;
var h=0;
var time=0;
function CountUp(){
    if(time<=Maxtime){
        if(s==60){
            s=0;
            m++;
        }
        if(m==60){
            m=0;
            h++;
        }
        msg =+h+":"+m+":"+s;
        document.all["Tim"].innerHTML=msg;
        time++;
        s++;
    }
    else{
        clearInterval(Tim);}
}
Tim = setInterval("CountUp()",1000);

<!--弹框-->
$(function () {
    $("[data-toggle='popover']").popover();
});

<!--按钮切换-->
function $(id){
    return typeof id==='string'?document.getElementById(id):id;
}
window.onload=function () {
    //获取鼠标划过或点击和要切换内容的元素
    var titles=$('tit').getElementsByTagName('li');
    /*  alert(titles.length);  */
    for(var i=0;i<titles.length;i++){
        titles[i].id=i;
        titles[i].onclick=function () {
            for(var j=0;j<titles.length;j++){
                titles[j].className='';
            }
            this.className='select';
        }
    }
    var s=$('met').getElementsByTagName('li');
    var z=$('sheet').getElementsByTagName('iframe');
    for(var a=0;a<s.length;a++){
        s[a].id=a;
        s[a].onclick=function () {
            for(var b=0;b<s.length;b++){
                s[b].className='';
                z[b].style.display='none';
            }
            this.className='bob';
            z[this.id].style.display='block';
        }
    }
}
