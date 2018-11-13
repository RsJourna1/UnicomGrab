package com.grab.unicom.common.dao;

import com.grab.unicom.common.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMapper extends MongoRepository<User, String> {
    User findByUsername(String username);

}
