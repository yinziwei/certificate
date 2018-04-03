package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 热度表
 * @author 黄山
 *
 */
public class CHot implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 热度类型
     */
    private Integer hotType;
    /**
     * 热度描述
     */
    private String hotDesc;
    /**
     * 热度状态
     */
    private Byte hotStatus;
    /**
     * 创建时间
     */
    private Date createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHotType() {
        return hotType;
    }

    public void setHotType(Integer hotType) {
        this.hotType = hotType;
    }

    public String getHotDesc() {
        return hotDesc;
    }

    public void setHotDesc(String hotDesc) {
        this.hotDesc = hotDesc == null ? null : hotDesc.trim();
    }

    public Byte getHotStatus() {
        return hotStatus;
    }

    public void setHotStatus(Byte hotStatus) {
        this.hotStatus = hotStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}