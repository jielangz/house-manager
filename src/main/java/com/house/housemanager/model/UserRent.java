package com.house.housemanager.model;

import java.util.Date;

public class UserRent {
    private String userId;

    private String userName;

    private String userPhone;

    private String userIdentityCard;

    private String userSex;

    private String houseId;

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

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userIdentityCard=").append(userIdentityCard);
        sb.append(", userSex=").append(userSex);
        sb.append(", houseId=").append(houseId);
        sb.append(", houseCost=").append(houseCost);
        sb.append(", rentBeginDate=").append(rentBeginDate);
        sb.append(", rentEndDate=").append(rentEndDate);
        sb.append("]");
        return sb.toString();
    }
}