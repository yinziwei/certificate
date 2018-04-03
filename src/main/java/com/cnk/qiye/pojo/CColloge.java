package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 学院表
 * @author 黄山
 *
 */
public class CColloge implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 学院名称
     */
    private String collegeName;
    /**
     * 学院描述
     */
    private String collegeDesc;
    /**
     * 学院状态
     */
    private Boolean collegeStatus;
    /**
     * 排序，0最低
     */
    private Integer collegeSort;
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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegeDesc() {
        return collegeDesc;
    }

    public void setCollegeDesc(String collegeDesc) {
        this.collegeDesc = collegeDesc == null ? null : collegeDesc.trim();
    }

    public Boolean getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(Boolean collegeStatus) {
        this.collegeStatus = collegeStatus;
    }

    public Integer getCollegeSort() {
        return collegeSort;
    }

    public void setCollegeSort(Integer collegeSort) {
        this.collegeSort = collegeSort;
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