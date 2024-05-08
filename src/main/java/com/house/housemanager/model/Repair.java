package com.house.housemanager.model;

public class Repair {
    private String repairId;

    private String userId;

    private String houseId;

    private String repairGoods;

    private Boolean repairFlag;

    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repairId=").append(repairId);
        sb.append(", userId=").append(userId);
        sb.append(", houseId=").append(houseId);
        sb.append(", repairGoods=").append(repairGoods);
        sb.append(", repairFlag=").append(repairFlag);
        sb.append("]");
        return sb.toString();
    }
}