package com.grab.unicom.common.service;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public interface OperateService {
    void OperateAgreeData(ObjectId agreeDataId, String md5, String name, String showtime,
                          String venue, String Source, String picName, String picNum,
                          String username, String realName);

    void OperateRefuseData(ObjectId damaiId,String md5, String name, String showtime,
                          String venue,String description, String Source,
                          String refuseReason,
                          String username, String realName);
}
