package com.cloud.live.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.live.pojo.User;
import com.cloud.live.service.UserService;
import com.cloud.live.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 14:57:42
 * @Description:
 */
@RestController
@RequestMapping("/servlet")
public class TestController {

    @Autowired
    private UserService userService;


    @GetMapping("/login")
    public JSONObject login(String userName,String password){
        UserVo vo = userService.login(userName,password);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("msg","登陆成功");
        jsonObject.put("data",vo);
        return jsonObject;
    }

}
