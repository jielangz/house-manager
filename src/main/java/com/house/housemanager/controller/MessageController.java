package com.house.housemanager.controller;

import com.house.housemanager.utill.ConcurrentHashMapUtil;
import com.house.housemanager.utill.SMSUtils;
import com.house.housemanager.utill.ValidateCodeUtils;
import com.house.housemanager.vo.request.SendCodeMsgVo;
import com.house.housemanager.vo.response.Result;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

@RestController
@CrossOrigin
public class MessageController {
    /**
     * 发送手机短信验证码
     * @return
     */
    @PostMapping("/sendCodeMsg")
    public Result sendMsg(@RequestBody SendCodeMsgVo vo) throws Exception {
        //获取手机号
        String phone = vo.getUserPhone();
        if(StringUtils.isNotEmpty(phone)){
            //生成随机的4位验证码
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            
            //调用阿里云提供的短信服务API完成发送短信
//            SMSUtils.sendCodeMessage("租客管理","SMS_465921046",phone,code);
            com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(code));
            //将生成的验证码保存到redis中，并且设置为5分钟
            ConcurrentHashMapUtil.put(phone,code);
            
            return Result.success("手机验证码短信发送成功");
        }
        
        return Result.error("短信发送失败");
    }
}
