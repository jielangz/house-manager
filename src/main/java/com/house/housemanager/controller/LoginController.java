package com.house.housemanager.controller;

import com.house.housemanager.service.LoginService;
import com.house.housemanager.vo.request.ManagerLoginRequestVo;
import com.house.housemanager.vo.request.UserLoginRequestVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService loginService;
    
    @PostMapping("managerLogin")
    public Result managerLogin(@RequestBody ManagerLoginRequestVo managerLoginRequestVo){
        return loginService.managerLogin(managerLoginRequestVo);
    }
    
    @PostMapping("userLogin")
    public Result userLogin(@RequestBody UserLoginRequestVo requestVo){
        return loginService.userLogin(requestVo);
    }
}
