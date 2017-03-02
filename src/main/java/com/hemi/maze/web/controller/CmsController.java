package com.hemi.maze.web.controller;

import com.hemi.maze.web.model.CmsArticle;
import com.hemi.maze.web.model.CmsArticleDetail;
import com.hemi.maze.web.model.CmsArticleTag;
import com.hemi.maze.web.service.CmsService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by Vanguard on 2017/2/27.
 */
@Controller
@RequestMapping(value = "/cms")
public class CmsController {
    @Resource
    private CmsService cmsService;

    @RequestMapping(value = "/listArticle")
    public String listArticle(HttpServletRequest request) {
        System.out.println("---------listArticle-----");
        //标题，时间，是否发布，编辑，删除
        List<CmsArticle> articleLists = cmsService.getAllArticle();
        List<CmsArticleDetail> articleList = new ArrayList<CmsArticleDetail>();

        for (CmsArticle article : articleLists) {
            //克隆结果
            CmsArticleDetail articleTableTemp = new CmsArticleDetail();
            try {
                articleTableTemp.setBaseArticle((CmsArticle) article.clone());
            } catch (Exception e) {
                e.printStackTrace();
            }

            //取文章类别
            if(article.getTypeid() != null){
                String atype = cmsService.getTypeByKey(article.getTypeid());
                articleTableTemp.setAtype(atype);
            }
            //待加处理时间
            //...
            articleList.add(articleTableTemp);
        }

        request.getSession().setAttribute("articleList",articleList);
        return "articleManage";
    }

    @RequestMapping(value = "/getArticle", method = RequestMethod.GET)
    public String getArticle(int key, HttpServletRequest request){
        System.out.println("------------getArticleController---"+key);
        CmsArticleDetail detail = new CmsArticleDetail();
        CmsArticle article = cmsService.getArticleByKey(key);
        try {
            detail.setBaseArticle((CmsArticle) article.clone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //取标签
        String tags = article.getTagid();
        String[] tag = tags.split("-");
        String tagTemp;
        for (String t : tag) {
            if (!t.equals("") && t != null) {
                tagTemp = cmsService.getTagByKey(Integer.valueOf(t));
                detail.getTags().add(tagTemp);
            }
        }
        //所有标签
        List<CmsArticleTag> allTags = cmsService.getAllTags();
        request.getSession().setAttribute("tags", allTags);
        request.getSession().setAttribute("ada",detail);
        return "articleEdit";
    }

    @RequestMapping(value = "/listTags")
    public String listTag(HttpServletRequest request) {
        System.out.println("------------listTagsController------");
        List<CmsArticleTag> tags = cmsService.getAllTags();
        request.getSession().setAttribute("tags", tags);
        return "articleAdd";
    }

    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public String insertArticle(CmsArticle article, HttpServletRequest request) {
        System.out.println("------------addArticleController------");
        Map<String, String> map = new HashMap<String, String>();

        String[] tagids = request.getParameterValues("tagid");
        String temp = "-";
        for (String tagid : tagids) {
            temp = temp + tagid + "-";
        }
        article.setTagid(temp);

        article.setAuthor(request.getParameter("userId"));
        System.out.println("------------CmsController--author----" + article.getAuthor());
        Date date = new Date();
        article.setCreateTime(date);

        if (cmsService.addArticle(article) == 1) {
            map.put("ret", "success");
            map.put("msg", "保存成功!");
            return "test";
        } else {
            map.put("ret", "error");
            map.put("msg", "保存失败!");
            return "401";
        }
    }
}
