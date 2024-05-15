package com.house.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.housemanager.mapper.HouseDetailsMapper;
import com.house.housemanager.mapper.HouseMapper;
import com.house.housemanager.mapper.PaymentMapper;
import com.house.housemanager.model.*;
import com.house.housemanager.service.HouseService;
import com.house.housemanager.vo.request.GetHouseVo;
import com.house.housemanager.vo.request.InsertHouseVo;
import com.house.housemanager.vo.response.HouseVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HouseServiceImpl implements HouseService {
    
    @Resource private HouseMapper houseMapper;
    
    @Resource private HouseDetailsMapper houseDetailsMapper;
    
    @Resource private PaymentMapper paymentMapper;
    
    @Override
    public PageInfo getHouse(GetHouseVo getHouseVo) {
    
        // 开启分页查询
        PageHelper.startPage(getHouseVo.getPageNum(), getHouseVo.getPageSize());
        HouseExample houseExample = new HouseExample();
        HouseExample.Criteria criteria = houseExample.createCriteria();
        if (!ObjectUtils.isEmpty(getHouseVo.getHouserName())){
            criteria.andHouserNameEqualTo(getHouseVo.getHouserName());
        }
        if (!ObjectUtils.isEmpty(getHouseVo.getRentFlag())){
            criteria.andRentFlagEqualTo(getHouseVo.getRentFlag());
        }
        List<HouseVo> houseVoList = new ArrayList<>();
        List<House> houses = houseMapper.selectByExample(houseExample);
        if(ObjectUtils.isEmpty(houses)){
            return PageInfo.of(houseVoList);
        }
        List<String> houseIdList = houses.stream().map(House::getHouseId).collect(Collectors.toList());
        HouseDetailsExample houseDetailsExample = new HouseDetailsExample();
        houseDetailsExample.createCriteria().andHouseIdIn(houseIdList);
        List<HouseDetails> houseDetailsList = houseDetailsMapper.selectByExample(houseDetailsExample);
        Map<String, HouseDetails> houseDetailsMap = houseDetailsList.stream().collect(Collectors.toMap(HouseDetails::getHouseId, item -> item));
    
        PaymentExample paymentExample = new PaymentExample();
        paymentExample.createCriteria().andPayFlagEqualTo(false).andPayLimitDateLessThan(new Date());
        List<Payment> paymentList = paymentMapper.selectByExample(paymentExample);
        Map<String,Boolean> map = paymentList.stream().collect(Collectors.toMap(Payment::getHouseId,Payment::getPayFlag));
        
        for (House house : houses) {
            HouseVo houseVo = new HouseVo();
            BeanUtils.copyProperties(house,houseVo);
            if (!ObjectUtils.isEmpty(map.get(houseVo.getHouseId()))){
                houseVo.setPayFlag(false);
            }else {
                houseVo.setPayFlag(true);
            }
            HouseDetails houseDetails = houseDetailsMap.get(houseVo.getHouseId());
            if (!ObjectUtils.isEmpty(houseDetails)){
                houseVo.setBedFlag(houseDetails.getBedFlag());
                houseVo.setSofaFlag(houseDetails.getSofaFlag());
                houseVo.setTableFlag(houseDetails.getTableFlag());
                houseVo.setClosetFlag(houseDetails.getClosetFlag());
                houseVo.setRoomNumber(houseDetails.getRoomNumber());
                houseVo.setOtherDetails(houseDetails.getOtherDetails());
                houseVo.setRestRoomFlag(houseDetails.getRestRoomFlag());
            }
            houseVoList.add(houseVo);
        }
        return PageInfo.of(houseVoList);
    }
    
    @Override
    public Result insertHouse(InsertHouseVo houseVo) {
        House house = new House();
        BeanUtils.copyProperties(houseVo,house);
        house.setHouseId(UUID.randomUUID().toString().replace("-", ""));
        houseMapper.insertSelective(house);
        
        HouseDetails houseDetails = new HouseDetails();
        BeanUtils.copyProperties(houseVo,houseDetails);
        houseDetails.setHouseDetailsId(UUID.randomUUID().toString().replace("-", ""));
        houseDetails.setHouseId(house.getHouseId());
        houseDetailsMapper.insertSelective(houseDetails);
        return Result.success();
    }
    
    @Override
    public Result updateHouse(InsertHouseVo houseVo) {
        
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdEqualTo(houseVo.getHouseId());
        House house = new House();
        BeanUtils.copyProperties(houseVo,house);
        houseMapper.updateByExampleSelective(house,houseExample);
    
        HouseDetailsExample houseDetailsExample = new HouseDetailsExample();
        houseDetailsExample.createCriteria().andHouseIdEqualTo(houseVo.getHouseId());
        HouseDetails houseDetails = new HouseDetails();
        BeanUtils.copyProperties(houseVo,houseDetails);
        houseDetailsMapper.updateByExampleSelective(houseDetails,houseDetailsExample);
        
        return Result.success();
    }
    
    @Override
    public Result getNotHouseName() {
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andRentFlagEqualTo(false);
        List<House> houses = houseMapper.selectByExample(houseExample);
        return Result.success(houses);
    }
    
    @Override
    public Result delHouse(String houseId) {
        houseMapper.deleteByPrimaryKey(houseId);
        houseDetailsMapper.deleteByPrimaryKey(houseId);
        return Result.success();
    }
}
