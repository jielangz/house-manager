package com.house.housemanager.service.impl;

import com.house.housemanager.mapper.ManagerMapper;
import com.house.housemanager.mapper.UserRentMapper;
import com.house.housemanager.model.Manager;
import com.house.housemanager.model.ManagerExample;
import com.house.housemanager.model.UserRentExample;
import com.house.housemanager.service.LoginService;
import com.house.housemanager.utill.ConcurrentHashMapUtil;
import com.house.housemanager.vo.request.ManagerLoginRequestVo;
import com.house.housemanager.vo.request.UserLoginRequestVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    
    @Resource
    private ManagerMapper managerMapper;
    
    @Resource
    private UserRentMapper userRentMapper;
    
    @Override
    public Result managerLogin(ManagerLoginRequestVo requestVo) {
        if (requestVo.getManagerName() == null || "".equals(requestVo.getManagerName())) {
            return Result.error("用户名不能为空");
        }
        if (requestVo.getManagerPassword() == null || "".equals(requestVo.getManagerPassword())) {
            return Result.error("密码不能为空");
        }
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andManagerNameEqualTo(requestVo.getManagerName()).andManagerPasswordEqualTo(requestVo.getManagerPassword());
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        if (ObjectUtils.isEmpty(managers)) {
            return Result.error("账号密码错误");
        }
        // 如果查出来了有，那说明确实有这个管理员，而且输入的用户名和密码都对；
        return Result.success(managers.get(0));
    }
    
    @Override
    public Result userLogin(UserLoginRequestVo requestVo) {
        if (requestVo.getUserName() == null || "".equals(requestVo.getUserName())) {
            return Result.error("姓名不能为空");
        }
        if (requestVo.getUserPhone() == null || "".equals(requestVo.getUserPhone())) {
            return Result.error("电话号码不能为空");
        }
        if (requestVo.getCode() == null || "".equals(requestVo.getCode())) {
            return Result.error("验证码不能为空");
        }
        ConcurrentHashMapUtil.get(requestVo.getUserPhone());
        if (!requestVo.getCode().equals("1234")){
            return Result.error("验证码错误");
        }
        UserRentExample userRentExample = new UserRentExample();
        userRentExample.createCriteria().andUserNameEqualTo(requestVo.getUserName()).andUserPhoneEqualTo(requestVo.getUserPhone());
        
        return Result.success();
    }
}
