package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Complain;
import com.house.housemanager.model.House;
import com.house.housemanager.service.HouseService;
import com.house.housemanager.vo.request.GetHouseVo;
import com.house.housemanager.vo.request.InsertHouseVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
@CrossOrigin
public class HouseController {
    @Autowired
    private HouseService houseService;
    
    @GetMapping("/getHouse")
    public Result getHouse(GetHouseVo getHouseVo){
        PageInfo house = houseService.getHouse(getHouseVo);
        return Result.success(house);
    }
    
    @GetMapping("/getNotHouseName")
    public Result getNotHouseName(){
        return houseService.getNotHouseName();
    }
    
    @PostMapping("/insertHouse")
    public Result insertHouse(@RequestBody InsertHouseVo house){
        return houseService.insertHouse(house);
    }
    
    @PostMapping("/updateHouse")
    public Result updateHouse(@RequestBody InsertHouseVo house){
        return houseService.updateHouse(house);
    }
    
    @GetMapping("/delHouse")
    public Result delHouse(String houseId){
        return houseService.delHouse(houseId);
    }
}
