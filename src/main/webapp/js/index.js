/**
 * Created by yinziwei on 2018/3/22.
 */
/*
 jQuery�������꾭���˵�ʱ��ʾ�Ӳ˵�������꾭���Ӳ˵�ʱ�Ӳ˵�Ҳ��ʾ
 �ؼ�˼·�����ڸ��˵�����hover�������ټ����Ӳ˵���hover����*/

 function animation(){


    var list=document.getElementById("nav_menus").getElementsByClassName("nav-content");
 

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
 
function submenus(id){
  data={};
  data.collegeId=id;
   $.ajax({
        type:"POST",
        url:"/certificate/verticalNav/colloge",//这里需要返回参数，包括学院名，及相应的专业名及专业证书名
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//返回参数，包括学院名，及相应的专业名及专业证书名*/
 
             tops=$(".nav-stacked").css("top","90px");
                $.each(data.data, function (i, item) {
                    $(".content").append(

 "                <li  class=\"childs\" ><a href=\"index2.js\"  >"+item.majorName+"</a></li>"              
       )
                    tops+="-20px";
                    $(".content").css("position","absolute");
                     $(".content").css("top",tops);

                });
                animation();
        }
    })

}
$(function () {

    //开始载入数据
  
  /*左边导航栏*/
    $.ajax({
        type:"POST",
        url:"/certificate/verticalNav/colloge",//这里需要返回参数，包括学院名，及相应的专业名及专业证书名,一次推6个
        data:JSON.stringify(),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//返回参数，包括学院名，及相应的专业名及专业证书名*/
 $.each(data.data, function (i, item) {
                    $("#nav_menus").append(

                        "                <li role=\"presentation\" class=\" nav-content\" onmouseover='submenus("+item.collegeId+")'><a href=\"index2.js\" enterCerticateDatil("+item.collegeId +")'>"+item.collegeName+"</a><ul class=\"content\"></ul></li>"
                    )
                    

                });
        }
    })
    /*右边轮播图*/
     var data={};
     data.photoCategoryId = "1";
    $.ajax({
        type:"POST",
        url:"/certificate/couselPhoto/certificatePhoto",//一些轮播图，图片类别为轮播图，
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//传过来的轮播图，一般限制为三个
            $("#listbox").append(
                    "<div class=\"item active\"  onclick='enterCerticateDatil("+data.data[0].certificateId +")'>"+
                    "                        <img src="+data.data[0].photoAddr+" alt="+data.data[0].photoDesc+">"+
                    "                        <div class=\"carousel-caption\">"+
                                           data.data[0].photoTitle+
                    "                        </div>"+
                    "                    </div>"
            )
              data=data.shift();


                $.each(data.data, function (i, item) {
                    $("#listbox").append(
                    "<div class=\"item \"  onclick='enterCerticateDatil("+item.certificateId +")'>"+
                    "                        <img src="+item.photoAddr+" alt="+item.photoDesc+">"+
                    "                        <div class=\"carousel-caption\">"+
                                           item.photoTitle+
                    "                        </div>"+
                    "                    </div>"

                    )
                });


            }

        
    })

    /*一些实例推荐的证书图片*/  //未完成的工作有下面三个图片还没有家在进去,包括的表有c_introduce  c_photo  c_certificate
    var datas={};
    datas.photoCategoryId = "2";
   $.ajax({
        type:"POST",
        url:"/certificate/certificatePush/certificatePhoto",//一些实例推荐的图片，然后描述，图片类别实例推荐图，一退4次
        data:JSON.stringify(datas),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//
            
                $.each(data.data, function (i, item) {
                    $("#push").append(
                    "        <div class=\"col-md-3\"   onclick='enterCerticateDatil("+item.certificateId +")'>"+
                    "                <div class=\"single-member effect-2\" style=\"border: 1px #2b333b solid\">"+
                    "             <div class=\"member-image\">"+
                    "                <img src="+item.photoAddr+" alt="+item.photoDesc+">"+
                    "            </div>"+
                    "            <div class=\"member-info\">"+
                    "                <h3> "+item.certificateTitle+"</h3>"+
                    "                <p>"+item.introduceSmall+"</p>"+
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
    })

})
 
 