package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.UserRent;
import com.house.housemanager.vo.request.GetUserRentVo;
import com.house.housemanager.vo.request.InsertUserRentVo;
import com.house.housemanager.vo.request.UpdateUserRentVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserRentService {
    PageInfo getUserRent(GetUserRentVo getUserRentVo);
    
    Result insertUserRent(InsertUserRentVo insertUserRentVo);
    
    Result updateUserRent(UpdateUserRentVo updateUserRentVo);
}
