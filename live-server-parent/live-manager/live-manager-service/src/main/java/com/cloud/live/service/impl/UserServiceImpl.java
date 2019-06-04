package com.cloud.live.service.impl;

import com.cloud.live.common.util.DateUtil;
import com.cloud.live.mapper.UserMapper;
import com.cloud.live.pojo.User;
import com.cloud.live.service.UserService;
import com.cloud.live.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 15:02:44
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVo login(String userName, String password) {
        User user = userMapper.login(userName, password);
        UserVo userVo = new UserVo(user.getId(),user.getUserName(),user.getPassword(),user.getFullName(), DateUtil.dateToStringByDay(user.getCreateTime()));
        return userVo;
    }
}
