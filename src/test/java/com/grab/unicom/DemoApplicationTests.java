package com.grab.unicom;

import com.grab.unicom.common.dao.AgreeDataMapper;
import com.grab.unicom.common.dao.DamaiListMapper;
import com.grab.unicom.common.dao.DoubanhangzhouListMapper;
import com.grab.unicom.common.pojo.AgreeData;
import com.grab.unicom.common.pojo.DamaiList;
import com.grab.unicom.common.pojo.DoubanhangzhouList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    DamaiListMapper damaiConvertTempMapper;

    @Autowired
    AgreeDataMapper agreeDataMapper;

    @Autowired
    DoubanhangzhouListMapper doubanhangzhouListMapper;

    @Test
    public void contextLoads() {
//        List<DamaiList> damaiListList=new ArrayList<>();
//        damaiListList=damaiConvertTempMapper.findByRemarkNull();
//        System.out.println(damaiListList.size());
//        List<DoubanhangzhouList> doubanhangzhouListList=new ArrayList<>();
//        doubanhangzhouListList=doubanhangzhouListMapper.findByRemarkNull();
//        System.out.println(doubanhangzhouListList.size());
//        System.out.println(damaiListList.get(0).getRemark());
//        System.out.println(damaiConvertTempList.get(0).getMd5());
//        System.out.println(damaiConvertTempList.get(0).getCategoryname());
//        System.out.println(damaiConvertTempList.get(0).getDescription());
//        List<AgreeData> agreeDataList=new ArrayList<>();
//        agreeDataList=agreeDataMapper.findByFinalNumNull();
//        System.out.println(agreeDataList.get(0).getFinalNum());
    }

}
