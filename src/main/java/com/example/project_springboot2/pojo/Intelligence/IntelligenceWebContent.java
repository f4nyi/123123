package com.example.project_springboot2.pojo.Intelligence;

public class IntelligenceWebContent {
    private Integer id;
    private Integer classification;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "IntelligenceWebContent{" +
                "id=" + id +
                ", classification=" + classification +
                ", content='" + content + '\'' +
                '}';
    }
}
