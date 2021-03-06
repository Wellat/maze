package com.hemi.maze.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制器,返回jsp视图给前端
 *
 **/
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
        System.out.println("--------------------/page/login-----------------------");
        return "login";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }
    /**
     * test
     */
    @RequestMapping("/test")
    public String testfile() { return "test"; }
    /**
     * echart图表
     */
    @RequestMapping("/echart")
    public String showCharts() { return "showcharts"; }
    /**
     * 新建文章
     */
    @RequestMapping("/addArticle")
    public String addArticle() { return "articleAdd"; }
}