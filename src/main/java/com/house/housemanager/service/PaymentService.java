package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Payment;
import com.house.housemanager.vo.request.GetUserPayVo;
import com.house.housemanager.vo.request.PayMentRequestVo;
import com.house.housemanager.vo.request.PayVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PaymentService {
    PageInfo getPayment(PayMentRequestVo requestVo);
    
    int insertPayment(Payment payment);
    
    Result updatePayment(PayVo payment);
    
    PageInfo getUserPay(GetUserPayVo vo);
}
