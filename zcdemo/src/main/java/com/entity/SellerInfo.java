package com.entity;

import java.util.Date;

public class SellerInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.id
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.username
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.password
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.openid
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.create_time
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.update_time
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_info.id
     *
     * @return the value of seller_info.id
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_info.id
     *
     * @param id the value for seller_info.id
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_info.username
     *
     * @return the value of seller_info.username
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_info.username
     *
     * @param username the value for seller_info.username
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_info.password
     *
     * @return the value of seller_info.password
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_info.password
     *
     * @param password the value for seller_info.password
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_info.openid
     *
     * @return the value of seller_info.openid
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_info.openid
     *
     * @param openid the value for seller_info.openid
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_info.create_time
     *
     * @return the value of seller_info.create_time
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_info.create_time
     *
     * @param createTime the value for seller_info.create_time
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_info.update_time
     *
     * @return the value of seller_info.update_time
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_info.update_time
     *
     * @param updateTime the value for seller_info.update_time
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}