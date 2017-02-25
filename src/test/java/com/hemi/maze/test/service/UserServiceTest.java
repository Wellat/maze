package com.hemi.maze.test.service;

import javax.annotation.Resource;


import com.hemi.maze.core.feature.test.TestSupport;
import com.hemi.maze.core.util.ApplicationUtils;
import com.hemi.maze.web.model.SysRole;
import com.hemi.maze.web.model.SysUser;
import com.hemi.maze.web.model.SysUserRole;
import com.hemi.maze.web.model.UserInfo;
import com.hemi.maze.web.service.TableService;
import com.hemi.maze.web.service.UserService;
import org.junit.Test;

public class UserServiceTest extends TestSupport {

    @Resource
    private TableService tableService;
    @Test
    public void test_tableService(){
        ApplicationUtils utils = new ApplicationUtils();
        String uuid = utils.randomUUID();
        String sub = uuid.substring(24);
        System.out.println("----"+uuid);
        System.out.println("====="+utils.md5Hex("123456"));

//        SysUser user = new SysUser();
//        SysUserRole userRole = new SysUserRole();
//        UserInfo userInfo = new UserInfo();
//        user.setId("212");
//        user.setUsername("吕秀才");
//        user.setUsercode("dsfaf");
//        user.setPassword("123456");
//        userRole.setId("urtest");
//        userRole.setSysUserId(user.getId());
//        userRole.setSysRoleId("user");
//        userInfo.setInfo(user);
//        userInfo.setUserRole(userRole);

//        System.out.println("---------------"+tableService.addUserAndRole(userInfo));
}
 /*   @Resource
    private DictService dictService;

    @Test
    public void test_dict(){
        List<String> nameList = new ArrayList<String>();
        List<SeriesVo> funnelList = dictService.findFunnelDict();
        for (SeriesVo name : funnelList) {
            nameList.add(name.getName());
        }
        System.out.println("====================");
        System.out.println(nameList.toString());
    }*/
//    @Resource
//    private KlineViewService klineViewService;
//
//    @Test
//    public void test_klineView(){
//        List<String> klistDates = new ArrayList<String>();
//        List<Float> allValue = new ArrayList<Float>();
//        List<Kline> klist = klineViewService.selectList();
//        for (Kline kl : klist){
//            klistDates.add(kl.getDates());
//            allValue.add(kl.getOpens());
//            allValue.add(kl.getCloses());
//            allValue.add(kl.getLowest());
//            allValue.add(kl.getHighest());
//        }
//
//        System.out.print(klistDates);
//        System.out.println();
//        System.out.print(allValue);
//
//    }
/*

    @Resource
    private UserService userService;

    @Resource
    private ChartService chartService;

//    @Test
    public void test_chart(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Float> clist1 = new ArrayList<Float>();
        List<Float> clist2 = new ArrayList<Float>();
        List<Float> clist3 = new ArrayList<Float>();

        List<Chart> chartList = chartService.selectList();

        for(Chart cl : chartList){
            clist1.add(cl.getEvaporation());
            clist2.add(cl.getRainfall());
            clist3.add(cl.getAvgtemp());
        }

        map.put("c_eva",clist1);
        map.put("c_rain",clist2);
        map.put("c_avgt",clist3);

        System.out.println(map.get("c_eva"));

    }


//    @Test
    public void test_insert() {
        User model = new User();
        model.setUsername("starzou");
        model.setPassword(ApplicationUtils.sha256Hex("123456"));
        model.setCreateTime(new Date());
        userService.insert(model);
    }

//    @Test
    public void test_10insert() {
        for (int i = 0; i < 10; i++) {
            User model = new User();
            model.setUsername("starzou" + i);
            model.setPassword(ApplicationUtils.sha256Hex("123456"));
            model.setCreateTime(new Date());
            userService.insert(model);
        }
    }
*/

}
