package com.house.housemanager.service.impl;

import com.house.housemanager.model.Manager;
import com.house.housemanager.service.ManagerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {
    @Override
    public List<Manager> getManager(Manager manager) {
        return null;
    }
    
    @Override
    public int insertManager(Manager manager) {
        return 0;
    }
    
    @Override
    public int updateManager(Manager manager) {
        return 0;
    }
}
