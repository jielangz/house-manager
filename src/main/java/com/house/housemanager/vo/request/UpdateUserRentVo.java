package com.house.housemanager.vo.request;

import java.util.Date;

public class UpdateUserRentVo {
    
    private String userId;
    
    private String userName;
    
    private Date rentBeginDate;
    
    private Date rentEndDate;
    
    private String houseId;
    
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
    
    public String getHouseId() {
        return houseId;
    }
    
    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }
    
}
