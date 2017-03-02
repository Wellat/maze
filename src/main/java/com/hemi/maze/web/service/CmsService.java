package com.hemi.maze.web.service;

import com.hemi.maze.web.model.CmsArticle;
import com.hemi.maze.web.model.CmsArticleTag;

import java.util.List;

/**
 * Created by Vanguard on 2017/2/27.
 */
public interface CmsService {
    int addArticle(CmsArticle article);
    int updateArticleByKey(CmsArticle article);

    CmsArticle getArticleByKey(int key);

    List<CmsArticleTag> getAllTags();

    List<CmsArticle> getAllArticle();

    String getTagByKey(int key);

    String getTypeByKey(int key);
}
