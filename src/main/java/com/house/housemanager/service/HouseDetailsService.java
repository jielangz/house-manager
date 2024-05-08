package com.house.housemanager.service;

import com.house.housemanager.model.HouseDetails;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HouseDetailsService {
    HouseDetails getHouseDetails(HouseDetails houseDetails);
    
    int insertHouseDetails(HouseDetails houseDetails);
    
    int updateHouseDetails(HouseDetails houseDetails);
}
