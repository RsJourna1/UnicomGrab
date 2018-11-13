package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.AgreeData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AgreeDataMapper  extends MongoRepository<AgreeData, String> {
    List<AgreeData> findByFinalNumNull();
    List<AgreeData> findByFinalNumNotNull();
    AgreeData findByAgreeDataId(String agreeDataId);
}
