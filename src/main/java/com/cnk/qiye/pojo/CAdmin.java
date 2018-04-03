package com.cnk.qiye.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台管理员
 * @author 黄山
 *
 */
public class CAdmin implements Serializable{
	/**
	 * id主键
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
     * 盐，随机6位字符
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
     * 性别，true:男 false:女
     */
    private Boolean sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮件
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * QQ号
     */
    private String qq;
    /**
     * 账户状态，true 可用 false不可用
     */
    private Boolean status;
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