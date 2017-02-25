package com.hemi.maze.test.library.jedis;

import com.hemi.maze.core.feature.cache.redis.RedisCache;
import com.hemi.maze.core.feature.test.TestSupport;

import javax.annotation.Resource;

/**
 * JedisTest : 测试 jedis 功能
 *
 */
public class JedisTest extends TestSupport {


    @Resource
    private RedisCache redisCache;


//    @Test
    public void testSet() {
        redisCache.cache("anchor", "StarZou", 1 * 60 * 24);
    }

//    @Test
    public void testGet() {
        System.out.printf(redisCache.get("anchor"));
    }
}
