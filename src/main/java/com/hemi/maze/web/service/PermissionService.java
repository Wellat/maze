package com.hemi.maze.web.service;


import com.hemi.maze.core.generic.GenericService;
import com.hemi.maze.web.model.SysPermission;

import java.util.List;

/**
 * Created by Vanguard on 2016/12/20.
 */
public interface PermissionService extends GenericService<SysPermission,String> {
   /**
    * 根据角色id查询permission
    * @param roleId
    * @return
    */
   List<SysPermission> selectPermissionsByRoleId(String roleId);

}
