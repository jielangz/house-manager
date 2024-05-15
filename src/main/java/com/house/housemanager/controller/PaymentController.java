package com.house.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.house.housemanager.model.Payment;
import com.house.housemanager.service.PaymentService;
import com.house.housemanager.vo.request.GetUserPayVo;
import com.house.housemanager.vo.request.PayMentRequestVo;
import com.house.housemanager.vo.request.PayVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PaymentController {
    
    @Autowired
    private PaymentService paymentService;
    
    @GetMapping("/getpayment")
    public Result getPayment(PayMentRequestVo payMentRequestVo){
        PageInfo pageInfo = paymentService.getPayment(payMentRequestVo);
        return Result.success(pageInfo);
    }
    
    @PostMapping("/insertpayment")
    public int insertPayment(@RequestBody Payment payment){
        return paymentService.insertPayment(payment);
    }
    
    @PostMapping("/pay")
    public Result updatePayment(@RequestBody PayVo payment){
        return paymentService.updatePayment(payment);
    }
    
    @PostMapping("/getUserPay")
    public Result getUserPay(@RequestBody GetUserPayVo vo){
        if (ObjectUtils.isEmpty(vo.getUserRent())){
            return Result.error("请先登录");
        }
        PageInfo pageInfo = paymentService.getUserPay(vo);
        return Result.success(pageInfo);
    }
}
