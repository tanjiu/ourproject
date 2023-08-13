function getMenuTree() {
	var root = {
		id : 0,
		name : "root",
		open : true,
	};


	$.ajax({
		type : 'get',
		url : '/api/permissions/all',
		contentType : "application/json; charset=utf-8",
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
		async : false,
		success : function(data) {
			var length = data.length;
			var children = [];
			for (var i = 0; i < length; i++) {
				var d = data[i];
				var node = createNode(d);
				children[i] = node;
			}

			root.children = children;
		}
	});

	return root;
}


/**
 * 部门树
 * @returns {{id: number, name: string, open: boolean}}
 */
    function getDepartmentMenuTree() {
        var root = {
            id : 0,
            name : "总部门",
            open : true,
        };


        $.ajax({
            type : 'post',
            url : '/api/department/selfall',
            contentType : "application/json; charset=utf-8",
            headers: {
                // Accept: "application/json; charset=utf-8",
                token:getToken()
            },
            async : false,
            success : function(data) {


                    var length = data.length;
                    var children = [];
                    for (var i = 0; i < length; i++) {
                        var d = data[i];
                        var node = createNode(d);
                        children[i] = node;
                    }

                    root.children = children;


            }
        });

        return root;
    }



    function initMenuDatas(roleId){
	$.ajax({
		type : 'get',
		url : '/api/permissions?roleId=' + roleId,
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
		success : function(data) {
			var length = data.length;
			var ids = [];
			for(var i=0; i<length; i++){
				ids.push(data[i]['id']);
			}
			
			initMenuCheck(ids);
		}
	});
}

function initMenuCheck(ids) {
	var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
	var length = ids.length;
	if(length > 0){
		var node = treeObj.getNodeByParam("id", 0, null);
		treeObj.checkNode(node, true, false);
	}
	
	for(var i=0; i<length; i++){
		var node = treeObj.getNodeByParam("id", ids[i], null);
		treeObj.checkNode(node, true, false);
	}
}

/**
 * 单选框选择初始化
 * @param ids
 */
function initDepartmentMenuCheck(ids) {
    var treeObj = $.fn.zTree.getZTreeObj("treeDepartment");
        var node = treeObj.getNodeByParam("id", 0, null);
        treeObj.checkNode(node, true, false);
        var node = treeObj.getNodeByParam("id", ids, null);
        treeObj.checkNode(node, true, false);

}


function getCheckedMenuIds(){
	var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
	var nodes = treeObj.getCheckedNodes(true);
	
	var length = nodes.length;
	var ids = [];
	for(var i=0; i<length; i++){
		var n = nodes[i];
		var id = n['id'];
		ids.push(id);
	}
	
	return ids;
}



function getCheckedDepartmentMenuIds(){
    var treeObj = $.fn.zTree.getZTreeObj("treeDepartment");
    var nodes = treeObj.getCheckedNodes(true);

    var length = nodes.length;
    var ids;
    for(var i=0; i<length; i++){
        var n = nodes[i];
        var id = n['id'];
        ids=id;
    }

    return ids;
}

function createNode(d) {
	var id = d['id'];
	var pId = d['parentId'];
	var name = d['name'];
	var child = d['child'];

	var node = {
		open : true,
		id : id,
		name : name,
		pId : pId,
	};

	if (child != null) {
		var length = child.length;
		if (length > 0) {
			var children = [];
			for (var i = 0; i < length; i++) {
				children[i] = createNode(child[i]);
			}

			node.children = children;
		}

	}
	return node;
}


function createDepartmentNode(d) {
    var id = d['departmentId'];
    var pId = d['parentId'];
    var name = d['departmentName'];
    var child = d['child'];

    var node = {
        open : true,
        id : id,
        name : name,
        pId : pId,
    };

    if (child != null) {
        var length = child.length;
        if (length > 0) {
            var children = [];
            for (var i = 0; i < length; i++) {
                children[i] = createNode(child[i]);
            }

            node.children = children;
        }

    }
    return node;
}




function initParentMenuSelect(){
	$.ajax({
        type : 'get',
        url : '/api/permissions/parents',
        async : false,
        headers: {
            // Accept: "application/json; charset=utf-8",
            token:getToken()
        },
        success : function(data) {
            var select = $("#parentId");
            select.append("<option value='0'>root</option>");
            for(var i=0; i<data.length; i++){
                var d = data[i];
                var id = d['id'];
                var name = d['name'];
                
                select.append("<option value='"+ id +"'>" +name+"</option>");
            }
        }
    });
}

/**
 * 初始化父部门
 */
function initParentDepartmentSelect(){
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
                var select = $("#parentId");
                select.append("<option value='353B5D7ECB12484B88FA832BF1EB1CE2'>总部门</option>");
                for(var i=0; i<data.length; i++){
                    var d = data[i];
                    var id = d['id'];
                    var name = d['name'];

                    select.append("<option value='"+ id +"'>" +name+"</option>");
                }
            }

        }
    });
}

// function initParentDepartmentSelect(){
//     $.ajax({
//         type : 'get',
//         url : '/api/department/parents',
//         async : false,
//         headers: {
//             // Accept: "application/json; charset=utf-8",
//             token:getToken()
//         },
//         success : function(data) {
//             var select = $("#parentId");
//             select.append("<option value='0'>root</option>");
//             for(var i=0; i<data.length; i++){
//                 var d = data[i];
//                 var id = d['departmentId'];
//                 var name = d['departmentName'];
//
//                 select.append("<option value='"+ id +"'>" +name+"</option>");
//             }
//         }
//     });
// }

/**
 * ztree多选
 * @returns {{check: {enable: boolean, chkboxType: {Y: string, N: string}}, async: {enable: boolean}, data: {simpleData: {enable: boolean, idKey: string, pIdKey: string, rootPId: number}}, callback: {onCheck: zTreeOnCheck}}}
 */
function getSettting() {
	var setting = {
		check : {
			enable : true,
			chkboxType : {
				"Y" : "ps",
				"N" : "ps"
			}
		},
		async : {
			enable : true,
		},
		data : {
			simpleData : {
				enable : true,
				idKey : "id",
				pIdKey : "pId",
				rootPId : 0
			}
		},
		callback : {
			onCheck : zTreeOnCheck
		}
	};

	return setting;
}

/**
 * ztree单选
 * @returns {{check: {enable: boolean, chkboxType: {Y: string, N: string}}, async: {enable: boolean}, data: {simpleData: {enable: boolean, idKey: string, pIdKey: string, rootPId: number}}, callback: {onCheck: zTreeOnCheck}}}
 */
function getRadioSettting() {
    var setting = {
        check : {
            enable : true,
            chkStyle: "radio",
            radioType: "all",
            chkboxType : {
                "Y" : "ps",
                "N" : "ps"
            }
        },
        async : {
            enable : true,
        },
        data : {
            simpleData : {
                enable : true,
                idKey : "id",
                pIdKey : "pId",
                rootPId : 0
            }
        },
        callback : {
            onCheck : zTreeOnCheck
        }
    };

    return setting;
}

function getDepartmentSettting() {
    var setting = {
        check : {
            enable : true,
            chkboxType : {
                "Y" : "ps",
                "N" : "ps"
            }
        },
        async : {
            enable : true,
        },
        data : {
            simpleData : {
                enable : true,
                idKey : "id",
                pIdKey : "pId",
                rootPId : 0
            }
        },
        callback : {
            onCheck : zTreeOnCheck
        }
    };

    return setting;
}



function getAddAndRemoveSetting1() {
    //树属性的定义
    var setting = {
        //页面上的显示效果
        view: {
            addHoverDom: addHoverDom, //当鼠标移动到节点上时，显示用户自定义控件
            removeHoverDom: removeHoverDom, //离开节点时的操作
            // fontCss: getFontCss //个性化样式
        },
        edit: {
            enable: true, //单独设置为true时，可加载修改、删除图标
            editNameSelectAll: true,
            showRemoveBtn: showRemoveBtn,
            showRenameBtn: showRenameBtn

        },
        data: {
            simpleData: {
                enable:true,
                idKey: "id",
                pIdKey: "pId",
                system:"system",
                rootPId: ""
            }
        },
        callback: {
            onClick: zTreeOnClick, //单击事件
            onRemove: onRemove, //移除事件
            onRename: onRename, //修改事件
            beforeRename:  eforeRename
        }
    };

    return setting;
}


function getAddAndRemoveSetting() {

    var setting = {
        view: {
            expandSpeed: "",
            addHoverDom: addHoverDom,
            removeHoverDom: removeHoverDom,
            selectedMulti: false
        },
        check: {
            enable: true
        },
        edit: {
            enable: true
        },
        data: {
            simpleData: {
                enable: true
            }
        },
        callback: {
            beforeRemove: beforeRemove,
            beforeRename: beforeRename,
        }
    };

    function beforeRemove(treeId, treeNode) {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.selectNode(treeNode);
        alert(treeNode.Action);//哈哈 出来了
        return confirm("确认删除 节点 -- " + treeNode.name + " 吗？");
    }
    function beforeRename(treeId, treeNode, newName) {
        if (newName.length == 0) {
            alert("节点名称不能为空!");
            return false;
        }
        return true;
    }

    var newCount = 1;
    function addHoverDom(treeId, treeNode) {
        var sObj = $("#" + treeNode.tId + "_span");
        if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0) return;
        var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
            + "' title='add node' onfocus='this.blur();' ></span>";
        sObj.after(addStr);
        var btn = $("#addBtn_" + treeNode.tId);
        if (btn) btn.bind("click", function () {
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.addNodes(treeNode, { id: (treeNode.id + newCount), parentid: treeNode.id, name: "new node" + (newCount++) });
            return false;
        });
    };
    function removeHoverDom(treeId, treeNode) {
        $("#addBtn_" + treeNode.tId).unbind().remove();
    };

}






function addHoverDom(treeId, treeNode) {
    var sObj = $("#" + treeNode.tId + "_span"); //获取节点信息
    if (treeNode.editNameFlag || $("#addBtn_"+treeNode.tId).length>0) return;

    var addStr = "<span class='button add' id='addBtn_" + treeNode.tId + "' title='add node' onfocus='this.blur();'></span>"; //定义添加按钮
    sObj.after(addStr); //加载添加按钮
    var btn = $("#addBtn_"+treeNode.tId);

    //绑定添加事件，并定义添加操作
    if (btn) btn.bind("click", function(){
        var zTree = $.fn.zTree.getZTreeObj("tree");
        //将新节点添加到数据库中
        var name='NewNode';
        $.post('./index.php?r=data/addtree&pid='+treeNode.id+'&name='+name,function (data) {
            var newID = data; //获取新添加的节点Id
            zTree.addNodes(treeNode, {id:newID, pId:treeNode.id, name:name}); //页面上添加节点
            var node = zTree.getNodeByParam("id", newID, null); //根据新的id找到新添加的节点
            zTree.selectNode(node); //让新添加的节点处于选中状态
        });
    });
};


/**
 * 删除节点
 * @param treeId
 * @param treeNode
 */
function removeHoverDom(treeId, treeNode) {
    $("#addBtn_"+treeNode.tId).unbind().remove();
};

/**
 * 修改节点
 * @param e
 * @param treeId
 * @param treeNode
 * @param isCancel
 */
function onRename(e, treeId, treeNode, isCancel) {
    //需要对名字做判定的，可以来这里写~~
    $.post('./index.php?r=data/modifyname&id='+treeNode.id+'&name='+treeNode.name);
}






function beforeRename(treeId, treeNode, newName, isCancel) {
    if (newName.length == 0) {
        alert("节点名称不能为空.");
        return false;
    }
    return true;
}







function zTreeOnCheck(event, treeId, treeNode) {
//	console.log(treeNode.id + ", " + treeNode.name + "," + treeNode.checked
//			+ "," + treeNode.pId);
//	console.log(JSON.stringify(treeNode));
}