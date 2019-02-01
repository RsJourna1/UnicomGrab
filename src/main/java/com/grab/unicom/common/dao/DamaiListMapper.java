package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.DamaiList;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DamaiListMapper extends MongoRepository<DamaiList, String> {
    List<DamaiList> findByRemarkNull();
    DamaiList findByMd5(String md5);
}
