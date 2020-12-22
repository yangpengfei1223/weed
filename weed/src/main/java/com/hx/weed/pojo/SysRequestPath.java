package com.hx.weed.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sys_request_path")
public class SysRequestPath implements Serializable {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 请求路径
     */
    private String url;

    /**
     * 路径描述
     */
    private String description;

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
     * 获取请求路径
     *
     * @return url - 请求路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求路径
     *
     * @param url 请求路径
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取路径描述
     *
     * @return description - 路径描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置路径描述
     *
     * @param description 路径描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}