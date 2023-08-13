$.ajaxSetup({
	cache : false,
	error : function(xhr, textStatus, errorThrown) {
		var msg = xhr.responseText;
		var response = JSON.parse(msg);
		var code = response.code;
		var message = response.message;
		if (code == 400) {
			layer.msg(message);
		} else if (code == 401) {
			layer.msg('未登录');
		} else if (code == 403) {
			console.log("未授权:" + message);
			layer.msg('未授权');
		} else if (code == 500) {
			layer.msg('系统错误：' + message);
		}
	}
});

function buttonDel(data, permission, pers){
    if(permission != ""){
        if ($.inArray(permission, pers) < 0) {
            return "";
        }
    }

    var btn = $("<button class='layui-btn layui-btn-xs' title='删除' onclick='del(\"" + data +"\")'><i class='layui-icon'>&#xe640;</i></button>");
    return btn.prop("outerHTML");
}

function buttonDel2(data, permission, pers){
    if(permission != ""){
        if ($.inArray(permission, pers) < 0) {
            return "";
        }
    }

    var btn = $("<button class='layui-btn layui-btn-xs' title='删除' onclick='del(" + data +")'><i class='layui-icon'>&#xe640;</i></button>");
    return btn.prop("outerHTML");
}

function buttonEdit(href, permission, pers){
    if(permission != ""){
        if ($.inArray(permission, pers) < 0) {
            return "";
        }
    }

    var btn = $("<button class='layui-btn layui-btn-xs' title='编辑' onclick='javascript:getEdit(\""+href+"\");'><i class='layui-icon'>&#xe642;</i></button>");

    // var btn = $("<button class='layui-btn layui-btn-xs' title='编辑' onclick='window.location=\"" + href +"\"'><i class='layui-icon'>&#xe642;</i></button>");
    return btn.prop("outerHTML");
}


function deleteCurrentTab(){
    var lay_id = $(parent.document).find("ul.layui-tab-title").children("li.layui-this").attr("lay-id");
    parent.active.tabDelete(lay_id);
}

function getEdit(href) {

    //iframe窗


    layer.open({
        type: 2,
        title: '编辑/添加 角色',
        shadeClose: true,
        shade: false,
        maxmin: true, //开启最大化最小化按钮
        area: ['90%', '90%'],
        content: [href, 'yes']
    });



//    layer.open({
//        type: 2,
//        title:'编辑',
//        area: ['700px', '450px'],
//        content: [href, 'yes'] //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
//    });
}