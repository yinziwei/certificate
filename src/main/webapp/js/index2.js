/**
 * Created by yinziwei on 2018/3/24.
 */
$(function() {

 $(".direction-0").click(function(){
     $(this).addClass("active").siblings().removeClass("active")
 })

    /* 这个为方向，其中难易程度和热度都默认为全部，方向会根据上个页面传过来的参数进行*/
    $.ajax({
        type:"POST",
        url:"/certificate/certificateDirection/majordetail",//
        data:JSON.stringify(),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//返回参数，包括该学院的所有专业

                $("#majordetail").append(
                " <li class=\"direction-0 floatLeft \"  ><a href=\"#\">全部</a></li>")
                //这里的全部是否被选中，会根据上个页面传过来的参数进行
                $.each(data.data, function (i, item) {
                    $("#majordetail").append(
                        " <li class=\"direction-0 floatLeft \"  ><a href=\"#\">"+item.majorName+"</a></li>"
                    )



                });
               /*这里需要写一个函数表示选中样式变色，但未完成*/




        }
    })
    /*这里是类别页中下面的推荐，一次推8个*/
    var dat={};
    var collogeid = $(this).val(collogeId);
    var majorid = $(this).val(majorId);
    var coefficientid = $(this).val(coefficientId);
    var hotid = $(this).val(hotId);
    dat.collogeId = collogeid;
    dat.majorid = majorid;
    dat.hotId = hotid;//这里不确定使用hotid还是hottype，但一定是唯一值
    dat.coefficientId = coefficientid;
    $.ajax({
        type:"POST",
        url:"/certificate/certificatePush/certificatePhotoDetail",//
        data:JSON.stringify(dat),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//返回参数，包括该学院的所有专业

                $("#majordetail").append(
                    " <li class=\"direction-0 floatLeft \"  ><a href=\"#\">全部</a></li>")
                //这里的全部是否被选中，会根据上个页面传过来的参数进行
                $.each(data.data, function (i, item) {

                    /*此时要限定出现的个数*/
                    $("#cerficatepush").append(
                        "<div class=\"allcontent floatLeft\" onclick='enterCerticateDatil("+item.certificateId +")'>"+
                        "                    <a href=\"\">"+
                        "                        <div class=\"pic\">"+
                        "                            <img src="+item.photoAddr+" alt="+item.photoDesc+" class=\"imgcontent\"/>"+
                        "                            <div class=\"label\">"+
                        /* "                                <label >ios</label>"+*/  //这个标签现在数据库中没有
                        "                            </div>"+
                        "                        </div>"+
                        "                        <div class=\"picontent\"><a href=\"#\">"+
                        "                            <span>" +item.certificateTitle+"</span>"+
                        "                            <p>"+item.introduceSmall+"</p>"+
                        "                        </a></div>"+
                        "                    </a>"+
                        "                    </div>"
                    )

                });



            }

    })


})

$("#hotdegree").click(function () {
   /* 这里我需要判断是哪个热度被选中了，然后作为参数传给后台进行刷新，但是我还没有写*/
    var data={};
    var hotid = $(this).val(hotId);
    data.hotId = hotid;

    $.ajax({
        type:"POST",
        url:"/certificate/hotdegree/certificatePhotoDetail",//
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//需要这个图片的id。证书的ID

                $("#cerficatepush").html("");
            $.each(data.data, function (i, item) {
                $("#cerficatepush").append(
                    "<div class=\"allcontent floatLeft\" onclick='enterCerticateDatil("+item.certificateIdId +")'>"+
                    "                    <a href=\"\">"+
                    "                        <div class=\"pic\">"+
                    "                            <img src="+item.photoAddr+" alt="+item.photoDesc+" class=\"imgcontent\"/>"+
                    "                            <div class=\"label\">"+
                    /* "                                <label >ios</label>"+*/  //这个标签现在数据库中没有
                    "                            </div>"+
                    "                        </div>"+
                    "                        <div class=\"picontent\"><a href=\"#\">"+
                    "                            <span> +item.certificateTitle+</span>"+
                    "                            <p>+item.introduceSmall+</p>"+
                    "                        </a></div>"+
                    "                    </a>"+
                    "                    </div>"
                )
            })





        }
    })



})
$("#difforeas").click(function () {
    /* 这里我需要判断是哪个难度被选中了，然后作为参数传给后台进行刷新，但是我还没有写*/
    var data={};
    var coefficientid = $(this).val(coefficientId)
     data.coefficientId = coefficientid;

    $.ajax({
        type:"POST",
        url:"/ certificate /difforeasdegree/certificatePhotoDetail",//
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//需要这个图片的id。证书的ID

                $("#cerficatepush").html("");
            $.each(data.data, function (i, item) {
                $("#cerficatepush").append(
                    "<div class=\"allcontent floatLeft\" onclick='enterCerticateDatil("+item.certificateId +")'>"+
                    "                    <a href=\"\">"+
                    "                        <div class=\"pic\">"+
                    "                            <img src="+item.photoAddr+" alt="+item.photoDesc+" class=\"imgcontent\"/>"+
                    "                            <div class=\"label\">"+
                    /* "                                <label >ios</label>"+*/  //这个标签现在数据库没有，
                    "                            </div>"+
                    "                        </div>"+
                    "                        <div class=\"picontent\"><a href=\"#\">"+
                    "                            <span> "+item.certificateTitle+"</span>"+
                    "                            <p>"+item.introduceSmall+"</p>"+
                    "                        </a></div>"+
                    "                    </a>"+
                    "                    </div>"
                )

        })


            }


    })



})