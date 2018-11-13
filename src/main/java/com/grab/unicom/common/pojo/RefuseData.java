package com.grab.unicom.common.pojo;

import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//
//import static javax.persistence.GenerationType.IDENTITY;

//@Entity
public class RefuseData {
    @Id
//    @GeneratedValue(strategy=IDENTITY)
    private String refuseDataId;

    private String eventName;
    private String eventTime;
    private String location;
    private String sign;
    //不跟进原因
    private String refuseReason;

    public String getRefuseDataId() {
        return refuseDataId;
    }

    public void setRefuseDataId(String refuseDataId) {
        this.refuseDataId = refuseDataId;
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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }
}
