package com.grab.unicom.common.service.serviceImpl;

import com.grab.unicom.common.dao.*;
import com.grab.unicom.common.pojo.*;
import com.grab.unicom.common.service.DataService;
import com.grab.unicom.common.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private AgreeDataMapper agreeDataMapper;
    @Autowired
    private RefuseDataMapper refuseDataMapper;
    @Autowired
    private DamaiListMapper damaiListMapper;
    @Autowired
    private DoubanhangzhouListMapper doubanhangzhouListMapper;
    @Autowired
    private OperateService operateService;
    @Autowired
    UserMapper userMapper;

    //获取大麦最新活动数据
    @Override
    public LayData getDamaiUIData() {
        LayData layData = new LayData();
        List<DamaiList> damaiListList = damaiListMapper.findByRemarkNull();
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(damaiListList.size()));
        layData.setData(damaiListList);
        return layData;
    }

    //获取豆瓣最新活动数据
    @Override
    public LayData getDoubanUIData() {
        LayData layData = new LayData();
        List<DoubanhangzhouList> doubanhangzhouListList = doubanhangzhouListMapper.findByRemarkNull();
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(doubanhangzhouListList.size()));
        layData.setData(doubanhangzhouListList);
        return layData;
    }

    //跟进大麦活动
    @Override
    public int agreeDamaiData(String md5, String picName,
                              String picNum, String username, String realName, String county) {

        DamaiList damaiList = damaiListMapper.findByMd5(md5);
        AgreeData checkOK = agreeDataMapper.findByMd5(md5);
        if (picName == "" || picNum == "") {
            return 3;
        } else if (checkOK != null) {
            return 0;
        } else {
            operateService.OperateAgreeData(damaiList.getDamaiId(), damaiList.getMd5(),
                    damaiList.getName(), damaiList.getShowtime(), damaiList.getVenue(),
                    "大麦", picName, picNum, username, realName,county);
            damaiList.setRemark("跟进");
            damaiListMapper.save(damaiList);
            return 1;
        }

    }

    //跟进豆瓣活动
    @Override
    public int agreeDoubanData(String md5, String picName,
                               String picNum, String username, String realName, String county) {
        AgreeData agreeData = new AgreeData();
        DoubanhangzhouList doubanhangzhouList = new DoubanhangzhouList();
        doubanhangzhouList = doubanhangzhouListMapper.findByMd5(md5);
        AgreeData checkOK = agreeDataMapper.findByMd5(md5);
        if (picName == "" || picNum == "") {
            return 3;
        } else if (checkOK != null) {
            return 0;
        } else {
            operateService.OperateAgreeData(doubanhangzhouList.getDoubanId(),
                    doubanhangzhouList.getMd5(),
                    doubanhangzhouList.getName(),
                    doubanhangzhouList.getShowtime(),
                    doubanhangzhouList.getVenue(),
                    "豆瓣", picName, picNum, username, realName,county);
            doubanhangzhouList.setRemark("跟进");
            doubanhangzhouListMapper.save(doubanhangzhouList);
            return 1;
        }
    }

    //不跟进大麦活动
    @Override
    public int refuseDamaiData(String md5, String refuseReason, String username,
                               String realName, String county) {
        DamaiList damaiList = new DamaiList();
        damaiList = damaiListMapper.findByMd5(md5);

        RefuseData checkOK = refuseDataMapper.findByMd5(md5);
        if (refuseReason == "") {
            return 3;
        } else if (checkOK != null) {
            return 0;
        } else {
            operateService.OperateRefuseData(damaiList.getDamaiId(),
                    damaiList.getMd5(), damaiList.getName(),
                    damaiList.getShowtime(), damaiList.getVenue(),
                    damaiList.getDescription(),
                    "大麦", refuseReason, username, realName, county);
            damaiList.setRemark("不跟进");
            damaiListMapper.save(damaiList);
            return 1;
        }
    }

    //不跟进豆瓣活动
    @Override
    public int refuseDoubanData(String md5, String refuseReason,
                                String username, String realName, String county) {
        DoubanhangzhouList doubanhangzhouList = new DoubanhangzhouList();
        doubanhangzhouList = doubanhangzhouListMapper.findByMd5(md5);
        RefuseData checkOK = refuseDataMapper.findByMd5(md5);
        if (refuseReason == "") {
            return 3;
        } else if (checkOK != null) {
            return 0;
        } else {
            operateService.OperateRefuseData(doubanhangzhouList.getDoubanId(),
                    doubanhangzhouList.getMd5(), doubanhangzhouList.getName(),
                    doubanhangzhouList.getShowtime(), doubanhangzhouList.getVenue(),
                    doubanhangzhouList.getDescription(),
                    "豆瓣", refuseReason, username, realName, county);
            doubanhangzhouList.setRemark("不跟进");
            doubanhangzhouListMapper.save(doubanhangzhouList);
            return 1;
        }
    }

    //获取正在跟进活动数据
    @Override
    public LayData getAgreeingData(String username) {
        LayData layData = new LayData();
        List<AgreeData> agreeDataList = new ArrayList<>();
        User user = userMapper.findByUsername(username);
        if (user.getIsAdmin().equals("1")) {
            agreeDataList = agreeDataMapper.findByFinalNumNullAndUsername(username);
        } else {
            agreeDataList = agreeDataMapper.findByFinalNumNull();
        }
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(agreeDataList.size()));
        layData.setData(agreeDataList);
        return layData;
    }

    //发展量反馈
    @Override
    public int finalNumFeedBack(String md5, String finalNum) {
        AgreeData agreeData = new AgreeData();
        agreeData = agreeDataMapper.findByMd5(md5);
        agreeData.setFinalNum(finalNum);
        agreeDataMapper.save(agreeData);
        return 1;
    }

    //不跟进数据展示
    @Override
    public LayData getRefuseData(String username) {
        LayData layData = new LayData();
        List<RefuseData> refuseDataList = new ArrayList<>();
        User user = userMapper.findByUsername(username);
        if (user.getIsAdmin().equals("1")) {
            refuseDataList = refuseDataMapper.findByUsername(username);
        } else {
            refuseDataList = refuseDataMapper.findAll();
        }
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(refuseDataList.size()));
        layData.setData(refuseDataList);
        return layData;
    }

    //已完成数据展示
    @Override
    public LayData getFinishData(String username) {
        LayData layData = new LayData();
        List<AgreeData> agreeDataList = new ArrayList<>();
        User user = userMapper.findByUsername(username);
        if (user.getIsAdmin().equals("1")) {
            agreeDataList = agreeDataMapper.findByFinalNumNotNullAndUsername(username);
        } else {
            agreeDataList = agreeDataMapper.findByFinalNumNotNull();
        }
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(agreeDataList.size()));
        layData.setData(agreeDataList);
        return layData;
    }

}
