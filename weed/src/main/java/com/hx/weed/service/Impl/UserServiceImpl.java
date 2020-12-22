package com.hx.weed.service.Impl;

import com.hx.weed.mapper.UserMapper;
import com.hx.weed.pojo.SysUser;
import com.hx.weed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public SysUser selectByName(String userName) {
        return userMapper.selectByName(userName);
    }

    @Override
    public void update(SysUser sysUser) {
        userMapper.updateByPrimaryKey(sysUser);
    }
}
