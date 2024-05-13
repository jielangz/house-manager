package com.house.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.housemanager.mapper.ComplainMapper;
import com.house.housemanager.mapper.UserRentMapper;
import com.house.housemanager.model.*;
import com.house.housemanager.service.ComplainService;
import com.house.housemanager.vo.request.GetComplainVo;
import com.house.housemanager.vo.request.GetUserComplainVo;
import com.house.housemanager.vo.request.InsertComplainVo;
import com.house.housemanager.vo.response.ComplainVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ComplainServiceImpl implements ComplainService {
    
    @Autowired
    private ComplainMapper complainMapper;
    
    @Resource private UserRentMapper userRentMapper;
    
    @Override
    public PageInfo getComplain(GetComplainVo getComplainVo) {
        // 开启分页查询
        PageHelper.startPage(getComplainVo.getPageNum(), getComplainVo.getPageSize());
        
        ComplainExample complainExample = new ComplainExample();
        ComplainExample.Criteria criteria = complainExample.createCriteria();
        if (!ObjectUtils.isEmpty(getComplainVo.getComplainStartDate()) && !ObjectUtils.isEmpty(getComplainVo.getComPlainEndDate())){
            criteria.andComplainDateBetween(getComplainVo.getComplainStartDate(),getComplainVo.getComPlainEndDate());
        }
        List<Complain> complains = complainMapper.selectByExample(complainExample);
        List<UserRent> userRentList = new ArrayList<>();
        if (!ObjectUtils.isEmpty(complains)){
            List<String> userIdList = complains.stream().map(Complain::getUserId).collect(Collectors.toList());
            UserRentExample userRentExample = new UserRentExample();
            userRentExample.createCriteria().andUserIdIn(userIdList);
            userRentList = userRentMapper.selectByExample(userRentExample);
        }
        Map<String, String> collect = userRentList.stream().collect(Collectors.toMap(UserRent::getHouseId, UserRent::getUserName));
        List<ComplainVo> complainVoList = new ArrayList<>();
        for (Complain complain : complains) {
            ComplainVo complainVo = new ComplainVo();
            BeanUtils.copyProperties(complain,complainVo);
            if (complainVo.getCryptonymFlag()){
                complainVo.setUserName("匿名");
            }else {
                complainVo.setUserName(collect.get(complainVo.getUserId()));
            }
            complainVoList.add(complainVo);
        }
        
        return PageInfo.of(complainVoList);
    }
    
    @Override
    public Result insertComplain(InsertComplainVo vo) {
        Complain complain = new Complain();
        complain.setComplainId(UUID.randomUUID().toString().replace("-", ""));
        complain.setComplainDate(new Date());
        complain.setComplainTontent(vo.getComplainTontent());
        complain.setUserId(vo.getUserRent().getUserId());
        complain.setCryptonymFlag(vo.getCryptonymFlag());
        complainMapper.insertSelective(complain);
        return Result.success();
    }
    
    @Override
    public PageInfo getUserComplain(GetUserComplainVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        ComplainExample complainExample = new ComplainExample();
        complainExample.createCriteria().andUserIdEqualTo(vo.getUserRent().getUserId());
        List<Complain> complains = complainMapper.selectByExample(complainExample);
    
        return PageInfo.of(complains);
    }
    
    @Override
    public Result deleteComplain(String complainId) {
        int i = complainMapper.deleteByPrimaryKey(complainId);
        if (i<=0){
            return Result.error("取消失败");
        }
        return Result.success("取消成功");
    }
}
