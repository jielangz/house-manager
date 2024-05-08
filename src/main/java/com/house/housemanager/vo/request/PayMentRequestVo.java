package com.house.housemanager.vo.request;

public class PayMentRequestVo {
    
    private String userId;
    
    private String houseId;
    
    private Integer pageNumPay;
    private Integer pageSizePay;
    
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
    
    public Integer getPageNumPay() {
        return pageNumPay;
    }
    
    public void setPageNumPay(Integer pageNumPay) {
        this.pageNumPay = pageNumPay;
    }
    
    public Integer getPageSizePay() {
        return pageSizePay;
    }
    
    public void setPageSizePay(Integer pageSizePay) {
        this.pageSizePay = pageSizePay;
    }
}
