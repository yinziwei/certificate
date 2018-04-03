package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 证书类
 * @author 黄山
 *
 */
public class CCertificate implements Serializable{
	/**
	 * 主键id 递增，并不是证书唯一id
	 */
    private Long id;
    /**
     * 证书唯一id，采用当前时间长整型+2位随机数生成
     */
    private Long certificateId;
    /**
     * 证书标题
     */
    private String certificateTitle;
    /**
     * 证书介绍关联id
     */
    private Long certificateIntroduceId;
    /**
     * 证书热度关联id
     */
    private Long certificateHotId;
    /**
     * 证书难度关联id
     */
    private Long certificateCoefficientId;
    /**
     * 证书图片
     */
    private String certificatePhoto;
    /**
     * 证书关联学院id
     */
    private Long certificateCollogeId;
    /**
     * 证书关联专业id
     */
    private Long certificateMajorId;
    /**
     * 证书搜索关键字
     */
    private String certificateSearch;
    /**
     * 证书状态 true 可用 false 不可用
     */
    private Boolean certificateStatus;
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
    /**
     * 修改人
     */
    private String updateBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateTitle() {
        return certificateTitle;
    }

    public void setCertificateTitle(String certificateTitle) {
        this.certificateTitle = certificateTitle == null ? null : certificateTitle.trim();
    }

    public Long getCertificateIntroduceId() {
        return certificateIntroduceId;
    }

    public void setCertificateIntroduceId(Long certificateIntroduceId) {
        this.certificateIntroduceId = certificateIntroduceId;
    }

    public Long getCertificateHotId() {
        return certificateHotId;
    }

    public void setCertificateHotId(Long certificateHotId) {
        this.certificateHotId = certificateHotId;
    }

    public Long getCertificateCoefficientId() {
        return certificateCoefficientId;
    }

    public void setCertificateCoefficientId(Long certificateCoefficientId) {
        this.certificateCoefficientId = certificateCoefficientId;
    }

    public String getCertificatePhoto() {
        return certificatePhoto;
    }

    public void setCertificatePhoto(String certificatePhoto) {
        this.certificatePhoto = certificatePhoto == null ? null : certificatePhoto.trim();
    }

    public Long getCertificateCollogeId() {
        return certificateCollogeId;
    }

    public void setCertificateCollogeId(Long certificateCollogeId) {
        this.certificateCollogeId = certificateCollogeId;
    }

    public Long getCertificateMajorId() {
        return certificateMajorId;
    }

    public void setCertificateMajorId(Long certificateMajorId) {
        this.certificateMajorId = certificateMajorId;
    }

    public String getCertificateSearch() {
        return certificateSearch;
    }

    public void setCertificateSearch(String certificateSearch) {
        this.certificateSearch = certificateSearch == null ? null : certificateSearch.trim();
    }

    public Boolean getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(Boolean certificateStatus) {
        this.certificateStatus = certificateStatus;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}