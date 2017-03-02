package com.hemi.maze.test.func;

import com.hemi.maze.core.feature.test.TestSupport;
import com.hemi.maze.web.model.CmsArticle;
import com.hemi.maze.web.model.CmsArticleDetail;
import com.hemi.maze.web.service.CmsService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vanguard on 2017/2/27.
 */
public class FunctionTest extends TestSupport {
    @Resource
    CmsService cmsService;


    @Test
    public void addArticle() {
/*        CmsArticle article = new CmsArticle();

        article.setCreateTime(new Date());

        article.setAllowComment(0);
        article.setIsCheck(1);
        article.setIsShow(1);
        article.setTagid("/1/2/3/");
        article.setTitle("中文呢isatitle");
        article.setAuthor("32");
        article.setContent("2中文呢 is a title中文呢 is a title中文呢 is a title中文呢 is a titlecontent can only be in English?");

        int ans  = cmsService.addArticle(article);
        if(ans==1){
            System.out.println("add Success");
        }else{
            System.out.println("error");
        }*/

//        List<CmsArticleTag> tags = cmsService.getAllTags();


        //标题，时间，是否发布，编辑，删除
        List<CmsArticle> articleLists = cmsService.getAllArticle();
        List<CmsArticleDetail> articleList = new ArrayList<CmsArticleDetail>();
        String tagTemp;
        for (CmsArticle article : articleLists) {
            //克隆结果
            CmsArticleDetail articleTableTemp = new CmsArticleDetail();
            try {
                articleTableTemp.setBaseArticle((CmsArticle) article.clone());
            } catch (Exception e) {
                e.printStackTrace();
            }
            //取标签
            String tags = article.getTagid();
            String[] tag = tags.split("-");
            for (String t : tag) {
                if (!t.equals("") && t != null) {
                    tagTemp = cmsService.getTagByKey(Integer.valueOf(t));
                    articleTableTemp.getTags().add(tagTemp);
                }
            }
            //取文章类别

            //待加处理时间
            //...
            articleList.add(articleTableTemp);
        }
        for (CmsArticleDetail tag : articleList) {
            System.out.println("tagSize:" + tag.getTags().size());
            System.out.println("title:" + tag.getBaseArticle().getTitle());
        }

    }
}
