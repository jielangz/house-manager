package com.house.housemanager.vo.request;

import com.house.housemanager.model.UserRent;

public class InsertComplainVo {
    
    private UserRent userRent;
    
    private String complainTontent;
    
    private Boolean cryptonymFlag;
    
    
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
    
    public UserRent getUserRent() {
        return userRent;
    }
    
    public void setUserRent(UserRent userRent) {
        this.userRent = userRent;
    }
}
