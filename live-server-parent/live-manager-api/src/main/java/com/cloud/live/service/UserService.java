package com.cloud.live.service;

import com.alibaba.fastjson.JSONObject;
import com.cloud.live.fallback.UserFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 14:43:57
 * @Description:
 */
@FeignClient(value = "live-service-server",fallback = UserFallback.class)
public interface UserService {

    @GetMapping("/servlet/login")
    JSONObject login(@RequestParam String userName, @RequestParam String password);


}
