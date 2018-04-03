package com.cnk.qiye.common;

import java.io.Serializable;

/**
 * 统一返回结果类
 * @author 黄山
 *
 */
public class CommonResult implements Serializable{
	/**
	 * 返回的状态码  1成功 0失败
	 */
	private Integer code;
	/**
	 * 返回的信息
	 */
	private String msg;
	/**
	 * 返回的对象 包装到这里面
	 */
	private Object data;
	
	public CommonResult() {
		// TODO Auto-generated constructor stub
	}

	public CommonResult(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
