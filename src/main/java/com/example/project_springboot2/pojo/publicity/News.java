package com.example.project_springboot2.pojo.publicity;

import lombok.Getter;

import java.util.Arrays;

/**
 * @author Zhuo
 */
@Getter
public class News {
    private Integer id;
    private Integer type;
    private String title;
    private String time;
    private String picture;
    private String website;
    private  String content;

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWebsite(String website) {this.website = website;}

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", website='" + website + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture +
                '}';
    }
}
