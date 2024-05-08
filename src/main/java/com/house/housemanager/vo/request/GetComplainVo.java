package com.house.housemanager.vo.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GetComplainVo {
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date complainStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date comPlainEndDate;
    private Integer pageNum;
    private Integer pageSize;
    
    public Date getComplainStartDate() {
        return complainStartDate;
    }

    public void setComplainStartDate(Date complainStartDate) {
        this.complainStartDate = complainStartDate;
    }

    public Date getComPlainEndDate() {
        return comPlainEndDate;
    }

    public void setComPlainEndDate(Date comPlainEndDate) {
        this.comPlainEndDate = comPlainEndDate;
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
