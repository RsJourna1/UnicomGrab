package com.grab.unicom.common.pojo;

import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//
//import static javax.persistence.GenerationType.IDENTITY;

//@Entity
public class AgreeData {
    @Id
//    @GeneratedValue(strategy=IDENTITY)
    private String agreeDataId;

    private String eventName;
    private String eventTime;
    private String location;
    //负责人姓名
    private String picName;
    //负责人电话
    private String picNum;
    //最终发展量
    private String finalNum;

    public String getAgreeDataId() {
        return agreeDataId;
    }

    public void setAgreeDataId(String agreeDataId) {
        this.agreeDataId = agreeDataId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
}
