package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.DoubanhangzhouList;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DoubanhangzhouListMapper extends MongoRepository<DoubanhangzhouList, String> {
    List<DoubanhangzhouList> findByRemarkNull();
    DoubanhangzhouList findByMd5(String md5);
}
