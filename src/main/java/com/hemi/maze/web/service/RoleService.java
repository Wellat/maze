package com.hemi.maze.web.service;


import com.hemi.maze.core.generic.GenericService;
import com.hemi.maze.web.model.SysRole;

import java.util.List;

/**
 * 角色 业务接口
 * Created by Vanguard on 2016/12/20.
 */
public interface RoleService extends GenericService<SysRole,String> {
    /**
     * 通过用户id 查询用户拥有的角色
     * @param userId
     * @return
     */
    List<SysRole> selectRolesByUserId(String userId);
}
