package com.musicai.webdemo.entity;

import java.math.BigInteger;
import java.util.Date;

public class Promark {
    private BigInteger id;
    private BigInteger pro_id;
    private BigInteger record_id;
    private Integer has_rated;
    private Date datetime;
    private Date rate_time;
    private String wrong_info;
    private Integer beat_score;
    private Integer intonation_score;
    private Integer timbre_score;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getPro_id() {
        return pro_id;
    }

    public void setPro_id(BigInteger pro_id) {
        this.pro_id = pro_id;
    }

    public BigInteger getRecord_id() {
        return record_id;
    }

    public void setRecord_id(BigInteger record_id) {
        this.record_id = record_id;
    }

    public Integer getHas_rated() {
        return has_rated;
    }

    public void setHas_rated(Integer has_rated) {
        this.has_rated = has_rated;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getRate_time() {
        return rate_time;
    }

    public void setRate_time(Date rate_time) {
        this.rate_time = rate_time;
    }

    public String getWrong_info() {
        return wrong_info;
    }

    public void setWrong_info(String wrong_info) {
        this.wrong_info = wrong_info;
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

    public Integer getTimbre_score() {
        return timbre_score;
    }

    public void setTimbre_score(Integer timbre_score) {
        this.timbre_score = timbre_score;
    }
}
