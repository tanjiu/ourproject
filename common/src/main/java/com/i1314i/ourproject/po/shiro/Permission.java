package com.i1314i.ourproject.po.shiro;

import com.i1314i.ourproject.po.BaseEntity;

import java.io.Serializable;
import java.util.List;


/**
 * @author 平行时空
 * @created 2018-10-03 17:55
 **/
public class Permission extends BaseEntity<Long> implements Serializable {

	private static final long serialVersionUID = 6180869216498363919L;

	private Long parentId;
	private String name;
	private String css;
	private String href;
	private Integer type;
	private String permission;
	private Integer sort;

	private List<Permission> child;

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public List<Permission> getChild() {
		return child;
	}

	public void setChild(List<Permission> child) {
		this.child = child;
	}


}
