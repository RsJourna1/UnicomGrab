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
//        Data data=new Data();
//        data.setDataId("1");
//        data.setEventName("2018中国大运河庙会音乐节");
//        data.setEventTime("2018.11.03-11.04");
//        data.setLocation("杭州智慧网谷小镇");
//        data.setSign("林宥嘉");
//        dataMapper.save(data);
//        dataController.agreeData("1","rjj","136");
    }
}