package com.example.project_springboot2.pojo.Intelligence;

public class IntelligenceWebClassification {
    private Integer id;
    private Integer classification;

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

    @Override
    public String toString() {
        return "IntelligenceWebClassificationDao{" +
                "id=" + id +
                ", classification=" + classification +
                '}';
    }
}
