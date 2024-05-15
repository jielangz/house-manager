package com.house.housemanager.vo.request;

public class SendMsgVo {
    private String userId;
    private Boolean payFlag;
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public Boolean getPayFlag() {
        return payFlag;
    }
    
    public void setPayFlag(Boolean payFlag) {
        this.payFlag = payFlag;
    }
}
