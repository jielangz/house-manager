package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Repair;
import com.house.housemanager.service.RepairService;
import com.house.housemanager.vo.request.GetRepairVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public Result insertRepair(@RequestBody Repair repair){
        return repairService.insertRepair(repair);
    }
    
    @PostMapping("/updateRepair")
    public Result updateRepair(@RequestBody Repair repair){
        return repairService.updateRepair(repair);
    }
    
    @PostMapping("/repairSuccess")
    public Result repairSuccess(@RequestBody Repair repair){
        return repairService.repairSuccess(repair);
    }
}
