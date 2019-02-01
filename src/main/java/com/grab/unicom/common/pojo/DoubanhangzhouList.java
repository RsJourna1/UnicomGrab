package com.grab.unicom.common.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doubanhangzhou_list")
public class DoubanhangzhouList {
    @Id
    private ObjectId doubanId;

    private String md5;
    private String categoryname;
    private String description;
    private String name;
    private String showtime;
    private String venue;
    private String verticalPic;
    private String remark;

    public ObjectId getDoubanId() {
        return doubanId;
    }

    public void setDoubanId(ObjectId doubanId) {
        this.doubanId = doubanId;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getVerticalPic() {
        return verticalPic;
    }

    public void setVerticalPic(String verticalPic) {
        this.verticalPic = verticalPic;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
