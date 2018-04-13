/**
 * Created by yinziwei on 2018/4/7.
 */
function enterCerticateDatil(id) {
    var data = {};
    data.certificateId = id;

    $.ajax({
        type:"POST",
        url:"/certificate/certificateOnclick/certificateDetail",
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data);

            window.parent.location.href = "index3.html" 
        }
    })
}
function enterCollegeDatil(id) {
    var data = {};
    data.collegeId = id;

    $.ajax({
        type:"POST",
        url:"/certificate/collegeDirection/collegeDirectionDetail",   //这个其实要访问certificate表，
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data);

            window.parent.location.href = "index2.html"
        }
    })
}

        
function changeCollegeDatil(id){
     var data = {};
    data.collegeId = id;
     $.ajax({
        type:"POST",
        url:"/certificate/certificatePush/certificatePhoto",   //这个其实要访问certificate表，
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data);

            $("#majordetail").append(
                    " <li class=\"direction-0 floatLeft \"  ><a href=\"#\">全部</a></li>")
                //这里的全部是否被选中，会根据上个页面传过来的参数进行
                $.each(data.data, function (i, item) {

                    /*此时要限定出现的个数*/
                    $("#cerficatepush").append(
                        "<div class=\"allcontent floatLeft\" onclick='enterCerticateDatil("+item.certificateId +")'>"+
                        "                    <a href=\"\">"+
                        "                        <div class=\"pic\">"+
                        "                            <img src="+item.certificatePhoto+" alt="+item.certificateTitle+" class=\"imgcontent\"/>"+
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
}
}