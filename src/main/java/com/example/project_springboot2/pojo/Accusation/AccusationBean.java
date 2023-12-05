package com.example.project_springboot2.pojo.Accusation;

import java.util.List;

public class AccusationBean {
    private int code;
    private List<Accusation> rows;


    public AccusationBean(int code, List<Accusation> rows) {
        this.code = code;
        this.rows = rows;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public List<Accusation> getRows() {
        return rows;
    }

    public void setRows(List<Accusation> rows) {
        this.rows = rows;
    }
}

