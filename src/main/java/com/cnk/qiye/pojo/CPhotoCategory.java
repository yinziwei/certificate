package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片类目表
 * @author 黄山
 *
 */
public class CPhotoCategory implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 类目名称
     */
    private String photoCategoryName;
    /**
     * 类目描述
     */
    private String photoCategoryDesc;
    /**
     * 类目状态
     */
    private Boolean photoCategoryStatus;
    /**
     * 类目排序
     */
    private Integer photoCategorySort;
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

    public String getPhotoCategoryName() {
        return photoCategoryName;
    }

    public void setPhotoCategoryName(String photoCategoryName) {
        this.photoCategoryName = photoCategoryName == null ? null : photoCategoryName.trim();
    }

    public String getPhotoCategoryDesc() {
        return photoCategoryDesc;
    }

    public void setPhotoCategoryDesc(String photoCategoryDesc) {
        this.photoCategoryDesc = photoCategoryDesc == null ? null : photoCategoryDesc.trim();
    }

    public Boolean getPhotoCategoryStatus() {
        return photoCategoryStatus;
    }

    public void setPhotoCategoryStatus(Boolean photoCategoryStatus) {
        this.photoCategoryStatus = photoCategoryStatus;
    }

    public Integer getPhotoCategorySort() {
        return photoCategorySort;
    }

    public void setPhotoCategorySort(Integer photoCategorySort) {
        this.photoCategorySort = photoCategorySort;
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