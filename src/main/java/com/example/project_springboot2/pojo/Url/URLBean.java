package com.example.project_springboot2.pojo.Url;

import java.util.List;

public class URLBean<T> {
    private int code;
    private List<T> rows;
    private String text;

    public URLBean(int code, List<T> rows, String text) {
        this.code = code;
        this.rows = rows;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
