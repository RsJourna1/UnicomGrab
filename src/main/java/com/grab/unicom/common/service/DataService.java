package com.grab.unicom.common.service;

import com.grab.unicom.common.pojo.LayData;
import org.springframework.stereotype.Service;

@Service
public interface DataService {
    LayData getUIData();

    int agreeData(String agreeDataId, String picName, String picNum);

    int refuseData(String refuseDateId, String refuseReason);

    LayData getAgreeingData();

    int finalNumFeedBack(String agreeDataId, String finalNum);

    LayData getRefuseData();

    LayData getFinishData();
}
