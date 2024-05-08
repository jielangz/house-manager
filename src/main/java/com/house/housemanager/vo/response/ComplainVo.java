package com.house.housemanager.vo.response;

import java.util.Date;

public class ComplainVo {
    private String complainId;
    
    private String complainTontent;
    
    private String userId;
    
    private Boolean cryptonymFlag;
    
    private Date complainDate;
    
    private String userName;
    
    public String getComplainId() {
        return complainId;
    }
    
    public void setComplainId(String complainId) {
        this.complainId = complainId;
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
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
