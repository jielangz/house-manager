package com.house.housemanager.model;

public class HouseDetails {
    private String houseDetailsId;

    private String houseId;

    private Boolean bedFlag;

    private Boolean sofaFlag;

    private Boolean tableFlag;

    private Boolean closetFlag;

    private Integer roomNumber;

    private Boolean restRoomFlag;

    private String otherDetails;

    public String getHouseDetailsId() {
        return houseDetailsId;
    }

    public void setHouseDetailsId(String houseDetailsId) {
        this.houseDetailsId = houseDetailsId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
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

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", houseDetailsId=").append(houseDetailsId);
        sb.append(", houseId=").append(houseId);
        sb.append(", bedFlag=").append(bedFlag);
        sb.append(", sofaFlag=").append(sofaFlag);
        sb.append(", tableFlag=").append(tableFlag);
        sb.append(", closetFlag=").append(closetFlag);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", restRoomFlag=").append(restRoomFlag);
        sb.append(", otherDetails=").append(otherDetails);
        sb.append("]");
        return sb.toString();
    }
}