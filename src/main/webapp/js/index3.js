/**
 * Created by yinziwei on 2018/3/24.
 */

$(function(){
  //  $("#newsaddress").load("http://jquery.cuishifeng.cn/");
   // alert("hello")
    $(".induce").mouseover(function(){
        $(this).css("border","1px blue solid");
    });
    $(".induce").mouseout(function(){
        $(this).css("border","1px #edf1f2 solid");
    });

    /*证书简介*/
    //传过来的参数


    var data={};
    var certificateId = $(this).val(certificateId);
    var photocategoryid = $(this).val(photoCategorId);
    var certificatephoto = $(this).val(certificatePhoto);
    data.certificateId = certificatedid;
    data.photoCategorId = photocategoryid;
    data.certificatePhoto = certificatephoto;

    $.ajax({
        type:"POST",
        url:"/api/introduceSmall/certificateDetail",//证书简介
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//
            if(data.statusCode==200)
            {
                $(".cerdetai").html(data.introduceSmall);
                    /*这里还有证书图片*/
            $("img").prop("src",data.photoAddr);


            }

        }
    })
    /*考试介绍，这里数据库缺少有关信息的字段，所以暂时字段空着*/
    $.ajax({
        type:"POST",
        url:"/api/introduceSmall/certificateIntroduce",//
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data)//
            if(data.statusCode==200)
            {
                $("#testMsg").html("<a href=\"\">"+
                    "                    <div class=\"floatLeft induce \">"+
                    "                        <div class=\"cont1\">"+
                    "                            <h3>考试介绍</h3>"+
                    "                        </div>"+
                    "                        <div class=\"cont2\">"+
                    "                          <p> 具体内容</p>"+
                    "                          <div class=\"floatRight\"><a href=\"\">详情</a></div>"+
                    "                        </div>"+
                    "                    </div>"+
                    "                    </a>"+
                    "                    <a href=\"\">"+
                    "                        <div class=\"floatLeft induce \">"+
                    "                            <div class=\"cont1\">"+
                    "                                <h3>考生须知</h3>"+
                    "                            </div>"+
                    "                            <div class=\"cont2\">"+
                    "                                <p> 具体内容</p>"+
                    "                                <div class=\"floatRight\"><a href=\"\">详情</a></div>"+
                    "                            </div>"+
                    "                        </div>"+
                    "                    </a>"+
                    "                    <a href=\"\">"+
                    "                        <div class=\"floatLeft induce \">"+
                    "                            <div class=\"cont1\">"+
                    "                                <h3>考试计划</h3>"+
                    "                            </div>"+
                    "                            <div class=\"cont2\">"+
                    "                                <p> 具体内容</p>"+
                    "                                <div class=\"floatRight\"><a href=\"\">详情</a></div>"+
                    "                            </div>"+
                    "                        </div>"+
                    "                    </a>"+
                    "                    <a href=\"\">"+
                    "                        <div class=\"floatLeft induce \">"+
                    "                            <div class=\"cont1\">"+
                    "                                <h3>考生服务</h3>"+
                    "                            </div>"+
                    "                            <div class=\"cont2\">"+
                    "                                <p> 具体内容</p>"+
                    "                                <div class=\"floatRight\"><a href=\"\">详情</a></div>"+
                    "                            </div>"+
                    "                        </div>"+
                    "                    </a>"
                )

/*这里的详情，需要写jq进行收起展开控制，但是我还没完成*/
            }

        }
    })
})
/*这里表示点击考试介绍，因为考试信息相关介绍没写，先放着*/
$(".nub").click(function () {
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
                window.parent.location.href = "index4.html?certificatePhoto="+data.data.certificatePhoto+"&certificateIntroduceId="+data.data.certificateIntroduceId+"&meetingId="+meeting.meetingId;//这里缺一个考试信息详情的字段



            }

        }
    })

})