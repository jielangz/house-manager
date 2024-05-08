package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Complain;
import com.house.housemanager.vo.request.GetComplainVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ComplainService {
    PageInfo getComplain(GetComplainVo complain);
    
    Result insertComplain(Complain complain);
}
