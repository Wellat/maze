package com.hemi.maze.web.service.impl;

import com.hemi.maze.core.generic.GenericDao;
import com.hemi.maze.core.generic.GenericServiceImpl;
import com.hemi.maze.web.dao.SysPermissionMapper;
import com.hemi.maze.web.model.SysPermission;
import com.hemi.maze.web.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vanguard on 2016/12/20.
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<SysPermission,String> implements PermissionService {
    @Resource
    private SysPermissionMapper permissionMapper;

    @Override
    public GenericDao<SysPermission, String> getDao() {
        return permissionMapper;
    }

    /**
     *
     * 根据角色Id 查询权限
     * @param roleId
     * @return
     */
    @Override
    public List<SysPermission> selectPermissionsByRoleId(String roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }

}
