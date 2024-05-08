package com.house.housemanager.controller;

import com.house.housemanager.model.House;
import com.house.housemanager.model.HouseDetails;
import com.house.housemanager.service.HouseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HouseDetailsController {
    
    @Autowired
    private HouseDetailsService houseDetailsService;
    
    @PostMapping("/getHouseDetails")
    public HouseDetails getHouseDetails(@RequestBody HouseDetails houseDetails){
        return houseDetailsService.getHouseDetails(houseDetails);
    }
    
    @PostMapping("/insertHouseDetails")
    public int insertHouseDetails(@RequestBody HouseDetails houseDetails){
        return houseDetailsService.insertHouseDetails(houseDetails);
    }
    
    @PostMapping("/updateHouseDetails")
    public int updateHouseDetails(@RequestBody HouseDetails houseDetails){
        return houseDetailsService.updateHouseDetails(houseDetails);
    }
}
