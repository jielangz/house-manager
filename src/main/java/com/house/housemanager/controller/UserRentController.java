package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.UserRent;
import com.house.housemanager.service.UserRentService;
import com.house.housemanager.vo.request.GetUserRentVo;
import com.house.housemanager.vo.request.InsertUserRentVo;
import com.house.housemanager.vo.request.UpdateUserRentVo;
import com.house.housemanager.vo.response.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/userRent")
public class UserRentController {
    
    @Autowired
    private UserRentService userRentService;
    
    @GetMapping("/getUserRent")
    public Result getUserRent(GetUserRentVo getUserRentVo){
        PageInfo userRent = userRentService.getUserRent(getUserRentVo);
        return Result.success(userRent);
    }
    
    @PostMapping("/insertUserRent")
    public Result insertUserRent(@RequestBody InsertUserRentVo insertUserRentVo){
        return userRentService.insertUserRent(insertUserRentVo);
    }
    
    @PostMapping("/updateUserRent")
    public Result updateUserRent(@RequestBody UpdateUserRentVo updateUserRentVo){
        return userRentService.updateUserRent(updateUserRentVo);
    }
}
