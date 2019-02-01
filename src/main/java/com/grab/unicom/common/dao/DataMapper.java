package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DataMapper extends MongoRepository<Data, String> {
    List<Data> findAll();
    Data findByDataId(String id);

}
