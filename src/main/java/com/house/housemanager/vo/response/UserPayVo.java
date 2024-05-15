package com.house.housemanager.vo.response;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

public class UserPayVo {
    private String payId;
    private String houseName;
    private Boolean payFlag;
    private Date payLimitDate;
    private BigDecimal houseCast;
    private BigDecimal payMoney;
    private BigDecimal notPayMoney;
    
    public String getPayId() {
        return payId;
    }
    
    public void setPayId(String payId) {
        this.payId = payId;
    }
    
    public String getHouseName() {
        return houseName;
    }
    
    public void setHouseName(String houseName) {
        this.houseName = houseName;
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
    
    public BigDecimal getHouseCast() {
        return houseCast;
    }
    
    public void setHouseCast(BigDecimal houseCast) {
        this.houseCast = houseCast;
    }
    
    public BigDecimal getPayMoney() {
        return payMoney;
    }
    
    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }
    
    public BigDecimal getNotPayMoney() {
        return notPayMoney;
    }
    
    public void setNotPayMoney(BigDecimal notPayMoney) {
        this.notPayMoney = notPayMoney;
    }
}
