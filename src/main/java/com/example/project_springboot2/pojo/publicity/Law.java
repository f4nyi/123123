package com.example.project_springboot2.pojo.publicity;

import lombok.Getter;

/**
 * @author Zhuo
 */
@Getter
public class Law {
    private Integer id;
    private String name;
    private String piece;
    private String content;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Law{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", piece='" + piece + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
