package com.house.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.housemanager.mapper.PaymentMapper;
import com.house.housemanager.model.Payment;
import com.house.housemanager.model.PaymentExample;
import com.house.housemanager.service.PaymentService;
import com.house.housemanager.vo.request.PayMentRequestVo;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {
    
    @Resource
    private PaymentMapper paymentMapper;
    
    @Override
    public PageInfo getPayment(PayMentRequestVo requestVo) {
        // 开启分页查询
        PageHelper.startPage(requestVo.getPageNumPay(), requestVo.getPageSizePay());
        PaymentExample paymentExample = new PaymentExample();
//        paymentExample.setOrderByClause("");
        PaymentExample.Criteria criteria = paymentExample.createCriteria();
        if (!ObjectUtils.isEmpty(requestVo.getHouseId())){
            criteria.andHouseIdEqualTo(requestVo.getHouseId());
        }
        if (!ObjectUtils.isEmpty(requestVo.getUserId())){
            criteria.andUserIdEqualTo(requestVo.getUserId());
        }
        List<Payment> paymentList = paymentMapper.selectByExample(paymentExample);
        return PageInfo.of(paymentList);
    }
    
    @Override
    public int insertPayment(Payment payment) {
        return 0;
    }
    
    @Override
    public int updatePayment(Payment payment) {
        return 0;
    }
}
