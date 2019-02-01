package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.RefuseData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RefuseDataMapper extends MongoRepository<RefuseData,String> {
    List<RefuseData> findAll();
    List<RefuseData> findByUsername(String username);
    RefuseData findByMd5(String md5);
}
