function initRoles() {
	$.ajax({
		type : 'get',
		url : '/api/roles/alls',
		async : false,
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
		success : function(data) {

                var r = $("#role");

                for (var i = 0; i < data.length; i++) {
                    var d = data[i];
                    var id = d['id'];
                    var name = d['name'];

                    // var t = "<input type='radio' value='" + id + "' name='role' title='"+name+"'>";
					var t=" <option value='"+id+"'>"+name+"</option>";
                    r.append(t);
                }
		}
	});
}


function initDepartments() {
    $.ajax({
        type : 'get',
        url : '/api/department/departmentList',
        async : false,
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
        success : function(data) {
			if(data.code="200"){
				data=data.data;
                var r = $("#department");
				console.log(data);
                for (var i = 0; i < data.length; i++) {
                    var d = data[i];
                    var id = d['id'];
                    var name = d['name'];

                    // var t = "<input type='radio' value='" + id + "' name='role' title='"+name+"'>";
                    var t=" <option value='"+id+"'>"+name+"</option>";
                    r.append(t);
                }
			}

        }
    });
}


function getCheckedRoleIds() {
	var ids = [];
	$("#roles input[type='radio'][name='role']").each(function() {
		if ($(this).prop("radio")) {
			ids.push($(this).val());
		}
	});

	return ids;
}

function initRoleDatas(userId) {
	$.ajax({
		type : 'post',
        contentType: "application/json; charset=utf-8",
		url : '/api/roles/userRole',
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
		data:JSON.stringify({
            'userId':userId
		}),
		success : function(data) {

            if (data.code="200"){
                data=data.data;
				var length = data.length;
				for (var i = 0; i < length; i++) {
					$("input[type='radio'][name='role']").each(function() {

						var v = $(this).val();
						if (v == data[i]['id']) {
							$(this).attr("checked", true);
						}
					});
				}
            }
		}
	});
}