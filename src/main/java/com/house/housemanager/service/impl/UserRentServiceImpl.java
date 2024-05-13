package com.house.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.housemanager.mapper.HouseMapper;
import com.house.housemanager.mapper.PaymentMapper;
import com.house.housemanager.mapper.UserRentMapper;
import com.house.housemanager.model.*;
import com.house.housemanager.service.UserRentService;
import com.house.housemanager.vo.request.GetUserRentVo;
import com.house.housemanager.vo.request.InsertUserRentVo;
import com.house.housemanager.vo.request.UpdateUserRentVo;
import com.house.housemanager.vo.response.Result;
import com.house.housemanager.vo.response.UserRentVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserRentServiceImpl implements UserRentService {
    
    private static final SimpleDateFormat DATE_FOR = new SimpleDateFormat("yyyy-MM-dd");
    
    
    @Resource private UserRentMapper userRentMapper;
    
    @Resource private HouseMapper houseMapper;
    
    @Resource private PaymentMapper paymentMapper;
    
    @Override
    public PageInfo getUserRent(GetUserRentVo getUserRentVo) {
    
        // 开启分页查询
        PageHelper.startPage(getUserRentVo.getPageNum(), getUserRentVo.getPageSize());
        // 接下来的查询会自动按照当前开启的分页设置来查询
        UserRentExample userRentExample = new UserRentExample();
        UserRentExample.Criteria criteria = userRentExample.createCriteria();
        if (!ObjectUtils.isEmpty(getUserRentVo.getUserName())){
            criteria.andUserNameEqualTo(getUserRentVo.getUserName());
        }
        if (!ObjectUtils.isEmpty(getUserRentVo.getUserPhone())){
            criteria.andUserPhoneEqualTo(getUserRentVo.getUserPhone());
        }
        List<UserRent> userRentList = userRentMapper.selectByExample(userRentExample);
        List<UserRentVo> userRentVoList = new ArrayList<>();
        for (UserRent userRent : userRentList) {
            UserRentVo userRentVo = new UserRentVo();
            BeanUtils.copyProperties(userRent,userRentVo);
            House house = houseMapper.selectByPrimaryKey(userRent.getHouseId());
            if (!ObjectUtils.isEmpty(house)){
                userRentVo.setHouseName(house.getHouserName());
            }
            userRentVoList.add(userRentVo);
        }
        
        return PageInfo.of(userRentVoList);
    }
    
    @Override
    public Result insertUserRent(InsertUserRentVo insertUserRentVo) {
        // 修改房屋状态
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdEqualTo(insertUserRentVo.getHouseId());
        House house = houseMapper.selectByExample(houseExample).get(0);
        house.setRentFlag(true);
        house.setRentBeginDate(insertUserRentVo.getRentBeginDate());
        house.setRentEndDate(insertUserRentVo.getRentEndDate());
        houseMapper.updateByExampleSelective(house,houseExample);
        
        UserRent userRent = new UserRent();
        BeanUtils.copyProperties(insertUserRentVo,userRent);
        String uuid = UUID.randomUUID().toString().replace("-", "");
        userRent.setUserId(uuid);
        userRent.setHouseId(house.getHouseId());
        userRent.setHouseCost(house.getHouseCast());
        userRentMapper.insert(userRent);
        // 新增房租信息
        insertPayment(insertUserRentVo.getRentBeginDate(),insertUserRentVo.getRentEndDate(),uuid,house.getHouseId(),house.getHouseCast());
        return Result.success();
    }
    
    @Override
    public Result updateUserRent(UpdateUserRentVo updateUserRentVo) {
        UserRentExample userRentExample = new UserRentExample();
        userRentExample.createCriteria().andUserIdEqualTo(updateUserRentVo.getUserId());
        List<UserRent> userRentList = userRentMapper.selectByExample(userRentExample);
        if (ObjectUtils.isEmpty(userRentList)){
            return Result.error("修改错误");
        }
        UserRent userRent = new UserRent();
        userRent.setHouseId(updateUserRentVo.getHouseId());
        userRent.setRentBeginDate(updateUserRentVo.getRentBeginDate());
        userRent.setRentEndDate(updateUserRentVo.getRentEndDate());
        userRentMapper.updateByExampleSelective(userRent,userRentExample);
    
        String houseId = userRentList.get(0).getHouseId();
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdEqualTo(houseId);
        House house = new House();
        house.setRentFlag(false);
        house.setRentBeginDate(new Date());
        house.setRentEndDate(new Date());
        houseMapper.updateByExampleSelective(house,houseExample);
        House house1 = houseMapper.selectByExample(houseExample).get(0);
        //修改新租的房屋
        House updateHouse = new House();
        updateHouse.setRentFlag(true);
        updateHouse.setRentBeginDate(updateUserRentVo.getRentBeginDate());
        updateHouse.setRentEndDate(updateUserRentVo.getRentEndDate());
        HouseExample insertHouseExample = new HouseExample();
        insertHouseExample.createCriteria().andHouseIdEqualTo(updateUserRentVo.getHouseId());
        houseMapper.updateByExampleSelective(updateHouse,insertHouseExample);
        House insertHouse = houseMapper.selectByExample(insertHouseExample).get(0);
        //删除未支付房租
        PaymentExample paymentExample = new PaymentExample();
        paymentExample.createCriteria().andHouseIdEqualTo(house1.getHouseId()).andUserIdEqualTo(updateUserRentVo.getUserId())
                .andPayFlagEqualTo(false);
        paymentMapper.deleteByExample(paymentExample);
        //新增房租缴纳
        insertPayment(updateUserRentVo.getRentBeginDate(),updateUserRentVo.getRentEndDate(),updateUserRentVo.getUserId(),updateUserRentVo.getHouseId(),insertHouse.getHouseCast());
        return Result.success();
    }
    
    public void insertPayment(Date begin, Date end, String userId, String HouseId, BigDecimal houseCast){
        Payment payment = new Payment();
        payment.setUserId(userId);
        payment.setHouseId(HouseId);
        payment.setPayFlag(false);
        payment.setPayMoney(BigDecimal.valueOf(0));
        payment.setHouseCast(houseCast);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(begin);
        // 一个月为一期房租，每月月底作为缴纳截至日期
        while (calendar.getTime().before(end)) {
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            Date endOfMonth = calendar.getTime();
            String format = DATE_FOR.format(endOfMonth);
            Date date = java.sql.Date.valueOf(format);
            payment.setPayId(UUID.randomUUID().toString().replace("-", ""));
            payment.setPayLimitDate(date);
            paymentMapper.insert(payment);
        }
    }
}
