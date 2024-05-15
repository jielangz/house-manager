package com.house.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.housemanager.mapper.HouseMapper;
import com.house.housemanager.mapper.PaymentMapper;
import com.house.housemanager.model.*;
import com.house.housemanager.service.PaymentService;
import com.house.housemanager.vo.request.GetUserPayVo;
import com.house.housemanager.vo.request.PayMentRequestVo;
import com.house.housemanager.vo.request.PayVo;
import com.house.housemanager.vo.response.Result;
import com.house.housemanager.vo.response.UserPayVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {
    
    @Resource
    private PaymentMapper paymentMapper;
    
    @Resource
    private HouseMapper houseMapper;
    
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
    @Transactional
    public Result updatePayment(PayVo vo) {
        PaymentExample paymentExample = new PaymentExample();
        paymentExample.createCriteria().andPayIdEqualTo(vo.getPayId());
        List<Payment> paymentList = paymentMapper.selectByExample(paymentExample);
        Payment payment = paymentList.get(0);
        BigDecimal needPay = payment.getHouseCast().subtract(payment.getPayMoney());
        if (needPay.compareTo(vo.getPayMoney()) < 0){
            return Result.error("支付金额大于未支付金额");
        }
        if (needPay.compareTo(vo.getPayMoney()) == 0){
            payment.setPayFlag(true);
            payment.setPayMoney(payment.getHouseCast());
        }
        if (needPay.compareTo(vo.getPayMoney()) > 0){
            payment.setPayFlag(false);
            payment.setPayMoney(payment.getPayMoney().add(vo.getPayMoney()));
        }
        int i = paymentMapper.updateByExampleSelective(payment, paymentExample);
        if (i <= 0){
            return Result.error("支付失败");
        }
        return Result.success("支付成功");
    }
    
    @Override
    public PageInfo getUserPay(GetUserPayVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        UserRent userRent = vo.getUserRent();
        String userId = userRent.getUserId();
        PaymentExample paymentExample = new PaymentExample();
        paymentExample.createCriteria().andUserIdEqualTo(userId);
        paymentExample.setOrderByClause("pay_limit_date");
        List<Payment> paymentList = paymentMapper.selectByExample(paymentExample);
        List<String> houseIds = paymentList.stream().map(Payment::getHouseId).collect(Collectors.toList());
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdIn(houseIds);
        List<House> houses = houseMapper.selectByExample(houseExample);
        Map<String, House> houseMap = houses.stream().collect(Collectors.toMap(House::getHouseId, item -> item));
        List<UserPayVo> userPayVoList = new ArrayList<>();
        for (Payment payment : paymentList) {
            UserPayVo userPayVo = new UserPayVo();
            House house = houseMap.get(payment.getHouseId());
            userPayVo.setPayId(payment.getPayId());
            userPayVo.setPayFlag(payment.getPayFlag());
            userPayVo.setPayMoney(payment.getPayMoney());
            userPayVo.setHouseCast(house.getHouseCast());
            userPayVo.setPayLimitDate(payment.getPayLimitDate());
            userPayVo.setHouseName(house.getHouserName());
            userPayVo.setNotPayMoney(house.getHouseCast().subtract(payment.getPayMoney()));
            userPayVoList.add(userPayVo);
        }
        return PageInfo.of(userPayVoList);
    }
}
