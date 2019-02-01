package com.grab.unicom.common.service.serviceImpl;

import com.grab.unicom.common.dao.AgreeDataMapper;
import com.grab.unicom.common.dao.RefuseDataMapper;
import com.grab.unicom.common.pojo.AgreeData;
import com.grab.unicom.common.pojo.LayData;
import com.grab.unicom.common.pojo.RefuseData;
import com.grab.unicom.common.service.OperateService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperateServiceImpl implements OperateService {
    @Autowired
    AgreeDataMapper agreeDataMapper;
    @Autowired
    RefuseDataMapper refuseDataMapper;

    //操作跟进数据
    @Override
    public void OperateAgreeData(ObjectId agreeDataId, String md5, String name, String showtime,
                                 String venue, String Source, String picName, String picNum,
                                 String username, String realName) {
        AgreeData agreeData = new AgreeData();
        agreeData.setAgreeDataId(agreeDataId);
        agreeData.setMd5(md5);
        agreeData.setName(name);
        agreeData.setShowtime(showtime);
        agreeData.setVenue(venue);
        agreeData.setSource(Source);
        agreeData.setPicName(picName);
        agreeData.setPicNum(picNum);
        agreeData.setUsername(username);
        agreeData.setRealName(realName);
        agreeData.setFinalNum(null);
        agreeDataMapper.save(agreeData);
    }

    //操作不跟进数据
    @Override
    public void OperateRefuseData(ObjectId refuseDataId, String md5, String name, String showtime,
                                  String venue, String description, String Source,
                                  String refuseReason,
                                  String username, String realName) {
        RefuseData refuseData = new RefuseData();
        refuseData.setRefuseDataId(refuseDataId);
        refuseData.setMd5(md5);
        refuseData.setName(name);
        refuseData.setShowtime(showtime);
        refuseData.setVenue(venue);
        refuseData.setDescription(description);
        refuseData.setSource(Source);
        refuseData.setRefuseReason(refuseReason);
        refuseData.setUsername(username);
        refuseData.setRealName(realName);
        refuseDataMapper.save(refuseData);
    }
}
