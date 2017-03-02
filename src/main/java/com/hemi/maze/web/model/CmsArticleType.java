package com.hemi.maze.web.model;

public class CmsArticleType {
    private Integer tyid;

    private String tyname;

    public Integer getTyid() {
        return tyid;
    }

    public void setTyid(Integer tyid) {
        this.tyid = tyid;
    }

    public String getTyname() {
        return tyname;
    }

    public void setTyname(String tyname) {
        this.tyname = tyname == null ? null : tyname.trim();
    }
}