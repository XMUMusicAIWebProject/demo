package com.musicai.webdemo.entity;

import java.math.BigInteger;

public class MaterialInfo {
    private BigInteger id;
    private String name;
    private String type;
    private String abc_file;
    private String information;
    private String material_picture;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbc_file() {
        return abc_file;
    }

    public void setAbc_file(String abc_file) {
        this.abc_file = abc_file;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getMaterial_picture() {
        return material_picture;
    }

    public void setMaterial_picture(String material_picture) {
        this.material_picture = material_picture;
    }
}
