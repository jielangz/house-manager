package com.house.housemanager.service;

import com.house.housemanager.model.Manager;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ManagerService {
    
    List<Manager> getManager(Manager manager);
    
    int insertManager(Manager manager);
    
    int updateManager(Manager manager);
}
