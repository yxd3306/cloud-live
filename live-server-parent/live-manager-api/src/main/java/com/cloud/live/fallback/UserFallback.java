package com.cloud.live.fallback;

import com.alibaba.fastjson.JSONObject;
import com.cloud.live.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 14:45:04
 * @Description: 用户服务熔断维护类
 */
@Component
@Slf4j
public class UserFallback implements UserService {
    @Override
    public JSONObject login(String userName, String password) {
        log.info("connection time out");
        return null;
    }
}
