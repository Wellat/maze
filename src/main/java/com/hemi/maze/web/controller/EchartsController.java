package com.hemi.maze.web.controller;

import com.hemi.maze.web.model.DictVo;
import com.hemi.maze.web.model.EcBar;
import com.hemi.maze.web.service.EchartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Echarts图表控制器
 * Created by Vanguard on 2016/12/22.
 */
@Controller
@RequestMapping(value = "/view")
public class EchartsController {
    @Resource
    private EchartService echartService;

    @RequestMapping(value = "/rain.html",method = RequestMethod.GET)
    @ResponseBody
    public Object showChart(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Float> clist1 = new ArrayList<Float>();
        List<Float> clist2 = new ArrayList<Float>();
        List<Float> clist3 = new ArrayList<Float>();

        System.out.println("=======rain.html controller=========");

        List<EcBar> chartList = echartService.listBar();

        for(EcBar cl : chartList){
            clist1.add(cl.getEvaporation());
            clist2.add(cl.getRainfall());
            clist3.add(cl.getAvgtemp());
        }
        map.put("c_eva",clist1);
        map.put("c_rain",clist2);
        map.put("c_avgt",clist3);
        map.put("success1",true);
        return map;
    }


    @RequestMapping(value = "/funnel.html", method = RequestMethod.GET)
    @ResponseBody
    public Object funnelView(){
        List<String> nameList = new ArrayList<String>();
        Map<String, Object> map = new HashMap<String, Object>();
        List<DictVo> funnelList = echartService.listFunnel();
        for (DictVo name : funnelList) {
            nameList.add(name.getName());
        }

        System.out.println("=======funnel.html controller=========");

        map.put("legendJson",nameList);
        map.put("seriesJson",funnelList);
        map.put("success3",true);
        return map;
    }

}
