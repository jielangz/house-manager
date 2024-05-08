package com.house.housemanager.vo.response;

import java.util.Date;

public class UserRentVo {
    
    private String userId;
    
    private String userName;
    
    private String userPhone;
    
    private String userIdentityCard;
    
    private String userSex;
    
    private String houseName;
    
    private Integer houseCost;
    
    private Date rentBeginDate;
    
    private Date rentEndDate;
    
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
    
    public String getUserPhone() {
        return userPhone;
    }
    
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
    public String getUserIdentityCard() {
        return userIdentityCard;
    }
    
    public void setUserIdentityCard(String userIdentityCard) {
        this.userIdentityCard = userIdentityCard;
    }
    
    public String getUserSex() {
        return userSex;
    }
    
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    
    public String getHouseName() {
        return houseName;
    }
    
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
    public Integer getHouseCost() {
        return houseCost;
    }
    
    public void setHouseCost(Integer houseCost) {
        this.houseCost = houseCost;
    }
    
    public Date getRentBeginDate() {
        return rentBeginDate;
    }
    
    public void setRentBeginDate(Date rentBeginDate) {
        this.rentBeginDate = rentBeginDate;
    }
    
    public Date getRentEndDate() {
        return rentEndDate;
    }
    
    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }
}
