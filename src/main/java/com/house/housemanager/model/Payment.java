package com.house.housemanager.model;

import java.util.Date;

public class Payment {
    private String payId;

    private String userId;

    private String houseId;

    private Integer payMoney;

    private Integer houseCast;

    private Boolean payFlag;

    private Date payLimitDate;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getHouseCast() {
        return houseCast;
    }

    public void setHouseCast(Integer houseCast) {
        this.houseCast = houseCast;
    }

    public Boolean getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Boolean payFlag) {
        this.payFlag = payFlag;
    }

    public Date getPayLimitDate() {
        return payLimitDate;
    }

    public void setPayLimitDate(Date payLimitDate) {
        this.payLimitDate = payLimitDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payId=").append(payId);
        sb.append(", userId=").append(userId);
        sb.append(", houseId=").append(houseId);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", houseCast=").append(houseCast);
        sb.append(", payFlag=").append(payFlag);
        sb.append(", payLimitDate=").append(payLimitDate);
        sb.append("]");
        return sb.toString();
    }
}