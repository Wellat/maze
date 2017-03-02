package com.hemi.maze.web.dao;

import com.hemi.maze.web.model.CmsArticleType;
import com.hemi.maze.web.model.CmsArticleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleTypeMapper {
    int countByExample(CmsArticleTypeExample example);

    int deleteByExample(CmsArticleTypeExample example);

    int deleteByPrimaryKey(Integer tyid);

    int insert(CmsArticleType record);

    int insertSelective(CmsArticleType record);

    List<CmsArticleType> selectByExample(CmsArticleTypeExample example);

    CmsArticleType selectByPrimaryKey(Integer tyid);

    int updateByExampleSelective(@Param("record") CmsArticleType record, @Param("example") CmsArticleTypeExample example);

    int updateByExample(@Param("record") CmsArticleType record, @Param("example") CmsArticleTypeExample example);

    int updateByPrimaryKeySelective(CmsArticleType record);

    int updateByPrimaryKey(CmsArticleType record);
}