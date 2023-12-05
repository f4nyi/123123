package com.example.project_springboot2.pojo.publicity;

import java.util.Arrays;

public class Summary {

    private Integer id;
    private Integer type;
    private String title;
    private String picture;
    private String summary;
    private String skill;
    private String example;
    private String tips;
    public String[] type_names={"购物消费","婚恋交友","假冒身份","钓鱼网站","冒充公检法","平台诈骗","招聘兼职","杀猪盘","博彩赌博","信贷理财","刷单诈骗","中奖诈骗"};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", picture='" + picture + '\'' +
                ", summary='" + summary + '\'' +
                ", skill='" + skill + '\'' +
                ", example='" + example + '\'' +
                ", tips='" + tips + '\'' +
                ", type_names=" + Arrays.toString(type_names) +
                '}';
    }
}
