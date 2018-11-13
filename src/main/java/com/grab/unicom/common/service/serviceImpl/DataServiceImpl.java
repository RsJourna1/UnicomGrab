package com.grab.unicom.common.service.serviceImpl;

import com.grab.unicom.common.dao.AgreeDataMapper;
import com.grab.unicom.common.dao.DataMapper;
import com.grab.unicom.common.dao.RefuseDataMapper;
import com.grab.unicom.common.pojo.AgreeData;
import com.grab.unicom.common.pojo.Data;
import com.grab.unicom.common.pojo.LayData;
import com.grab.unicom.common.pojo.RefuseData;
import com.grab.unicom.common.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataMapper dataMapper;
    @Autowired
    private AgreeDataMapper agreeDataMapper;
    @Autowired
    private RefuseDataMapper refuseDataMapper;

    //获取最新活动数据
    @Override
    public LayData getUIData(){
        LayData layData = new LayData();
        List<Data> dataList = new ArrayList<>();
        dataList = dataMapper.findAll();
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(dataList.size()));
        layData.setData(dataList);
        return layData;
    }

    //跟进活动
    @Override
    public int agreeData(String agreeDataId, String picName, String picNum) {
        AgreeData agreeData = new AgreeData();
        Data data = new Data();
        data = dataMapper.findByDataId(agreeDataId);
        agreeData.setAgreeDataId(data.getDataId());
        agreeData.setEventName(data.getEventName());
        agreeData.setEventTime(data.getEventTime());
        agreeData.setLocation(data.getLocation());
        agreeData.setPicName(picName);
        agreeData.setPicNum(picNum);
        agreeData.setFinalNum(null);
        agreeDataMapper.save(agreeData);
        return 1;
    }

    //不跟进活动
    @Override
    public int refuseData(String refuseDateId, String refuseReason){
        RefuseData refuseData = new RefuseData();
        Data data = new Data();
        data = dataMapper.findByDataId(refuseDateId);
        refuseData.setRefuseDataId(data.getDataId());
        refuseData.setEventName(data.getEventName());
        refuseData.setEventTime(data.getEventTime());
        refuseData.setLocation(data.getLocation());
        refuseData.setSign(data.getSign());
        refuseData.setRefuseReason(refuseReason);
        refuseDataMapper.save(refuseData);
        return 1;
    }

    //获取正在更近活动数据
    @Override
    public LayData getAgreeingData(){
        LayData layData = new LayData();
        List<AgreeData> agreeDataList = new ArrayList<>();
        agreeDataList = agreeDataMapper.findByFinalNumNull();
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(agreeDataList.size()));
        layData.setData(agreeDataList);
        return layData;
    }

    //发展量反馈
    @Override
    public int finalNumFeedBack(String agreeDataId, String finalNum){
        AgreeData agreeData = new AgreeData();
        agreeData = agreeDataMapper.findByAgreeDataId(agreeDataId);
        agreeData.setFinalNum(finalNum);
        agreeDataMapper.save(agreeData);
        return 1;
    }

    //不跟进数据展示
    @Override
    public LayData getRefuseData(){
        LayData layData = new LayData();
        List<RefuseData> refuseDataList = new ArrayList<>();
        refuseDataList = refuseDataMapper.findAll();
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(refuseDataList.size()));
        layData.setData(refuseDataList);
        return layData;
    }

    //已完成数据展示
    @Override
    public LayData getFinishData(){
        LayData layData = new LayData();
        List<AgreeData> agreeDataList = new ArrayList<>();
        agreeDataList = agreeDataMapper.findByFinalNumNotNull();
        layData.setCode("0");
        layData.setMsg("");
        layData.setCount(String.valueOf(agreeDataList.size()));
        layData.setData(agreeDataList);
        return layData;
    }

}
