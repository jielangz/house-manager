package com.house.housemanager.model;

import java.math.BigDecimal;
import java.util.Date;

public class House {
    private String houseId;

    private String houserName;

    private BigDecimal houseCast;

    private Boolean rentFlag;

    private String houseDescription;

    private Date rentBeginDate;

    private Date rentEndDate;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouserName() {
        return houserName;
    }

    public void setHouserName(String houserName) {
        this.houserName = houserName;
    }

    public BigDecimal getHouseCast() {
        return houseCast;
    }

    public void setHouseCast(BigDecimal houseCast) {
        this.houseCast = houseCast;
    }

    public Boolean getRentFlag() {
        return rentFlag;
    }

    public void setRentFlag(Boolean rentFlag) {
        this.rentFlag = rentFlag;
    }

    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
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
        sb.append(", houseId=").append(houseId);
        sb.append(", houserName=").append(houserName);
        sb.append(", houseCast=").append(houseCast);
        sb.append(", rentFlag=").append(rentFlag);
        sb.append(", houseDescription=").append(houseDescription);
        sb.append(", rentBeginDate=").append(rentBeginDate);
        sb.append(", rentEndDate=").append(rentEndDate);
        sb.append("]");
        return sb.toString();
    }
}