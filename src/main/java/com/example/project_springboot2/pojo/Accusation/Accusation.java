package com.example.project_springboot2.pojo.Accusation;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Accusation {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String url;
    private String type;
    private String reason;
    @JsonProperty("date")
    private String timeChuo;

    public String getTimeChuo() {
        return timeChuo;
    }

    public void setTimeChuo(String timeChuo) {
        this.timeChuo = timeChuo;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Accusation(String url, String type, String reason, String timeChuo) {
        this.url = url;
        this.type = type;
        this.reason = reason;
        this.timeChuo = timeChuo;
    }


    @Override
    public String toString() {
        return "Accusation{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", reason='" + reason + '\'' +
                ", timeChuo='" + timeChuo + '\'' +
                '}';
    }
}
