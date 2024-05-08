package com.house.housemanager.vo.request;

import java.util.Date;

/**
 * 新增用户实体
 */
public class InsertUserRentVo {
    
    private String houseId;
    
    private String userName;
    
    private String userPhone;
    
    private String userIdentityCard;
    
    private String userSex;
    
    private Date rentBeginDate;
    
    private Date rentEndDate;
    
    public String getHouseId() {
        return houseId;
    }
    
    public void setHouseId(String houseId) {
        this.houseId = houseId;
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
