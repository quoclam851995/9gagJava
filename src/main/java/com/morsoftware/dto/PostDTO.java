package com.morsoftware.dto;

import java.awt.*;
import java.util.Date;

public class PostDTO {
    private String title;
    private Date createTime;
    private Date updateTime;
    private Image image;
    private String author;
    private String category;

    public PostDTO(String title, Date createTime, Date updateTime, Image image, String author, String category) {
        this.title = title;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.image = image;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
