package com.house.housemanager.vo.request;

public class GetHouseVo {
    
    private String houserName;
    private Boolean rentFlag;
    private Integer pageNum;
    private Integer pageSize;
    
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
    
    public Integer getPageNum() {
        return pageNum;
    }
    
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    
    public Integer getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
