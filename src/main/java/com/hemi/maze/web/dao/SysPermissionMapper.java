package com.hemi.maze.web.dao;


import com.hemi.maze.core.generic.GenericDao;
import com.hemi.maze.web.model.SysPermission;
import com.hemi.maze.web.model.SysPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionMapper extends GenericDao<SysPermission, String> {
    int countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    /**
     * 通过角色id 查询角色 拥有的权限
     * @param roleId
     * @return
     */
    List<SysPermission> selectPermissionsByRoleId(String roleId);
}