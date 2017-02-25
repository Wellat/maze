package com.hemi.maze.web.service.impl;

import com.hemi.maze.web.dao.SysRoleMapper;
import com.hemi.maze.web.dao.SysUserMapper;
import com.hemi.maze.web.dao.SysUserRoleMapper;
import com.hemi.maze.web.model.*;
import com.hemi.maze.web.service.TableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vanguard on 2016/12/27.
 */
@Service
public class TableServiceImpl implements TableService {
    @Resource
    SysUserMapper userMapper;

    @Resource
    SysRoleMapper roleMapper;

    @Resource
    SysUserRoleMapper userRoleMapper;

    /**
     *
     * @return
     */
    @Override
    public List<UserInfo> listUserInfo() {
        List<UserInfo> userInfoList = new ArrayList<UserInfo>();
        SysUserExample example = new SysUserExample();
        example.setDistinct(true);
        List<SysUser> userList = userMapper.selectByExample(example);
        for(SysUser user:userList){
            List<SysRole> roles = roleMapper.selectRolesByUserId(user.getId());
            SysRole role = roles.get(0);
            UserInfo userInfo = new UserInfo();
            userInfo.setInfo(user);
            userInfo.setRole(role);
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }

    @Override
    public int addUserAndRole(UserInfo userInfo) {
        SysUser user = userInfo.getInfo();
        SysUserRole userRole = userInfo.getUserRole();
        return (userMapper.insert(user) & userRoleMapper.insert(userRole));
    }
}
