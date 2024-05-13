package com.house.housemanager.vo.request;

import com.house.housemanager.model.UserRent;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GetUserComplainVo {
    private UserRent userRent;
    private Integer pageNum;
    private Integer pageSize;
    
    public UserRent getUserRent() {
        return userRent;
    }
    
    public void setUserRent(UserRent userRent) {
        this.userRent = userRent;
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
