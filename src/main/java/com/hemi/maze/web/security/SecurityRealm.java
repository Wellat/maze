package com.hemi.maze.web.security;

import java.util.List;
import javax.annotation.Resource;

import com.hemi.maze.core.util.ApplicationUtils;
import com.hemi.maze.web.model.SysPermission;
import com.hemi.maze.web.model.SysRole;
import com.hemi.maze.web.model.SysUser;
import com.hemi.maze.web.service.PermissionService;
import com.hemi.maze.web.service.RoleService;
import com.hemi.maze.web.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;


/**
 * 用户身份验证,授权 Realm 组件
 *
 **/
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private PermissionService permissionService;

    /**
     * 登录验证
     * 认证信息,认证回调函数,登录时调用
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String usercode = String.valueOf(token.getPrincipal());
        String password = new String((char[]) token.getCredentials());
//        String password = new ApplicationUtils().md5Hex(pwd);

        // 通过数据库进行验证
        final SysUser authentication = userService.authentication(new SysUser(usercode, password));
        if (authentication == null) {
            throw new AuthenticationException("用户名或密码错误.");
        }

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(usercode, password, getName());

        return authenticationInfo;
    }


    /**
     * 权限检查 用于授权
     * 只有需要验证权限时才会调用, 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.在配有缓存的情况下，只加载一次.
     *
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String usercode = String.valueOf(principals.getPrimaryPrincipal());
        final SysUser user = userService.selectByUsercode(usercode);
        final List<SysRole> roleInfos = roleService.selectRolesByUserId(user.getId());
        for (SysRole role : roleInfos) {
            // 添加角色
            System.err.println(role);
            authorizationInfo.addRole(role.getId());
            System.out.println("----------securityRealm授权--角色---"+role.getName());
            final List<SysPermission> permissions = permissionService.selectPermissionsByRoleId(role.getId());
            for (SysPermission permission : permissions) {
                // 添加权限
                System.err.println(permission.getPercode());
                authorizationInfo.addStringPermission(permission.getPercode());
            }
        }
        return authorizationInfo;
    }

}
