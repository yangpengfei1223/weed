package com.hx.weed.service.Impl;

import com.hx.weed.mapper.PermissionMapper;
import com.hx.weed.pojo.SysPermission;
import com.hx.weed.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<SysPermission> selectListByUser(Integer userId) {
        return permissionMapper.selectListByUser(userId);
    }

    @Override
    public List<SysPermission> selectListByPath(String requestUrl) {
        return permissionMapper.selectListByPath(requestUrl);
    }
}
