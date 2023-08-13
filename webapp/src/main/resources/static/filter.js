
	var m = new Map();
	m.set("hnadmin","http://www.baidu.com");//惠农管理员
	m.set("hnnormal","http://www.qq.com");//惠农普通用户
	m.set("admin","http://www.qq.com");//超级管理员
	m.set("norole","/login.html");  //无权限


    function baseUrl() {
        return "";
    }
function filterPage(){
	var tokencookie=getCookie("token");
	if(checkTokenIsNull(tokencookie)){
		token=sessionStorage.getItem('token');
		if(checkTokenIsNull(token)){
			hrefToken();
		}
	}

}

    function filter(permissionList){
        var tokencookie=getCookie("token");
        if(checkTokenIsNull(tokencookie)){
        	hrefToken();
        	return;
        }

        if(isHavePermission(permissionList)){
        	return true;
		}else{
            hrefToken();
		}
    }

    /**
	 *
	 * 是否拥有权限
     * @param roleList
     * @returns {boolean}
     */
 function isHaveRole(roleList) {
     var allroles=getRoles();
     if(!checkTokenIsNull(roleList)){
         for(var  i=0;i<roleList.length;i++){
             for (var j=0;j<allroles.length;j++){
                 if(allroles[j]==roleList[i]){
                     console.log("角色符合");
                     return true;
                 }
             }

             console.log("角色不符合");
             return false;
             // if(allroles.indexOf(roleList[i])){
             // 	return true;
             // }
         }
	 }



 }


    function isHavePermission(permissionList) {
        var allroles=getAllPermission();
        if(!checkTokenIsNull(permissionList)){
            for(var  i=0;i<permissionList.length;i++){
                for (var j=0;j<allroles.length;j++){
                    if(allroles[j]==permissionList[i]){
                        return true;
                    }
                }
                return false;
            }
        }



    }

function checkTokenIsNull(tokencookie){
	if(tokencookie==null||tokencookie=="undefined"||tokencookie==''){
		return true;
	}
	return false;
}


function Todate(time) {
    if(checkTokenIsNull(time)){
        return "无";
    }

    var crtTime = new Date(time);
    return crtTime.Format("yyyy-MM-dd  hh:mm:ss");;//直接调用公共JS里面的时间类处理的办法
}

    function formatDate(now) {
        var year=now.getYear();
        var month=now.getMonth()+1;
        var date=now.getDate();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        return year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second;
    }



    Date.prototype.Format = function (formatStr) {
        var str = formatStr;
        var Week = ['日', '一', '二', '三', '四', '五', '六'];

        str = str.replace(/yyyy|YYYY/, this.getFullYear());
        str = str.replace(/yy|YY/, (this.getYear() % 100) > 9 ? (this.getYear() % 100).toString() : '0' + (this.getYear() % 100));
        var month = this.getMonth() + 1;
        str = str.replace(/MM/, month > 9 ? month.toString() : '0' + month);
        str = str.replace(/M/g, month);

        str = str.replace(/w|W/g, Week[this.getDay()]);

        str = str.replace(/dd|DD/, this.getDate() > 9 ? this.getDate().toString() : '0' + this.getDate());
        str = str.replace(/d|D/g, this.getDate());

        str = str.replace(/hh|HH/, this.getHours() > 9 ? this.getHours().toString() : '0' + this.getHours());
        str = str.replace(/h|H/g, this.getHours());
        str = str.replace(/mm/, this.getMinutes() > 9 ? this.getMinutes().toString() : '0' + this.getMinutes());
        str = str.replace(/m/g, this.getMinutes());

        str = str.replace(/ss|SS/, this.getSeconds() > 9 ? this.getSeconds().toString() : '0' + this.getSeconds());
        str = str.replace(/s|S/g, this.getSeconds());
        return str;
    }


    function hrefToken(){
	window.location.href=m.get("norole");
}


    /**
     date 为long类型
     pattern 为格式化参数
     */
    function getFormatDate(date, pattern) {
        if (date == undefined) {
            date = new Date();
        }
        if (pattern == undefined) {
            pattern = "yyyy-MM-dd hh:mm:ss";
        }
        return date.format(pattern);
    }

    /**
	 * 设置token
     * @param token
     */
function setToken(token){  //data.data
	var savetoken=JSON.stringify(token);
	if(typeof(Storage)!=="undefined")
	{
		 // 当支持 localStorage  sessionStorage时
		sessionStorage.setItem('token',savetoken); 
		 // document.cookie="token="+savetoken;
        setCookie("token", savetoken);
		 
	} else {
    // 抱歉! 不支持 web 存储。
        setCookie("token", savetoken);
	}
}

    /**
	 * 获取Token
     * @returns {*}
     */

 function getToken(){
	var tokencookie=getCookie("token");

	if(checkTokenIsNull(tokencookie)){
		token=sessionStorage.getItem('token');

		if(checkTokenIsNull(token)){
			return null;
		}else{
            token=JSON.parse(token).token;
			return token;
		}
	}else{
        tokencookie=JSON.parse(tokencookie).token;
		return tokencookie;
	}
	return null;
}


function removeToken() {
	delCookie("token");
    sessionStorage.removeItem("token");
}

    /**
	 * 获取存储的所有数据
     * @returns {*}
     */
 function getAllData(){
	var tokencookie=getCookie("token");
	if(checkTokenIsNull(tokencookie)){
		token=sessionStorage.getItem('token');
		if(checkTokenIsNull(token)){
			return null;
		}else{
			return token;
		}
	}else{
		return tokencookie;
	}
	return null;
}


    /**
	 * 获取角色列表
     * @returns {string[]}
     */
 function getRoles() {
    return JSON.parse(getAllData()).roles;
}


function loginGoTo(){
	var data=getToken().roleList;
	console.log(data.length);
}


function getMsg(msg) {
	if(checkTokenIsNull(msg)){
		return "无数据";
	}
	return msg;
}

    function getMsgNull(msg) {
        if(checkTokenIsNull(msg)){
            return "";
        }
        return msg;
    }

/**
 * 
 * 检查所有角色（用于登陆）
 * @param {Object} roleList
 * @param {Object} roleData
 */
function checkRole(roleList,roleData){
	var status=false;
	for(var j = 0,len = roleList.length; j < len; j++){
		 if(roleData.indexOf(roleList[i])){
   		 	goUrl(role);
   		 	break;
   		 }
	}
	return false;
}


    /**
	 * 拦截器拦截权限
     */

    function checkPerimission(permissionList,permissionDate) {
        var status=false;
        for(var j = 0,len = permissionList.length; j < len; j++){
            if(permissionDate.indexOf(permissionList[i])){
                status=true;
                break;
            }
        }

        if(status){
            return true;
        }
        return false;

    }

/**
 * 拦截器校验角色
 * @param {Object} roleList
 * @param {Object} roleData
 */
function checkRoleFilter(roleList,roleData){
	var status=false;
	for(var j = 0,len = roleList.length; j < len; j++){
		 if(roleData.indexOf(roleList[i])){
   		 	status=true;
   		 	break;
   		 }
	}
	
	if(status){
		return true;
	}
	return false;
	
}

    /**
	 * 获取所有权限
     */
    function getAllPermission() {

   return JSON.parse(getAllData()).permissons;
}

/**
 * 登陆跳转
 * @param {Object} role
 */
function goUrl(role){
	window.location.href=m.get(role);
}




    //写cookies
    function setCookie(name,value)
    {
        // var Days = 30;
        // var exp = new Date();
        // exp.setTime(exp.getTime() + Days*24*60*60*1000);
    //    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
        document.cookie = name + "="+ escape (value)+";"+'Path=/;domain='+document.domain;
    }

    //获取cookies
    function getCookie(name)
    {
        var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if(arr=document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }


    //检查cookies
    function checkCookie(c_name){
        if (document.cookie.length>0)
        {
            c_start=document.cookie.indexOf(c_name + "=")
            if (c_start>0)
                var arr = new Array();
            arr = document.cookie.split(";");
            return arr.length
        }
    }


    //删除cookies
    function delCookie(name)
    {
        var keys=document.cookie.match(/[^ =;]+(?=\=)/g);
        if (keys) {
            for (var i = keys.length; i--;)
                document.cookie=keys[i]+'=0;expires=' + new Date( 0).toUTCString()
        }
    }