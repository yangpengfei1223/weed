package com.hx.weed.config.service;

import com.hx.weed.pojo.SysPermission;
import com.hx.weed.pojo.SysUser;
import com.hx.weed.service.PermissionService;
import com.hx.weed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //需要构造出 org.springframework.security.core.userdetails.User 对象并返回
        if(username == null || "".equals(username)){
            throw new RuntimeException("用户不能为空");
        }
        //根据用户名查询用户
        SysUser sysUser = userService.selectByName(username);
        if (sysUser == null){
            throw new RuntimeException("用户不存在");
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(sysUser != null){
            //获取该用户所拥有的权限
            List<SysPermission> permissions = permissionService.selectListByUser(sysUser.getId());
            //声明用户授权
            permissions.forEach(permission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getPermissionCode());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        return new User(sysUser.getAccount(),sysUser.getPassword(),sysUser.getEnabled(),sysUser.getNotExpired(),sysUser.getCredentialsNotExpired(),sysUser.getAccountNotLocked(),grantedAuthorities);
    }
}
