package com.house.housemanager.controller;

import com.house.housemanager.model.HouseDetails;
import com.house.housemanager.model.Manager;
import com.house.housemanager.service.HouseDetailsService;
import com.house.housemanager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ManagerController {
    
    @Autowired
    private ManagerService managerService;
    
    @PostMapping("/getManager")
    public List<Manager> getManager(@RequestBody Manager manager){
        return managerService.getManager(manager);
    }
    
    @PostMapping("/insertManager")
    public int insertHouseDetails(@RequestBody Manager manager){
        return managerService.insertManager(manager);
    }
    
    @PostMapping("/updateManager")
    public int updateHouseDetails(@RequestBody Manager manager){
        return managerService.updateManager(manager);
    }
}
