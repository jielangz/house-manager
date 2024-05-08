package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Repair;
import com.house.housemanager.vo.request.GetRepairVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RepairService {
    PageInfo getRepair(GetRepairVo repair);
    
    Result insertRepair(Repair repair);
    
    Result updateRepair(Repair repair);
    
    Result repairSuccess(Repair repair);
}