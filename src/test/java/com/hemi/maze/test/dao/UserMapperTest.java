package com.hemi.maze.test.dao;

import java.util.List;
import javax.annotation.Resource;

import com.hemi.maze.core.feature.test.TestSupport;

import com.hemi.maze.core.feature.orm.mybatis.Page;
import com.hemi.maze.web.dao.SysRoleMapper;
import com.hemi.maze.web.dao.SysUserMapper;
import com.hemi.maze.web.model.SysRole;
import com.hemi.maze.web.model.SysUser;
import com.hemi.maze.web.model.SysUserExample;
import com.hemi.maze.web.model.UserInfo;
import org.junit.Test;

public class UserMapperTest extends TestSupport {
    @Resource
    SysUserMapper userMapper;
    @Resource
    SysRoleMapper roleMapper;

    @Test
    public void testUserInfo() {
        SysUserExample example = new SysUserExample();
        example.setDistinct(true);
        List<SysUser> userList = userMapper.selectByExample(example);
        for (SysUser user : userList) {
            List<SysRole> roles = roleMapper.selectRolesByUserId(user.getId());
            SysRole role = roles.get(0);
            UserInfo userInfo = new UserInfo();
            userInfo.setInfo(user);
            userInfo.setRole(role);
            System.out.println("======username:"+userInfo.getInfo().getUsername()+"ddd"+userInfo.getRole().getName());
        }
    }
//    @Resource
//    private SysUserMapper userMapper;

//    @Test
//    public void test_selectByExampleAndPage() {
/*        start();
        Page<SysUser> page = new Page<>(1, 3);
        SysUserExample example = new SysUserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<SysUser> users = userMapper.selectByExampleAndPage(page, example);
        for (SysUser user : users) {
            System.err.println(user);
        }
        end();*/
//    }
}
