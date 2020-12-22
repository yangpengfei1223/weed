package com.hx.weed.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sys_permission")
public class SysPermission implements Serializable {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 权限code
     */
    @Column(name = "permission_code")
    private String permissionCode;

    /**
     * 权限名
     */
    @Column(name = "permission_name")
    private String permissionName;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限code
     *
     * @return permission_code - 权限code
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * 设置权限code
     *
     * @param permissionCode 权限code
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    /**
     * 获取权限名
     *
     * @return permission_name - 权限名
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 设置权限名
     *
     * @param permissionName 权限名
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionCode=").append(permissionCode);
        sb.append(", permissionName=").append(permissionName);
        sb.append("]");
        return sb.toString();
    }
}