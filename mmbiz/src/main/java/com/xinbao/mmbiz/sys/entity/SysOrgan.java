package com.xinbao.mmbiz.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysOrgan implements Serializable {

    private String id;


    private String organExtId;


    private String organName;


    private String type;


    private String parentId;


    private String code;


    private String openFlag;


    private String deleteFlag;


    private String createUser;


    private Date createDatetime;


    private String updateUser;


    private Date updateDatetime;


    private String taskFlag;


    private String organServiceId;


    private String fullCode;


    private String fullName;


    private String remark;


    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getOrganExtId() {
        return organExtId;
    }


    public void setOrganExtId(String organExtId) {
        this.organExtId = organExtId == null ? null : organExtId.trim();
    }


    public String getOrganName() {
        return organName;
    }


    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }


    public String getParentId() {
        return parentId;
    }


    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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


    public String getTaskFlag() {
        return taskFlag;
    }


    public void setTaskFlag(String taskFlag) {
        this.taskFlag = taskFlag == null ? null : taskFlag.trim();
    }


    public String getOrganServiceId() {
        return organServiceId;
    }


    public void setOrganServiceId(String organServiceId) {
        this.organServiceId = organServiceId == null ? null : organServiceId.trim();
    }


    public String getFullCode() {
        return fullCode;
    }


    public void setFullCode(String fullCode) {
        this.fullCode = fullCode == null ? null : fullCode.trim();
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
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
        sb.append(", organExtId=").append(organExtId);
        sb.append(", organName=").append(organName);
        sb.append(", type=").append(type);
        sb.append(", parentId=").append(parentId);
        sb.append(", code=").append(code);
        sb.append(", openFlag=").append(openFlag);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", taskFlag=").append(taskFlag);
        sb.append(", organServiceId=").append(organServiceId);
        sb.append(", fullCode=").append(fullCode);
        sb.append(", fullName=").append(fullName);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}