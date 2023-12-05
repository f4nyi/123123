package com.example.project_springboot2.pojo.Url;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class WhiteURL {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WhiteURL(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WhiteURL{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
