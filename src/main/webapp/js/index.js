/**
 * Created by yinziwei on 2018/3/22.
 */
/*
 jQuery�������꾭���˵�ʱ��ʾ�Ӳ˵�������꾭���Ӳ˵�ʱ�Ӳ˵�Ҳ��ʾ
 �ؼ�˼·�����ڸ��˵�����hover�������ټ����Ӳ˵���hover����*/

window.onload=function(){


    var list=document.getElementById("nav_menus").getElementsByClassName("nav-content");
 //   var content=document.getElementsByClassName("content");

    for( var i=0;i<list.length;i++)
    {
        var m= list[i].innerText;
       // alert() ;
        list[i].onmouseover=function(){
            this.className="lihover";
        }
        list[i].onmouseout=function(){
            this.className="";

        }

    }

}
/*function blurInputLoginBox(inputs) {
    inputs.removeClass("item_tip_focus");
    inputs.removeClass("form_input_focus");

}
function focusInputLoginBox(inputs) {
    inputs.addClass("item_tip_focus");
    inputs.addClass("form_input_focus");
}*/

$(function () {

    //开始载入数据
  /* var data={};
    data.meetingType = "isUnstarted";*/
  /*左边导航栏*/
    $.ajax({
        type:"POST",
        url:"/api/verticalNav/colloge",//这里需要返回参数，包括学院名，及相应的专业名及专业证书名
        data:JSON.stringify(),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//返回参数，包括学院名，及相应的专业名及专业证书名
                $.each(data.data, function (i, item) {
                    $("#nav_menus").append(

                        "                <li role=\"presentation\" class=\" nav-content\"><a href=\"index2.js\">"+item.collegeName+"</a></li>"
                    )
                    $.each(data.data.data, function (j, item) {
                    $(".content").append(
                       /* " <li  class=\"childs\"><a href=\"index2.js?majorName='+item.majorName++"&majorId="+item.majorId'>+item.majorName+</a></li>"*/
                    )
                    })   ;

                });
        }
    })
    /*右边轮播图*/
/*     var data={};
     data.photoCategoryId = "1";
    $.ajax({
        type:"POST",
        url:"/api/couselPhoto/certificatePhoto",//一些轮播图，图片类别为轮播图，
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//传过来的轮播图，一般限制为三个到四个
            if(data.statusCode==200)
            {
                $.each(data.data, function (i, item) {
                    $("#listbox").append(
                    "<div class=\"item\"  onclick='enterCerticateDatil("+item.certificateIdId +")'>"+
                    "                        <img src="+item.photoAddr+" alt="+item.photoDesc+">"+
                    "                        <div class=\"carousel-caption\">"+
                                           item.photoTitle+
                    "                        </div>"+
                    "                    </div>"

                    )
                });


            }

        }
    })*/

    /*一些实例推荐的证书图片*/  //未完成的工作有下面三个图片还没有家在进去,包括的表有c_introduce  c_photo  c_certificate
    var datas={};
    datas.photoCategoryId = "2";
/*    $.ajax({
        type:"POST",
        url:"/api/certificatePush/certificatePhoto",//一些实例推荐的图片，然后描述，图片类别实例推荐图，
        data:JSON.stringify(datas),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//
            if(data.statusCode==200)
            {
                $.each(data.data, function (i, item) {
                    $("#push").append(
                    "        <div class=\"col-md-3\"   onclick='enterCerticateDatil("+item.certificateIdId +")'>"+
                    "                <div class=\"single-member effect-2\" style=\"border: 1px #2b333b solid\">"+
                    "             <div class=\"member-image\">"+
                    "                <img src="+item.photoAddr+" alt="+item.photoDesc+">"+
                    "            </div>"+
                    "            <div class=\"member-info\">"+
                    "                <h3> +item.certificateTitle+</h3>"+
                    "                <p>+item.introduceSmall+</p>"+
                    "                <div class=\"social-touch\">"+
                    "                    <a class=\"fb-touch\" href=\"#\"></a>"+
                    "                    <a class=\"tweet-touch\" href=\"#\"></a>"+
                    "                    <a class=\"linkedin-touch\" href=\"#\"></a>"+
                    "                </div>"+
                    "            </div>"+
                    "        </div>"+
                    "    </div>"
                    )

                });


            }

        }
    })*/

})
/*点击下面的是实力推荐的图片*/
/*$(".nub").click(function () {
    var dat={};
var certificateId = $(this).val(certificateId);
    dat.certificateId = certificatedid;

    $.ajax({
        type:"POST",
        url:"/api/couselPhoto/certificateDetail",//请求一个页面
        data:JSON.stringify(dat),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//需要这个图片的id。证书的ID
            if(data.statusCode==200)
            {
                window.parent.location.href = "index3.html?certificatePhoto="+data.data.certificatePhoto+"&certificateIntroduceId="+data.data.certificateIntroduceId+"&meetingId="+meeting.meetingId;//这里缺一个考试信息详情的字段



            }

        }
    })



})
点击轮播图后
$(".item").click(function () {
    var da={};
    var certificateId = $(this).val(certificateId);
    da.certificateId = certificatedid;

    $.ajax({
        type:"POST",
        url:"/api//certificatePhoto",//请求一个页面
        data:JSON.stringify(da),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//
            if(data.statusCode==200)
            {
                window.parent.location.href = "index3.html?certificatePhoto="+data.data.certificatePhoto+"&certificateIntroduceId="+data.data.certificateIntroduceId+"&meetingId="+meeting.meetingId;//这里缺一个考试信息详情的字段



            }

        }
    })



})*/