package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 专业表
 * @author 黄山
 *
 */
public class CMajor implements Serializable{
	/**
	 * 主键id
	 */
    private Long id;
    /**
     * 专业名称
     */
    private String majorName;
    /**
     * 专业描述
     */
    private String majorDesc;
    /**
     * 专业状态
     */
    private Boolean majorStatus;
    /**
     * 专业排序，0最低
     */
    private Integer majorSort;
    /**
     * 学院id
     */
    private Long collogeId;
    /**
     * 创建日期
     */
    private Date createdTime;
    /**
     * 修改日期
     */
    private Date updateTime;
    /**
     * 创建人
     */
    private String createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getMajorDesc() {
        return majorDesc;
    }

    public void setMajorDesc(String majorDesc) {
        this.majorDesc = majorDesc == null ? null : majorDesc.trim();
    }

    public Boolean getMajorStatus() {
        return majorStatus;
    }

    public void setMajorStatus(Boolean majorStatus) {
        this.majorStatus = majorStatus;
    }

    public Integer getMajorSort() {
        return majorSort;
    }

    public void setMajorSort(Integer majorSort) {
        this.majorSort = majorSort;
    }

    public Long getCollogeId() {
        return collogeId;
    }

    public void setCollogeId(Long collogeId) {
        this.collogeId = collogeId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }
}