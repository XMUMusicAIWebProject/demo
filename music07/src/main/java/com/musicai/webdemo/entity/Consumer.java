package com.musicai.webdemo.entity;

import java.math.BigInteger;

public class Consumer {
    private BigInteger id;
    private String account;
    private String name;
    private String gender;
    private Integer age;
    private String email;
    private Integer limit_level;
    private String introduction;
    private BigInteger points;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public Integer getLimit_level() {
        return limit_level;
    }

    public void setLimit_level(Integer limit_level) {
        this.limit_level = limit_level;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public BigInteger getPoints() {
        return points;
    }

    public void setPoints(BigInteger points) {
        this.points = points;
    }
}
