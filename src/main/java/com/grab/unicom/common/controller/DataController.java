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
    @RequestMapping("/getUIData")
    public @ResponseBody
    LayData getUIData() {
        return dataService.getUIData();
    }

    //跟进活动
    @RequestMapping(value = "/agreeData", method = RequestMethod.POST)
    public @ResponseBody
    int agreeData(String agreeDataId, String picName, String picNum) {
        return dataService.agreeData(agreeDataId, picName, picNum);
    }

    //不跟进活动
    @RequestMapping(value = "/refuseData", method = RequestMethod.POST)
    public @ResponseBody
    int refuseData(String refuseDateId, String refuseReason) {
        return dataService.refuseData(refuseDateId, refuseReason);
    }

    //正在跟进数据展示
    @RequestMapping("/getAgreeingData")
    public @ResponseBody
    LayData getAgreeingData() {
        return dataService.getAgreeingData();
    }

    //发展量反馈
    @RequestMapping(value = "/finalNumFeedBack", method = RequestMethod.POST)
    public @ResponseBody
    int finalNumFeedBack(String agreeDataId, String finalNum) {
        return dataService.finalNumFeedBack(agreeDataId, finalNum);
    }

    //不跟进数据展示
    @RequestMapping("/getRefuseData")
    public @ResponseBody
    LayData getRefuseData() {
        return dataService.getRefuseData();
    }

    //已完成数据展示
    @RequestMapping("/getFinishData")
    public @ResponseBody
    LayData getFinishData() {
        return dataService.getFinishData();
    }
}
