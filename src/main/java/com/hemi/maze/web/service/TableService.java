package com.hemi.maze.web.service;

import com.hemi.maze.web.model.UserInfo;

import java.util.List;

/**
 * 表格业务接口
 * Created by Vanguard on 2016/12/27.
 */
public interface TableService {
    /**
     * 查询所有用户
     * @return
     */
    List<UserInfo> listUserInfo();

    /**
     * 添加用户
     * @return
     */
    int addUserAndRole(UserInfo userInfo);

}
