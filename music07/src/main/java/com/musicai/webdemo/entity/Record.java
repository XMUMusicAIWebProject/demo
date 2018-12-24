package com.musicai.webdemo.entity;

import java.math.BigInteger;
import java.util.Date;

public class Record {
    private BigInteger id;
    private BigInteger material_id;
    private BigInteger user_id;
    private String record;
    private Integer beat_score;
    private Integer intonation_score;
    private Integer total_score;
    private String wrong_info_picture;
    private Date time;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(BigInteger material_id) {
        this.material_id = material_id;
    }

    public BigInteger getUser_id() {
        return user_id;
    }

    public void setUser_id(BigInteger user_id) {
        this.user_id = user_id;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getBeat_score() {
        return beat_score;
    }

    public void setBeat_score(Integer beat_score) {
        this.beat_score = beat_score;
    }

    public Integer getIntonation_score() {
        return intonation_score;
    }

    public void setIntonation_score(Integer intonation_score) {
        this.intonation_score = intonation_score;
    }

    public Integer getTotal_score() {
        return total_score;
    }

    public void setTotal_score(Integer total_score) {
        this.total_score = total_score;
    }

    public String getWrong_info_picture() {
        return wrong_info_picture;
    }

    public void setWrong_info_picture(String wrong_info_picture) {
        this.wrong_info_picture = wrong_info_picture;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
