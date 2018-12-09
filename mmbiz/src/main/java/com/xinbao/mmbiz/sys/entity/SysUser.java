package com.xinbao.mmbiz.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {

    private String id;


    private String username;


    private String trueName;


    private String password;


    private String userMobile;


    private String userPhone;


    private String userEmail;


    private String userWorkId;


    private String userExtId;


    private String gender;


    private String openFlag;


    private String deleteFlag;


    private String createUser;


    private Date createDatetime;


    private String updateUser;


    private Date updateDatetime;


    private String remark;


    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }


    public String getTrueName() {
        return trueName;
    }


    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public String getUserMobile() {
        return userMobile;
    }


    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }


    public String getUserPhone() {
        return userPhone;
    }


    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }


    public String getUserEmail() {
        return userEmail;
    }


    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }


    public String getUserWorkId() {
        return userWorkId;
    }


    public void setUserWorkId(String userWorkId) {
        this.userWorkId = userWorkId == null ? null : userWorkId.trim();
    }


    public String getUserExtId() {
        return userExtId;
    }


    public void setUserExtId(String userExtId) {
        this.userExtId = userExtId == null ? null : userExtId.trim();
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
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
        sb.append(", username=").append(username);
        sb.append(", trueName=").append(trueName);
        sb.append(", password=").append(password);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userWorkId=").append(userWorkId);
        sb.append(", userExtId=").append(userExtId);
        sb.append(", gender=").append(gender);
        sb.append(", openFlag=").append(openFlag);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}