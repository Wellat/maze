package com.hemi.maze.web.dao;


import com.hemi.maze.web.model.DictVo;
import com.hemi.maze.web.model.EcFunnel;
import com.hemi.maze.web.model.EcFunnelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EcFunnelMapper {
    int countByExample(EcFunnelExample example);

    int deleteByExample(EcFunnelExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(EcFunnel record);

    int insertSelective(EcFunnel record);

    List<EcFunnel> selectByExample(EcFunnelExample example);

    EcFunnel selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") EcFunnel record, @Param("example") EcFunnelExample example);

    int updateByExample(@Param("record") EcFunnel record, @Param("example") EcFunnelExample example);

    int updateByPrimaryKeySelective(EcFunnel record);

    int updateByPrimaryKey(EcFunnel record);

    /**
     * 查询所有
     * @return
     */
    List<DictVo> findNameAndValue();
}