package com.grab.unicom.common.controller;

import com.grab.unicom.common.dao.AgreeDataMapper;
import com.grab.unicom.common.dao.DataMapper;
import com.grab.unicom.common.dao.RefuseDataMapper;
import com.grab.unicom.common.pojo.AgreeData;
import com.grab.unicom.common.pojo.Data;
import com.grab.unicom.common.pojo.LayData;
import com.grab.unicom.common.pojo.RefuseData;
import com.grab.unicom.common.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/data")
public class DataController {
    @Autowired
    private DataService dataService;

    //获取最新活动数据
    @RequestMapping("/getDamaiUIData")
    public @ResponseBody
    LayData getDamaiUIData() {
        return dataService.getDamaiUIData();
    }

    @RequestMapping("/getDoubanUIData")
    public @ResponseBody
    LayData getDoubanUIData() {
        return dataService.getDoubanUIData();
    }

    //跟进大麦活动
    @RequestMapping(value = "/agreeDamaiData", method = RequestMethod.POST)
    public @ResponseBody
    int agreeDamaiData(String md5, String picName, String picNum,
                       String username, String realName, String county) {
        return dataService.agreeDamaiData(md5, picName, picNum, username, realName, county);
    }

    //跟进豆瓣活动
    @RequestMapping(value = "/agreeDoubanData", method = RequestMethod.POST)
    public @ResponseBody
    int agreeDoubanData(String md5, String picName, String picNum,
                        String username, String realName, String county) {
        return dataService.agreeDoubanData(md5, picName, picNum, username, realName, county);
    }

    //不跟进大麦活动
    @RequestMapping(value = "/refuseDamaiData", method = RequestMethod.POST)
    public @ResponseBody
    int refuseDamaiData(String md5, String refuseReason,
                        String username, String realName,String county) {
        return dataService.refuseDamaiData(md5, refuseReason, username, realName,county);
    }

    //不跟进豆瓣活动
    @RequestMapping(value = "/refuseDoubanData", method = RequestMethod.POST)
    public @ResponseBody
    int refuseDoubanData(String md5, String refuseReason,
                         String username, String realName,String county) {
        return dataService.refuseDoubanData(md5, refuseReason, username, realName,county);
    }

    //正在跟进数据展示
    @RequestMapping("/getAgreeingData/{username}")
    public @ResponseBody
    LayData getAgreeingData(@PathVariable String username) {
        return dataService.getAgreeingData(username);
    }

    //发展量反馈
    @RequestMapping(value = "/finalNumFeedBack", method = RequestMethod.POST)
    public @ResponseBody
    int finalNumFeedBack(String md5, String finalNum) {
        return dataService.finalNumFeedBack(md5, finalNum);
    }

    //不跟进数据展示
    @RequestMapping("/getRefuseData/{username}")
    public @ResponseBody
    LayData getRefuseData(@PathVariable String username) {
        return dataService.getRefuseData(username);
    }

    //已完成数据展示
    @RequestMapping("/getFinishData/{username}")
    public @ResponseBody
    LayData getFinishData(@PathVariable String username) {
        return dataService.getFinishData(username);
    }
}
