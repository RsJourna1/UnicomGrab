package com.grab.unicom.common.service;

import com.grab.unicom.common.pojo.LayData;
import org.springframework.stereotype.Service;

@Service
public interface DataService {
    LayData getDamaiUIData();

    LayData getDoubanUIData();

    int agreeDamaiData(String md5, String picName, String picNum,
                       String userName, String realName, String county);

    int agreeDoubanData(String md5, String picName, String picNum,
                        String userName, String realName, String county);

    int refuseDamaiData(String md5, String refuseReason, String username, String realName, String county);

    int refuseDoubanData(String md5, String refuseReason, String username, String realName, String county);

    LayData getAgreeingData(String username);

    int finalNumFeedBack(String md5, String finalNum);

    LayData getRefuseData(String username);

    LayData getFinishData(String username);
}
