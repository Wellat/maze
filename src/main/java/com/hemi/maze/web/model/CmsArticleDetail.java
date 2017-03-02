package com.hemi.maze.web.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vanguard on 2017/3/1.
 */
public class CmsArticleDetail {
    public CmsArticle baseArticle;
    private List<String> tags;
    private String times;
    private String atype;

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public CmsArticleDetail() {
        this.tags = new ArrayList<String>();
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public CmsArticle getBaseArticle() {
        return baseArticle;
    }

    public void setBaseArticle(CmsArticle baseArticle) {
        this.baseArticle = baseArticle;
    }
}
