package com.xinbao.mmbiz.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {

    private String id;


    private String roleName;


    private String roleCode;


    private String roleType;


    private String openFlag;


    private String deleteFlag;


    private String createUser;


    private Date createDatetime;


    private String updateUser;


    private Date updateDatetime;


    private String description;


    private String remark;


    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getRoleName() {
        return roleName;
    }


    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }


    public String getRoleCode() {
        return roleCode;
    }


    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }


    public String getRoleType() {
        return roleType;
    }


    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }


    public String getOpenFlag() {
        return openFlag;
    }


    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag == null ? null : openFlag.trim();
    }


    public String getDeleteFlag() {
        return deleteFlag;
    }


    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
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


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        sb.append(", roleName=").append(roleName);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleType=").append(roleType);
        sb.append(", openFlag=").append(openFlag);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", description=").append(description);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}