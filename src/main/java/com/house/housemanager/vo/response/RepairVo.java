package com.house.housemanager.vo.response;

public class RepairVo {
    private String repairId;
    
    private String userName;
    
    private String houseId;
    
    private String houseName;
    
    private String repairGoods;
    
    private Boolean repairFlag;
    
    public String getRepairId() {
        return repairId;
    }
    
    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getHouseId() {
        return houseId;
    }
    
    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }
    
    public String getHouseName() {
        return houseName;
    }
    
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
    public String getRepairGoods() {
        return repairGoods;
    }
    
    public void setRepairGoods(String repairGoods) {
        this.repairGoods = repairGoods;
    }
    
    public Boolean getRepairFlag() {
        return repairFlag;
    }
    
    public void setRepairFlag(Boolean repairFlag) {
        this.repairFlag = repairFlag;
    }
}
