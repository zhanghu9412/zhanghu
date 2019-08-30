package com.company.project.model;

import javax.persistence.*;

public class User {
    /**
     * 用户测试表
     */
    @Id
    private Integer userid;

    private String username;

    private String sex;

    private Integer age;

    private String address;

    /**
     * 获取用户测试表
     *
     * @return userid - 用户测试表
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户测试表
     *
     * @param userid 用户测试表
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}