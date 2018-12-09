package com.xinbao.mmbiz.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysResource implements Serializable {

    private String id;


    private String resourceName;


    private String resourceCode;


    private String parentId;


    private Short resourceLevel;


    private Short sort;


    private String openFlag;


    private String resourceType;


    private String deleteFlag;


    private String createUser;


    private Date createDatetime;


    private String updateUser;


    private Date updateDatetime;


    private String resourceHtml;


    private String remark;


    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getResourceName() {
        return resourceName;
    }


    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }


    public String getResourceCode() {
        return resourceCode;
    }


    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }


    public String getParentId() {
        return parentId;
    }


    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }


    public Short getResourceLevel() {
        return resourceLevel;
    }


    public void setResourceLevel(Short resourceLevel) {
        this.resourceLevel = resourceLevel;
    }


    public Short getSort() {
        return sort;
    }


    public void setSort(Short sort) {
        this.sort = sort;
    }


    public String getOpenFlag() {
        return openFlag;
    }


    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag == null ? null : openFlag.trim();
    }


    public String getResourceType() {
        return resourceType;
    }


    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
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


    public String getResourceHtml() {
        return resourceHtml;
    }


    public void setResourceHtml(String resourceHtml) {
        this.resourceHtml = resourceHtml == null ? null : resourceHtml.trim();
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
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourceCode=").append(resourceCode);
        sb.append(", parentId=").append(parentId);
        sb.append(", resourceLevel=").append(resourceLevel);
        sb.append(", sort=").append(sort);
        sb.append(", openFlag=").append(openFlag);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", resourceHtml=").append(resourceHtml);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}