package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.House;
import com.house.housemanager.vo.request.GetHouseVo;
import com.house.housemanager.vo.request.InsertHouseVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HouseService {
    PageInfo getHouse(GetHouseVo getHouseVo);
    
    Result insertHouse(InsertHouseVo house);
    
    Result updateHouse(InsertHouseVo house);
    
    Result getNotHouseName();
    
    Result delHouse(String houseId);
}
