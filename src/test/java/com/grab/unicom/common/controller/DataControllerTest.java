package com.grab.unicom.common.controller;

import com.grab.unicom.common.dao.AgreeDataMapper;
import com.grab.unicom.common.dao.DataMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataControllerTest {
    @Autowired
    AgreeDataMapper agreeDataMapper;
    @Autowired
    DataMapper dataMapper;
    @Autowired
    DataController dataController;
    @Test
    public void test(){

    }
}