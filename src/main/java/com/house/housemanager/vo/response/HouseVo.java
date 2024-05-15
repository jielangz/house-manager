package com.house.housemanager.vo.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class HouseVo {
    
    private String houseId;
    
    private String houserName;
    
    private BigDecimal houseCast;
    
    private Boolean rentFlag;
    
    private String houseDescription;
    
    
    private Date rentBeginDate;
    
    private Date rentEndDate;
    
    private Boolean payFlag;
    
    private Boolean bedFlag;
    
    private Boolean sofaFlag;
    
    private Boolean tableFlag;
    
    private Boolean closetFlag;
    
    private Integer roomNumber;
    
    private Boolean restRoomFlag;
    
    private String otherDetails;
    
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
    
    public Boolean getPayFlag() {
        return payFlag;
    }
    
    public void setPayFlag(Boolean payFlag) {
        this.payFlag = payFlag;
    }
    
    public Boolean getBedFlag() {
        return bedFlag;
    }
    
    public void setBedFlag(Boolean bedFlag) {
        this.bedFlag = bedFlag;
    }
    
    public Boolean getSofaFlag() {
        return sofaFlag;
    }
    
    public void setSofaFlag(Boolean sofaFlag) {
        this.sofaFlag = sofaFlag;
    }
    
    public Boolean getTableFlag() {
        return tableFlag;
    }
    
    public void setTableFlag(Boolean tableFlag) {
        this.tableFlag = tableFlag;
    }
    
    public Boolean getClosetFlag() {
        return closetFlag;
    }
    
    public void setClosetFlag(Boolean closetFlag) {
        this.closetFlag = closetFlag;
    }
    
    public Integer getRoomNumber() {
        return roomNumber;
    }
    
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public Boolean getRestRoomFlag() {
        return restRoomFlag;
    }
    
    public void setRestRoomFlag(Boolean restRoomFlag) {
        this.restRoomFlag = restRoomFlag;
    }
    
    public String getOtherDetails() {
        return otherDetails;
    }
    
    public BigDecimal getHouseCast() {
        return houseCast;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
    public void setHouseCast(BigDecimal houseCast) {
        this.houseCast = houseCast;
    }
    
    
}
