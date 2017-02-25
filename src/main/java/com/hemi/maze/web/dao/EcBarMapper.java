package com.hemi.maze.web.dao;


import com.hemi.maze.web.model.EcBar;
import com.hemi.maze.web.model.EcBarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EcBarMapper {
    int countByExample(EcBarExample example);

    int deleteByExample(EcBarExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(EcBar record);

    int insertSelective(EcBar record);

    List<EcBar> selectByExample(EcBarExample example);

    EcBar selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") EcBar record, @Param("example") EcBarExample example);

    int updateByExample(@Param("record") EcBar record, @Param("example") EcBarExample example);

    int updateByPrimaryKeySelective(EcBar record);

    int updateByPrimaryKey(EcBar record);

    /**
     * 列出所有数据
     * @return
     */
    List<EcBar> selectAll();
}