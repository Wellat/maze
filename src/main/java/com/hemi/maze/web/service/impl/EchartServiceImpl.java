package com.hemi.maze.web.service.impl;

import com.hemi.maze.web.dao.EcBarMapper;
import com.hemi.maze.web.dao.EcFunnelMapper;
import com.hemi.maze.web.model.DictVo;
import com.hemi.maze.web.model.EcBar;
import com.hemi.maze.web.service.EchartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vanguard on 2016/12/22.
 */
@Service
public class EchartServiceImpl implements EchartService {
    @Resource
    EcBarMapper ecBarMapper;

    @Resource
    EcFunnelMapper ecFunnelMapper;

    /**
     * 漏斗图——数据为键值对
     * @return
     */
    @Override
    public List<DictVo> listFunnel() {
        return ecFunnelMapper.findNameAndValue();
    }

    /**
     * 降雨量、温度的Bar图
     * @return
     */
    @Override
    public List<EcBar> listBar() {
        return ecBarMapper.selectAll();
    }
}
