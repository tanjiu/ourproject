//form序列化为json
$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

//转json
( function ($){
    $.fn.toJson= function (){
        var queryArray = this.serializeArray();
        var jsonString= '{';
        for (var i = 0; i < queryArray.length; i++) {
            jsonString+= JSON.stringify(queryArray[i].name) + ':' + JSON.stringify(queryArray[i].value) + ',';
        }
        jsonString= jsonString.substring(0, (jsonString.length - 1));
        jsonString+= '}';
        return jsonString;
        // return JSON.parse(jsonString)
    };
})(jQuery);

//获取url后的参数值
function getQueryVariable(variable)
{
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == variable){


            return decodeURI(pair[1]);}
    }
    return(false);
}


function getUrlParam(key) {
    var href = window.location.href;
    var url = href.split("?");
    if(url.length <= 1){
        return "";
    }
    var params = url[1].split("&");

    for(var i=0; i<params.length; i++){
        var param = params[i].split("=");
        if(key == param[0]){
            return decodeURI(param[1]);
        }
    }
}

// 检查登录状态
function loginInfo(){
	var user = "";
    user=getToken();
    // $.ajax({
    //     type : 'get',
    //     url : 'public/sys/login',
    //     async: false,
    //     success : function(data){
    //         if(data != null && data != ""){
    //             user = data;
    //         }
    //     },
    //     error: function(xhr,textStatus,errorThrown){
    //         var msg = xhr.responseText;
    //         var response = JSON.parse(msg);
    //         $("#info").html(response.message);
    //     }
    // });
    
    return user;
}