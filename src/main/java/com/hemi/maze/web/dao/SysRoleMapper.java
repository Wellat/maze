package com.hemi.maze.web.dao;


import com.hemi.maze.core.generic.GenericDao;
import com.hemi.maze.web.model.SysRole;
import com.hemi.maze.web.model.SysRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMapper extends GenericDao<SysRole,String> {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    /**
     * 通过用户id 查询用户拥有的角色
     * @param userId
     * @return
     */
    List<SysRole> selectRolesByUserId(String userId);
}