package com.hemi.maze.web.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Vanguard on 2016/12/27.
 */
public class UserInfo implements Serializable {
    private SysUser info;

    private SysRole role;

    private SysUserRole userRole;

    public SysUserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(SysUserRole userRole) {
        this.userRole = userRole;
    }

    public SysUser getInfo() {
        return info;
    }

    public void setInfo(SysUser info) {
        this.info = info;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }
}
