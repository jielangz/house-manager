package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Complain;
import com.house.housemanager.service.ComplainService;
import com.house.housemanager.vo.request.GetComplainVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public Result insertComplain(@RequestBody Complain complain){
        return complainService.insertComplain(complain);
    }
}
