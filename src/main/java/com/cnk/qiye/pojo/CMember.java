package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 前台会员用户表
 * @author 黄山
 *
 */
public class CMember implements Serializable{
	/**
	 * 主键
	 */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐加密
     */
    private String salt;
    /**
     * 昵称
     */
    private String nike;
    /**
     * 图片addr
     */
    private String photo;
    /**
     * 性别 true 男 false 女
     */
    private Boolean sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * QQ
     */
    private String qq;
    /**
     * 状态 true 可用
     */
    private Boolean status;
    /**
     * 专业
     */
    private Long majorId;
    /**
     * 学院
     */
    private Long collogeId;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getNike() {
        return nike;
    }

    public void setNike(String nike) {
        this.nike = nike == null ? null : nike.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Long getCollogeId() {
        return collogeId;
    }

    public void setCollogeId(Long collogeId) {
        this.collogeId = collogeId;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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