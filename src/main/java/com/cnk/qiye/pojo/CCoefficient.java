package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 证书难度表
 * @author 黄山
 *
 */
public class CCoefficient implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 难度类型 0最简单 依次递增
     */
    private Integer coefficientType;
    /**
     * 难度描述
     */
    private String coefficientDesc;
    /**
     * 难度状态 true 可用
     */
    private Byte coefficientStatus;
    /**
     * 创建日期
     */
    private Date createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCoefficientType() {
        return coefficientType;
    }

    public void setCoefficientType(Integer coefficientType) {
        this.coefficientType = coefficientType;
    }

    public String getCoefficientDesc() {
        return coefficientDesc;
    }

    public void setCoefficientDesc(String coefficientDesc) {
        this.coefficientDesc = coefficientDesc == null ? null : coefficientDesc.trim();
    }

    public Byte getCoefficientStatus() {
        return coefficientStatus;
    }

    public void setCoefficientStatus(Byte coefficientStatus) {
        this.coefficientStatus = coefficientStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}