package com.grab.unicom.common.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//
//import static javax.persistence.GenerationType.IDENTITY;

//@Entity
public class RefuseData {
    @Id
//    @GeneratedValue(strategy=IDENTITY)
    private ObjectId refuseDataId;

    private String md5;
    private String name;
    private String showtime;
    private String venue;
    private String description;
    //数据来源
    private String source;
    //不跟进原因
    private String refuseReason;
    //县分
    private String county;
    //操作员用户名
    private String username;
    //操作员真实姓名
    private String realName;

    public ObjectId getRefuseDataId() {
        return refuseDataId;
    }

    public void setRefuseDataId(ObjectId refuseDataId) {
        this.refuseDataId = refuseDataId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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
