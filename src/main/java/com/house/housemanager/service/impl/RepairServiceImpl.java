package com.house.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.housemanager.mapper.HouseMapper;
import com.house.housemanager.mapper.RepairMapper;
import com.house.housemanager.mapper.UserRentMapper;
import com.house.housemanager.model.*;
import com.house.housemanager.service.RepairService;
import com.house.housemanager.vo.request.GetRepairVo;
import com.house.housemanager.vo.request.GetUserRepairVo;
import com.house.housemanager.vo.request.InsertUserRepair;
import com.house.housemanager.vo.response.RepairVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements RepairService {
    
    @Resource private RepairMapper repairMapper;
    
    @Resource private HouseMapper houseMapper;
    
    @Resource private UserRentMapper userRentMapper;
    
    @Override
    public PageInfo getRepair(GetRepairVo repairVo) {
        // 开启分页查询
        PageHelper.startPage(repairVo.getPageNum(), repairVo.getPageSize());
        RepairExample repairExample = new RepairExample();
        RepairExample.Criteria criteria = repairExample.createCriteria();
        if (!ObjectUtils.isEmpty(repairVo.getRepairFlag())){
            criteria.andRepairFlagEqualTo(repairVo.getRepairFlag());
        }
        List<Repair> repairs = repairMapper.selectByExample(repairExample);
        List<House> houses = new ArrayList<>();
        List<UserRent> userRentList = new ArrayList<>();
        if (!ObjectUtils.isEmpty(repairs)){
            List<String> houseIdList = repairs.stream().map(Repair::getHouseId).collect(Collectors.toList());
            HouseExample houseExample = new HouseExample();
            houseExample.createCriteria().andHouseIdIn(houseIdList);
            houses =  houseMapper.selectByExample(houseExample);
            List<String> userId = repairs.stream().map(Repair::getUserId).collect(Collectors.toList());
            UserRentExample userRentExample = new UserRentExample();
            userRentExample.createCriteria().andUserIdIn(userId);
            userRentList = userRentMapper.selectByExample(userRentExample);
        }
        
        Map<String, String> houseMap = houses.stream().collect(Collectors.toMap(House::getHouseId, House::getHouserName));
        Map<String, String> userRentMap = userRentList.stream().collect(Collectors.toMap(UserRent::getUserId, UserRent::getUserName));
        List<RepairVo> repairVos = new ArrayList<>();
        for (Repair repair : repairs) {
            RepairVo repairVo1 = new RepairVo();
            BeanUtils.copyProperties(repair,repairVo1);
            repairVo1.setHouseName(houseMap.get(repairVo1.getHouseId()));
            repairVo1.setUserName(userRentMap.get(repair.getUserId()));
            repairVos.add(repairVo1);
        }
        return PageInfo.of(repairVos);
    }
    
    @Override
    public Result insertRepair(InsertUserRepair vo) {
        Repair repair = new Repair();
        repair.setRepairId(UUID.randomUUID().toString().replace("-", ""));
        repair.setRepairFlag(false);
        repair.setRepairGoods(vo.getRepairGoods());
        repair.setHouseId(vo.getUserRent().getHouseId());
        repair.setUserId(vo.getUserRent().getUserId());
        repairMapper.insertSelective(repair);
        return Result.success();
    }
    
    @Override
    public Result updateRepair(Repair repair) {
        RepairExample repairExample = new RepairExample();
        repairExample.createCriteria().andRepairIdEqualTo(repair.getRepairId());
        repairMapper.updateByExampleSelective(repair,repairExample);
        return Result.success();
    }
    
    @Override
    public Result repairSuccess(Repair repair) {
        if (repair.getRepairFlag()){
            return Result.error("已经完成修复");
        }
        RepairExample repairExample = new RepairExample();
        repairExample.createCriteria().andRepairIdEqualTo(repair.getRepairId());
        repair.setRepairFlag(true);
        repairMapper.updateByExampleSelective(repair,repairExample);
        return Result.success("成功修复");
    }
    
    @Override
    public PageInfo getUerRepair(GetUserRepairVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        RepairExample repairExample = new RepairExample();
        repairExample.createCriteria().andUserIdEqualTo(vo.getUserRent().getUserId());
        List<Repair> repairs = repairMapper.selectByExample(repairExample);
        List<RepairVo> repairVoList = new ArrayList<>();
        List<House> houses = new ArrayList<>();
        if (!ObjectUtils.isEmpty(repairs)){
            List<String> houseIdList = repairs.stream().map(Repair::getHouseId).collect(Collectors.toList());
            HouseExample houseExample = new HouseExample();
            houseExample.createCriteria().andHouseIdIn(houseIdList);
            houses =  houseMapper.selectByExample(houseExample);
        }
        Map<String, String> houseMap = houses.stream().collect(Collectors.toMap(House::getHouseId, House::getHouserName));
        for (Repair repair : repairs) {
            RepairVo repairVo = new RepairVo();
            BeanUtils.copyProperties(repair,repairVo);
            repairVo.setHouseName(houseMap.get(repairVo.getHouseId()));
            repairVoList.add(repairVo);
        }
        return PageInfo.of(repairVoList);
    }
    
    @Override
    public Result deleteRepair(String repairId) {
        int i = repairMapper.deleteByPrimaryKey(repairId);
        if (i<=0){
            return Result.error("取消失败");
        }
        return Result.success("取消成功");
    }
}
