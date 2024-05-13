package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Repair;
import com.house.housemanager.service.RepairService;
import com.house.housemanager.vo.request.GetRepairVo;
import com.house.housemanager.vo.request.GetUserRepairVo;
import com.house.housemanager.vo.request.InsertUserRepair;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/repair")
public class RepairController {
    
    @Autowired
    private RepairService repairService;
    
    @GetMapping("/getRepair")
    public Result getRepair(GetRepairVo repairVo){
        PageInfo pageInfo = repairService.getRepair(repairVo);
        return Result.success(pageInfo);
    }
    
    @PostMapping("/insertRepair")
    public Result insertRepair(@RequestBody InsertUserRepair vo){
        if (ObjectUtils.isEmpty(vo.getUserRent())){
            return Result.error("请先登录");
        }
        return repairService.insertRepair(vo);
    }
    
    @PostMapping("/updateRepair")
    public Result updateRepair(@RequestBody Repair repair){
        return repairService.updateRepair(repair);
    }
    
    @PostMapping("/repairSuccess")
    public Result repairSuccess(@RequestBody Repair repair){
        return repairService.repairSuccess(repair);
    }
    
    @PostMapping("/getUerRepair")
    public Result getUerRepair(@RequestBody GetUserRepairVo vo){
        if (ObjectUtils.isEmpty(vo.getUserRent())){
            return Result.error("请先登录");
        }
        PageInfo repair = repairService.getUerRepair(vo);
        return Result.success(repair);
    }
    
    @PostMapping("/deleteRepair")
    public Result deleteRepair(@RequestBody String repairId){
        return repairService.deleteRepair(repairId);
    }
}
