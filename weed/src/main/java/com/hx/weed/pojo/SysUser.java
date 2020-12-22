package com.hx.weed.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser implements Serializable {
    @Id
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 上一次登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 账号是否可用。默认为1（可用）
     */
    private Boolean enabled;

    /**
     * 是否过期。默认为1（没有过期）
     */
    @Column(name = "not_expired")
    private Boolean notExpired;

    /**
     * 账号是否锁定。默认为1（没有锁定）
     */
    @Column(name = "account_not_locked")
    private Boolean accountNotLocked;

    /**
     * 证书（密码）是否过期。默认为1（没有过期）
     */
    @Column(name = "credentials_not_expired")
    private Boolean credentialsNotExpired;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 修改人
     */
    @Column(name = "update_user")
    private Integer updateUser;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取上一次登录时间
     *
     * @return last_login_time - 上一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置上一次登录时间
     *
     * @param lastLoginTime 上一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取账号是否可用。默认为1（可用）
     *
     * @return enabled - 账号是否可用。默认为1（可用）
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置账号是否可用。默认为1（可用）
     *
     * @param enabled 账号是否可用。默认为1（可用）
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取是否过期。默认为1（没有过期）
     *
     * @return not_expired - 是否过期。默认为1（没有过期）
     */
    public Boolean getNotExpired() {
        return notExpired;
    }

    /**
     * 设置是否过期。默认为1（没有过期）
     *
     * @param notExpired 是否过期。默认为1（没有过期）
     */
    public void setNotExpired(Boolean notExpired) {
        this.notExpired = notExpired;
    }

    /**
     * 获取账号是否锁定。默认为1（没有锁定）
     *
     * @return account_not_locked - 账号是否锁定。默认为1（没有锁定）
     */
    public Boolean getAccountNotLocked() {
        return accountNotLocked;
    }

    /**
     * 设置账号是否锁定。默认为1（没有锁定）
     *
     * @param accountNotLocked 账号是否锁定。默认为1（没有锁定）
     */
    public void setAccountNotLocked(Boolean accountNotLocked) {
        this.accountNotLocked = accountNotLocked;
    }

    /**
     * 获取证书（密码）是否过期。默认为1（没有过期）
     *
     * @return credentials_not_expired - 证书（密码）是否过期。默认为1（没有过期）
     */
    public Boolean getCredentialsNotExpired() {
        return credentialsNotExpired;
    }

    /**
     * 设置证书（密码）是否过期。默认为1（没有过期）
     *
     * @param credentialsNotExpired 证书（密码）是否过期。默认为1（没有过期）
     */
    public void setCredentialsNotExpired(Boolean credentialsNotExpired) {
        this.credentialsNotExpired = credentialsNotExpired;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改人
     *
     * @return update_user - 修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改人
     *
     * @param updateUser 修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", enabled=").append(enabled);
        sb.append(", notExpired=").append(notExpired);
        sb.append(", accountNotLocked=").append(accountNotLocked);
        sb.append(", credentialsNotExpired=").append(credentialsNotExpired);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append("]");
        return sb.toString();
    }
}