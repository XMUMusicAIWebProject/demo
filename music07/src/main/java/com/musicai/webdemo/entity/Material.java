package com.musicai.webdemo.entity;

import java.math.BigInteger;

public class Material {
    private BigInteger id;
    private BigInteger m_info_id;
    private Integer difficulty_level;
    private Integer pace;
    private String abc_head_file;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getM_info_id() {
        return m_info_id;
    }

    public void setM_info_id(BigInteger m_info_id) {
        this.m_info_id = m_info_id;
    }

    public Integer getDifficulty_level() {
        return difficulty_level;
    }

    public void setDifficulty_level(Integer difficulty_level) {
        this.difficulty_level = difficulty_level;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    public String getAbc_head_file() {
        return abc_head_file;
    }

    public void setAbc_head_file(String abc_head_file) {
        this.abc_head_file = abc_head_file;
    }
}
