package com.hemi.maze.web.dao;


import com.hemi.maze.core.feature.orm.mybatis.Page;
import com.hemi.maze.core.generic.GenericDao;
import com.hemi.maze.web.model.SysUser;
import com.hemi.maze.web.model.SysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper extends GenericDao<SysUser, String> {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 用户登录验证查询
     * @param record
     * @return
     */
    SysUser authentication(@Param("record") SysUser record);

    /**
     * 分页条件查询
     *
     * @param page
     * @param example
     * @return
     */
    List<SysUser> selectByExampleAndPage(Page<SysUser> page, SysUserExample example);

}