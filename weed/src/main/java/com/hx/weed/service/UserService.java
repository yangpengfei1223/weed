package com.hx.weed.service;

import com.hx.weed.pojo.SysUser;
import org.springframework.stereotype.Service;

public interface UserService {
    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    SysUser selectByName(String userName);

    void update(SysUser sysUser);
}
