package com.i1314i.ourproject.po.shiro;

import com.i1314i.ourproject.po.BaseEntity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-10-03 17:55
 **/
public class Role extends BaseEntity<Long> implements Serializable ,Comparable<Role> {

	private static final long serialVersionUID = -3802292814767103648L;

	private String name;

	private String description;

	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int compareTo(Role o) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(this.getUpdateTime());
			Date date1 = sdf.parse(o.getUpdateTime());
			if(date.getTime()<date1.getTime()){
				return 1;
			}else if(date.getTime()>date1.getTime()){
				return -1;
			}
		} catch (ParseException e) {
		}
		return 0;
	}
}
