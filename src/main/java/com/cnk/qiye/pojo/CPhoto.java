package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片表
 * @author 黄山
 *
 */
public class CPhoto implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 图片类目id
     */
    private Long photoCategoryId;
    /**
     * 图片高度
     */
    private Integer photoHeight;
    /**
     * 图片宽度
     */
    private Integer photoWidth;
    /**
     * 图片标题
     */
    private String photoTitle;
    /**
     * 图片描述
     */
    private String photoDesc;
    /**
     * 图片链接
     */
    private String photoHref;
    /**
     * 图片地址
     */
    private String photoAddr;
    /**
     * 图片排序 0最低
     */
    private Integer photoSort;
    /**
     * 图片状态 true 可用
     */
    private Boolean photoStatus;
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

    public Long getPhotoCategoryId() {
        return photoCategoryId;
    }

    public void setPhotoCategoryId(Long photoCategoryId) {
        this.photoCategoryId = photoCategoryId;
    }

    public Integer getPhotoHeight() {
        return photoHeight;
    }

    public void setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
    }

    public Integer getPhotoWidth() {
        return photoWidth;
    }

    public void setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
    }

    public String getPhotoTitle() {
        return photoTitle;
    }

    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle == null ? null : photoTitle.trim();
    }

    public String getPhotoDesc() {
        return photoDesc;
    }

    public void setPhotoDesc(String photoDesc) {
        this.photoDesc = photoDesc == null ? null : photoDesc.trim();
    }

    public String getPhotoHref() {
        return photoHref;
    }

    public void setPhotoHref(String photoHref) {
        this.photoHref = photoHref == null ? null : photoHref.trim();
    }

    public String getPhotoAddr() {
        return photoAddr;
    }

    public void setPhotoAddr(String photoAddr) {
        this.photoAddr = photoAddr == null ? null : photoAddr.trim();
    }

    public Integer getPhotoSort() {
        return photoSort;
    }

    public void setPhotoSort(Integer photoSort) {
        this.photoSort = photoSort;
    }

    public Boolean getPhotoStatus() {
        return photoStatus;
    }

    public void setPhotoStatus(Boolean photoStatus) {
        this.photoStatus = photoStatus;
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