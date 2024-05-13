package com.house.housemanager.controller;

import com.house.housemanager.mapper.ManagerMapper;
import com.house.housemanager.mapper.UserRentMapper;
import com.house.housemanager.model.Manager;
import com.house.housemanager.model.ManagerExample;
import com.house.housemanager.model.UserRent;
import com.house.housemanager.model.UserRentExample;
import com.house.housemanager.utill.ConcurrentHashMapUtil;
import com.house.housemanager.vo.request.ManagerLoginRequestVo;
import com.house.housemanager.vo.request.UserLoginRequestVo;
import com.house.housemanager.vo.response.Result;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin
public class LoginController {
    @Resource
    private ManagerMapper managerMapper;
    
    @Resource
    private UserRentMapper userRentMapper;
    
    @PostMapping("managerLogin")
    public Result managerLogin(@RequestBody ManagerLoginRequestVo requestVo){
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
    
    @PostMapping("userLogin")
    public Result userLogin(@RequestBody UserLoginRequestVo requestVo){
        if (requestVo.getUserName() == null || "".equals(requestVo.getUserName())) {
            return Result.error("姓名不能为空");
        }
        if (requestVo.getUserPhone() == null || "".equals(requestVo.getUserPhone())) {
            return Result.error("电话号码不能为空");
        }
        if (requestVo.getCode() == null || "".equals(requestVo.getCode())) {
            return Result.error("验证码不能为空");
        }
//        String code = (String) ConcurrentHashMapUtil.get(requestVo.getUserPhone());
//        if (!requestVo.getCode().equals(code)){
//            return Result.error("验证码错误");
//        }
        UserRentExample userRentExample = new UserRentExample();
        userRentExample.createCriteria().andUserNameEqualTo(requestVo.getUserName()).andUserPhoneEqualTo(requestVo.getUserPhone());
        List<UserRent> userRentList = userRentMapper.selectByExample(userRentExample);
        if (!ObjectUtils.isEmpty(userRentList)){
        
        }
        return Result.success(userRentList.get(0));
    }
}
