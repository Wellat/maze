package com.hemi.maze.test.bean;

import com.hemi.maze.core.feature.test.TestSupport;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * SpiderTest : 爬虫测试类
 *
 */
public class SpiderTest extends TestSupport {

    @Resource
    private Spider spider;

    @Test
    public void testInjectSpider() throws Exception {
        System.out.println(spider);
    }
}
