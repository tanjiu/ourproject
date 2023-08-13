package com.i1314i.ourproject.po.shiro;

import java.io.Serializable;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-03 17:55
 **/
public class RoleDto extends Role implements Serializable {

	private static final long serialVersionUID = 4218495592167610193L;

	private List<Long> permissionIds;
	public List<Long> getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(List<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}
}
