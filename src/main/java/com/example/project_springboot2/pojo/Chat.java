package com.example.project_springboot2.pojo;


import lombok.Data;
import lombok.Getter;

/**
 * @author Zhuo
 */
@Getter
@Data
public class Chat {
    String userId;
    String history;

    public Chat(String userId) {
        this.userId = userId;
        this.history = "";
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
