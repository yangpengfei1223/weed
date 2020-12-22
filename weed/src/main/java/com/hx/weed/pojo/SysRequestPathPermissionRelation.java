package com.hx.weed.pojo;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sys_request_path_permission_relation")
public class SysRequestPathPermissionRelation implements Serializable {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 请求路径id
     */
    @Column(name = "url_id")
    private Integer urlId;

    /**
     * 权限id
     */
    @Column(name = "permission_id")
    private Integer permissionId;

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
     * 获取请求路径id
     *
     * @return url_id - 请求路径id
     */
    public Integer getUrlId() {
        return urlId;
    }

    /**
     * 设置请求路径id
     *
     * @param urlId 请求路径id
     */
    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    /**
     * 获取权限id
     *
     * @return permission_id - 权限id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 设置权限id
     *
     * @param permissionId 权限id
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", urlId=").append(urlId);
        sb.append(", permissionId=").append(permissionId);
        sb.append("]");
        return sb.toString();
    }
}