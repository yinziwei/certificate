package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 证书介绍详细表
 * @author 黄山
 *
 */
public class CIntroduce implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 简单介绍
     */
    private String introduceSmall;
    /**
     * 具体介绍
     */
    private String introduceBig;
    /**
     * 创建日期
     */
    private Date createdTime;
    /**
     * 修改日期
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroduceSmall() {
        return introduceSmall;
    }

    public void setIntroduceSmall(String introduceSmall) {
        this.introduceSmall = introduceSmall == null ? null : introduceSmall.trim();
    }

    public String getIntroduceBig() {
        return introduceBig;
    }

    public void setIntroduceBig(String introduceBig) {
        this.introduceBig = introduceBig == null ? null : introduceBig.trim();
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
}