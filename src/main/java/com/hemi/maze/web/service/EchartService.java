package com.hemi.maze.web.service;

import com.hemi.maze.web.model.DictVo;
import com.hemi.maze.web.model.EcBar;

import java.util.List;

/**
 * Echarts图表公共业务接口
 * Created by Vanguard on 2016/12/22.
 */
public interface EchartService {
    //funnel图表数据
    List<DictVo> listFunnel();

    //Bar图
    List<EcBar> listBar();
}
