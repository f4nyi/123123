package com.example.project_springboot2.pojo.CheatWebsite;

import java.util.List;

public class CheatWebsiteBean<T> {
    private int totalCount;
    private List<T> rows;

    public CheatWebsiteBean(int totalCount, List<T> rows) {
        this.totalCount = totalCount;
        this.rows = rows;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
