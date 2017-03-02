package com.hemi.maze.web.controller;

import com.hemi.maze.core.util.ApplicationUtils;
import com.hemi.maze.web.model.SysUser;
import com.hemi.maze.web.model.SysUserRole;
import com.hemi.maze.web.model.UserInfo;
import com.hemi.maze.web.service.TableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 表单控制器
 *
 **/
@Controller
@RequestMapping("/form")
public class FormController {
    @Resource
    TableService tableService;

    @RequestMapping("/userManage")
    public String userManage(HttpServletRequest request){

        List<UserInfo> userInfos = tableService.listUserInfo();
        if(userInfos != null && userInfos.size() != 0){
            request.getSession().setAttribute("userManage",userInfos);
        }
        return "userManage";
    }

    @RequestMapping("/addUser")
    public Object addUser(SysUser user, HttpServletRequest request){
        System.out.println("-----------addUserController----------------");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        UserInfo userInfo = new UserInfo();
        SysUserRole userRole = new SysUserRole();
        ApplicationUtils utils = new ApplicationUtils();
        String pwd = user.getPassword();
//        String newpwd = utils.md5Hex(pwd);
        user.setPassword(pwd);
        user.setId("u-"+utils.randomUUID().substring(24));
        user.setSalt(utils.randomUUID().substring(1,6));
        user.setLocked("1");
        String roleId = request.getParameter("role");
        userRole.setId("ur-"+utils.randomUUID().substring(24));
        userRole.setSysUserId(user.getId());
        userRole.setSysRoleId(roleId);
        userInfo.setInfo(user);
        userInfo.setUserRole(userRole);
        if(tableService.addUserAndRole(userInfo) == 1){
            resultMap.put("ret", "success");
            resultMap.put("msg", "保存成功!");
        }else{
            resultMap.put("ret", "error");
            resultMap.put("msg", "保存失败!");
        }
        return resultMap;
    }

    @RequestMapping("/tableTemplate")
    public String showTables(){
        return "tableTemplate";
    }
}