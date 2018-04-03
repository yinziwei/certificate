package com.cnk.qiye.constant;

/**
 * 返回状态 常量类
 * @author 黄山
 *
 */
public enum StatusConstant {

	SUCCESS(1,"成功"),
	FAILD(0,"失败"),
	;
	
	private Integer code;
	
	private String msg;
	
	private StatusConstant() {
		// TODO Auto-generated constructor stub
	}

	private StatusConstant(Integer code, String msg) {
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
