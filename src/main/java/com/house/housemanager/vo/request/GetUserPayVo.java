package com.house.housemanager.vo.request;

import com.house.housemanager.model.UserRent;

public class GetUserPayVo {
    private Integer pageNum;
    private Integer pageSize;
    private UserRent userRent;
    
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
    
    public UserRent getUserRent() {
        return userRent;
    }
    
    public void setUserRent(UserRent userRent) {
        this.userRent = userRent;
    }
}
