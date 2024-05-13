package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Complain;
import com.house.housemanager.service.ComplainService;
import com.house.housemanager.vo.request.GetComplainVo;
import com.house.housemanager.vo.request.GetUserComplainVo;
import com.house.housemanager.vo.request.InsertComplainVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/complain")
public class ComplainController {
    
    @Autowired
    private ComplainService complainService;
    
    @GetMapping("/getComplain")
    public Result getComplain(@ModelAttribute GetComplainVo complainVo){
        PageInfo complain = complainService.getComplain(complainVo);
        return Result.success(complain);
    }
    
    @PostMapping("/insertComplain")
    public Result insertComplain(@RequestBody InsertComplainVo vo){
        if (ObjectUtils.isEmpty(vo.getUserRent())){
            return Result.error("请先登录");
        }
        return complainService.insertComplain(vo);
    }
    
    @PostMapping("/getUserComplain")
    public Result getUserComplain(@RequestBody GetUserComplainVo vo){
        if (ObjectUtils.isEmpty(vo.getUserRent())){
            return Result.error("请先登录");
        }
        PageInfo complain = complainService.getUserComplain(vo);
        return Result.success(complain);
    }
    
    @PostMapping("/deleteComplain")
    public Result deleteComplain(@RequestBody String complainId){
        return complainService.deleteComplain(complainId);
    }
}
