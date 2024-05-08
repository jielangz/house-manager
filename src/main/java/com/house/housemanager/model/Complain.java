package com.house.housemanager.model;

import java.util.Date;

public class Complain {
    private String complainId;

    private String userId;

    private String complainTontent;

    private Boolean cryptonymFlag;

    private Date complainDate;

    public String getComplainId() {
        return complainId;
    }

    public void setComplainId(String complainId) {
        this.complainId = complainId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComplainTontent() {
        return complainTontent;
    }

    public void setComplainTontent(String complainTontent) {
        this.complainTontent = complainTontent;
    }

    public Boolean getCryptonymFlag() {
        return cryptonymFlag;
    }

    public void setCryptonymFlag(Boolean cryptonymFlag) {
        this.cryptonymFlag = cryptonymFlag;
    }

    public Date getComplainDate() {
        return complainDate;
    }

    public void setComplainDate(Date complainDate) {
        this.complainDate = complainDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", complainId=").append(complainId);
        sb.append(", userId=").append(userId);
        sb.append(", complainTontent=").append(complainTontent);
        sb.append(", cryptonymFlag=").append(cryptonymFlag);
        sb.append(", complainDate=").append(complainDate);
        sb.append("]");
        return sb.toString();
    }
}