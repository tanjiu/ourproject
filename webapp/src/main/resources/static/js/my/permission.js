function checkPermission() {
	var pers = [];
	$.ajax({
		type : 'get',
		url : '/api/permissions/owns',
		contentType : "application/json; charset=utf-8",
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
		async : false,
		success : function(data) {
			pers = data;
			$("[permission]").each(function() {
				var per = $(this).attr("permission");
				if ($.inArray(per, data) < 0) {
					$(this).hide();
				}
			});
		}
	});
	
	return pers;
}

// function checkPermission(){
//     return getAllPermission();
// }