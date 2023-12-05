package com.example.project_springboot2.pojo.Intelligence;

public class IntelligenceIP {
    private Integer id;
    private String IP;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public String toString() {
        return "IntelligenceIP{" +
                "id=" + id +
                ", IP='" + IP + '\'' +
                '}';
    }
}
