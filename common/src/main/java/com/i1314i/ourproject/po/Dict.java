package com.i1314i.ourproject.po;

public class Dict extends BaseEntity<Long> {

	private static final long serialVersionUID = -2431140186410912787L;
	private String type;
	private String k;
	private String val;


	private Integer currentPage = 1;
	// 每页显示的总条数
	private Integer pageSize = 10;



	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
