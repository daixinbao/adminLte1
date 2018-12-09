package com.xinbao.mmbiz.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysConfig implements Serializable {

    private String id;


    private String paramName;


    private String createUser;


    private Date createDatetime;


    private String updateUser;


    private Date updateDatetime;


    private String paramDesc;


    private String paramValue;


    private String remark;


    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getParamName() {
        return paramName;
    }


    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }


    public String getCreateUser() {
        return createUser;
    }


    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }


    public Date getCreateDatetime() {
        return createDatetime;
    }


    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }


    public String getUpdateUser() {
        return updateUser;
    }


    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }


    public Date getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


    public String getParamDesc() {
        return paramDesc;
    }


    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }


    public String getParamValue() {
        return paramValue;
    }


    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }


    public String getRemark() {
        return remark;
    }


    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", paramName=").append(paramName);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", paramDesc=").append(paramDesc);
        sb.append(", paramValue=").append(paramValue);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}