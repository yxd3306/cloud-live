package com.cloud.live.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.live.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    User login(String userName, String password);

}
