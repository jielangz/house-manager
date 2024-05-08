package com.house.housemanager.service;

import com.house.housemanager.vo.request.ManagerLoginRequestVo;
import com.house.housemanager.vo.request.UserLoginRequestVo;
import com.house.housemanager.vo.response.Result;

public interface LoginService {
    
    Result managerLogin(ManagerLoginRequestVo managerLoginRequestVo);
    
    Result userLogin(UserLoginRequestVo requestVo);
}
