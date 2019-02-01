package com.grab.unicom.common.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//
//import static javax.persistence.GenerationType.IDENTITY;

//@Entity
public class AgreeData {
    @Id
//    @GeneratedValue(strategy=IDENTITY)
    private ObjectId agreeDataId;

    private String md5;
    private String name;
    private String showtime;
    private String venue;
    //数据来源
    private String source;
    //负责人姓名
    private String picName;
    //负责人电话
    private String picNum;
    //最终发展量
    private String finalNum;
    //操作员用户名
    private String username;
    //操作员真实姓名
    private String realName;

    public ObjectId getAgreeDataId() {
        return agreeDataId;
    }

    public void setAgreeDataId(ObjectId agreeDataId) {
        this.agreeDataId = agreeDataId;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicNum() {
        return picNum;
    }

    public void setPicNum(String picNum) {
        this.picNum = picNum;
    }

    public String getFinalNum() {
        return finalNum;
    }

    public void setFinalNum(String finalNum) {
        this.finalNum = finalNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
