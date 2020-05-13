package com.morsoftware.dto;

import java.awt.*;
import java.util.Date;

public class CategoriesDTO {
    private String name;
    private String title;
    private Image logo;
    private Date createTime;
    private Date updateTime;

    public CategoriesDTO(String name, String title, Image logo, Date createTime, Date updateTime) {
        this.name = name;
        this.title = title;
        this.logo = logo;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
