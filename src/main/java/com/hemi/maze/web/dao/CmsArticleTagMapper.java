package com.hemi.maze.web.dao;

import com.hemi.maze.web.model.CmsArticleTag;
import com.hemi.maze.web.model.CmsArticleTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleTagMapper {
    int countByExample(CmsArticleTagExample example);

    int deleteByExample(CmsArticleTagExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(CmsArticleTag record);

    int insertSelective(CmsArticleTag record);

    List<CmsArticleTag> selectByExample(CmsArticleTagExample example);

    CmsArticleTag selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") CmsArticleTag record, @Param("example") CmsArticleTagExample example);

    int updateByExample(@Param("record") CmsArticleTag record, @Param("example") CmsArticleTagExample example);

    int updateByPrimaryKeySelective(CmsArticleTag record);

    int updateByPrimaryKey(CmsArticleTag record);
}