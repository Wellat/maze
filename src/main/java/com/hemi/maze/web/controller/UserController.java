package com.hemi.maze.web.controller;


import com.hemi.maze.web.model.ActiveUser;
import com.hemi.maze.web.model.SysPermission;
import com.hemi.maze.web.model.SysUser;
import com.hemi.maze.web.security.PermissionSign;
import com.hemi.maze.web.security.RoleSign;
import com.hemi.maze.web.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户控制器
 * Created by Vanguard on 2016/12/21.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;
    /**
     * 用户登录
     *
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid SysUser user, BindingResult result, Model model, HttpServletRequest request) {
        try {
            Subject subject = SecurityUtils.getSubject();
            // 已登陆则 跳到首页
            if (subject.isAuthenticated()) {
                System.out.println("-----UC---已登录---");
                return "index";//"redirect:/";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "login";
            }

            // 身份验证----表单的username对于SysUser中usercode
            subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));

            // 验证成功在Session中保存用户信息
            final SysUser authUserInfo = userService.selectByUsercode(user.getUsername());
            System.out.println("-------UC-psw---"+authUserInfo.getPassword());
            //根据用户id查权限及菜单
            ActiveUser activeUser = new ActiveUser();
            String userId = authUserInfo.getId();
            List<SysPermission> resultList = userService.findMenuListByUserId(userId);
            List<SysPermission> permissions = userService.findMenuListByUserId(userId);

            activeUser.setUserid(userId);//id
            activeUser.setUsername(authUserInfo.getUsername());
            activeUser.setMenus(resultList);
            activeUser.setPermissions(permissions);
            activeUser.setUsercode(authUserInfo.getUsercode());//登陆账号

            request.getSession().setAttribute("userInfo", activeUser);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "login";
        }
        return "index";
    }

    /**
     * 用户登出
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        // 登出操作
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    /**
     * 基于权限标识的权限控制案例
     */
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionSign.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }

}
