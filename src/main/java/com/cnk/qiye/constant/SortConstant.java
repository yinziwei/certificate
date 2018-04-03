package com.cnk.qiye.constant;

/**
 * 排序常量
 * @author 黄山
 *
 */
public enum SortConstant {

	LOW(0,"低"),
	MID(1,"中"),
	HIGH(2,"高");
	
	private Integer code;
	
	private String msg;
	
	private SortConstant() {
		// TODO Auto-generated constructor stub
	}

	private SortConstant(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
