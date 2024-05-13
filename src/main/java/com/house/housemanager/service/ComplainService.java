package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Complain;
import com.house.housemanager.vo.request.GetComplainVo;
import com.house.housemanager.vo.request.GetUserComplainVo;
import com.house.housemanager.vo.request.InsertComplainVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ComplainService {
    PageInfo getComplain(GetComplainVo complain);
    
    Result insertComplain(InsertComplainVo vo);
    
    PageInfo getUserComplain(GetUserComplainVo vo);
    
    Result deleteComplain(String complainId);
}
