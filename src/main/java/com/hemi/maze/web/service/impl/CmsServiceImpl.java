package com.hemi.maze.web.service.impl;

import com.hemi.maze.web.dao.CmsArticleMapper;
import com.hemi.maze.web.dao.CmsArticleTagMapper;
import com.hemi.maze.web.dao.CmsArticleTypeMapper;
import com.hemi.maze.web.model.CmsArticle;
import com.hemi.maze.web.model.CmsArticleTag;
import com.hemi.maze.web.model.CmsArticleType;
import com.hemi.maze.web.service.CmsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vanguard on 2017/2/27.
 */
@Service
public class CmsServiceImpl implements CmsService {
    @Resource
    private CmsArticleMapper articleMapper;

    @Resource
    private CmsArticleTagMapper tagMapper;

    @Resource
    private CmsArticleTypeMapper typeMapper;

    @Override
    public int addArticle(CmsArticle article) {
        System.out.println("--------CmsServiceImpl-----");
        return articleMapper.insert(article);
    }

    @Override
    public int updateArticleByKey(CmsArticle article) {
        return articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public List<CmsArticleTag> getAllTags() {
        return tagMapper.selectByExample(null);
    }

    @Override
    public List<CmsArticle> getAllArticle() {
        System.out.println("--------CmsServiceImpl-----");
        return articleMapper.selectByExampleWithBLOBs(null);
    }

    @Override
    public String getTypeByKey(int key) {
        CmsArticleType type = typeMapper.selectByPrimaryKey(key);
        return type.getTyname();
    }

    @Override
    public CmsArticle getArticleByKey(int key) {
        return articleMapper.selectByPrimaryKey(key);
    }

    @Override
    public String getTagByKey(int key) {
        CmsArticleTag tags = tagMapper.selectByPrimaryKey(key);
        return tags.getTname();
    }
}
