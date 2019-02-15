package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.AgreeData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AgreeDataMapper  extends MongoRepository<AgreeData, String> {
    List<AgreeData> findByFinalNumNullAndUsername(String username);
    List<AgreeData> findByFinalNumNull();
    List<AgreeData> findByFinalNumNotNullAndUsername(String username);
    List<AgreeData> findByFinalNumNotNull();
    AgreeData findByMd5(String md5);


}
