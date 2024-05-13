package com.house.housemanager.vo.request;

import com.house.housemanager.model.UserRent;

public class InsertUserRepair {
    private UserRent userRent;
    
    private String repairGoods;
    
    public UserRent getUserRent() {
        return userRent;
    }
    
    public void setUserRent(UserRent userRent) {
        this.userRent = userRent;
    }
    
    public String getRepairGoods() {
        return repairGoods;
    }
    
    public void setRepairGoods(String repairGoods) {
        this.repairGoods = repairGoods;
    }
}
