package com.house.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Payment;
import com.house.housemanager.vo.request.PayMentRequestVo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PaymentService {
    PageInfo getPayment(PayMentRequestVo requestVo);
    
    int insertPayment(Payment payment);
    
    int updatePayment(Payment payment);
}
