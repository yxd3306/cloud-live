package com.cloud.live.service;

import com.cloud.live.pojo.User;
import com.cloud.live.vo.UserVo;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 15:02:34
 * @Description:
 */
public interface UserService {
    UserVo login(String userName, String password);
}
