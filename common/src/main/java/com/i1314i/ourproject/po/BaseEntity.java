package com.i1314i.ourproject.po;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseEntity<ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = 2054813493011812469L;

	private ID id;
	private String createTime;
	private String updateTime;

	public BaseEntity() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.updateTime=sdf.format(new Date());
		this.createTime=sdf.format(new Date());
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeFormat(){
		return this.createTime;
	}

	public String getUpdateTimeFormat(){
		return this.updateTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
