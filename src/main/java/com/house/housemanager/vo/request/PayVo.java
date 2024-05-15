package com.house.housemanager.vo.request;

import java.math.BigDecimal;

public class PayVo {
    private String payId;
    private BigDecimal payMoney;
    
    public String getPayId() {
        return payId;
    }
    
    public void setPayId(String payId) {
        this.payId = payId;
    }
    
    public BigDecimal getPayMoney() {
        return payMoney;
    }
    
    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }
}
