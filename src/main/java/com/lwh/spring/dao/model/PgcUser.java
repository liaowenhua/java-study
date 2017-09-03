package com.lwh.spring.dao.model;

import java.io.Serializable;
import java.util.Date;

public class PgcUser implements Serializable {
    private Integer uid;

    private Boolean status;

    private Boolean type;

    private Boolean userType;

    private String reason;

    private Date createTime;

    private Date updateTime;

    private Boolean source;

    private Boolean settleLevel;

    private Integer bossUid;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getUserType() {
        return userType;
    }

    public void setUserType(Boolean userType) {
        this.userType = userType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    public Boolean getSettleLevel() {
        return settleLevel;
    }

    public void setSettleLevel(Boolean settleLevel) {
        this.settleLevel = settleLevel;
    }

    public Integer getBossUid() {
        return bossUid;
    }

    public void setBossUid(Integer bossUid) {
        this.bossUid = bossUid;
    }
}