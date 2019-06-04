package com.cloud.live.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.live.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 14:51:05
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class TestController {


    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public JSONObject login(String userName,String password){
        return userService.login(userName,password);
    }

}
