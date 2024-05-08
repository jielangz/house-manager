package com.house.housemanager.vo.request;

public class GetRepairVo {
    
    private Boolean repairFlag;
    private Integer pageNum;
    private Integer pageSize;
    
    public Boolean getRepairFlag() {
        return repairFlag;
    }
    
    public void setRepairFlag(Boolean repairFlag) {
        this.repairFlag = repairFlag;
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
