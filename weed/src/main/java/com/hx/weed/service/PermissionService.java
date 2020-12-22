package com.hx.weed.service;

import com.hx.weed.pojo.SysPermission;

import java.util.List;

public interface PermissionService {
    /**
     * 查询用户的权限列表
     *
     * @param userId
     * @return
     */
    List<SysPermission> selectListByUser(Integer userId);


    List<SysPermission> selectListByPath(String requestUrl);
}
