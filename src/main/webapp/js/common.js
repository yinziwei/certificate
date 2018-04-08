/**
 * Created by yinziwei on 2018/4/7.
 */
function enterCerticateDatil(id) {
    var data = {};
    data.certificateId = id;

    $.ajax({
        type:"POST",
        url:"/api/",
        data:JSON.stringify(data),
        contentType:"application/json",
        dataType:"json",
        success:function (data) {
            console.log(data);

            window.parent.location.href = "index3.html?certificatePhoto="+data.data.certificatePhoto+"&certificateIntroduceId="+data.data.certificateIntroduceId+"&meetingId="+meeting.meetingId;//这里缺一个考试信息详情的字段
        }
    })
}